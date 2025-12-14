library(ggplot2)

# Set pdf settings 
width = 1500
height = 1100
titlesize = 16

# Load Data + Prep #############################################################
data = read.csv("result_L_Single.csv", sep=";", header=TRUE)
data = rbind(data, read.csv("result_Staircase_Single.csv", sep=";", header = TRUE))
data = rbind(data, read.csv("result_Square_Single.csv", sep=";", header = TRUE))
data = rbind(data, read.csv("result_L_Equals.csv", sep=";", header = TRUE))
data = rbind(data, read.csv("result_Staircase_Equals.csv", sep=";", header = TRUE))
data = rbind(data, read.csv("result_Square_Equals.csv", sep=";", header = TRUE))
data = rbind(data, read.csv("result_L_Sum.csv", sep=";", header = TRUE))
data = rbind(data, read.csv("result_Staircase_Sum.csv", sep=";", header = TRUE))
data = rbind(data, read.csv("result_Square_Sum.csv", sep=";", header = TRUE))

# Create Factors ###############################################################
library(tidyr)
library(dplyr)

data <- data %>% separate(Condition, into = c("BoardType", "Constraint"), sep = "-")

data$BoardType = factor(data$BoardType, levels = c("L", "Staircase", "Square"))
data$Constraint = factor(data$Constraint, levels = c("Single", "Equals", "Sum"))

# Calculate Averages ###########################################################
data$Time = (data$Time1 + data$Time2 + data$Time3)/3
data$SearchNodes = (data$SearchNodes1 + data$SearchNodes2 + data$SearchNodes3)/3

# Aggregate Time by Board + Constraint Type ####################################
standard_error <- function(x) sd(x) / sqrt(length(x))

aggregated_time = aggregate(Time ~ BoardType + Constraint, FUN = mean, data = data)
aggregated_time$SD = aggregate(Time ~ BoardType + Constraint, FUN = sd, data = data)$Time
aggregated_time$SE = aggregate(Time ~ BoardType + Constraint, FUN = standard_error, data = data)$Time
print(aggregated_time)

# Plot Time ####################################################################
p = ggplot(aggregated_time, aes(x=Constraint, y=Time, fill = BoardType)) + 
  geom_bar(stat = "identity", position = position_dodge()) + 
  geom_errorbar(aes(ymin=Time-SE, ymax=Time+SE), width=.3, position = position_dodge(0.9)) +
  theme_bw() + theme(panel.grid.major = element_blank(),
                     panel.grid.minor = element_blank(),
                     legend.position = c(0.17,0.8), 
                     legend.title = element_text(size = 14),
                     legend.text = element_text(size = 14),
                     axis.text=element_text(size=14, color = "black"),
                     axis.title=element_text(size=titlesize)) +
  labs(y = "Mean Runtime in ms", x = "Constraint Condition") +
  scale_y_continuous(trans='log', breaks = c(1, 5, 50, 500, 5000, 50000), limits = c(1, 50000)) +
  scale_fill_manual(values=c("#51b3e6",
                             "#6bb234",
                             "#e769d1"))

ggsave("runtime_custom.pdf", path = "pics", width = width, height = height, 
       units = c("px"))

# Aggregate SearchNodes by Board + Constraint Type #############################
aggregated_nodes = aggregate(SearchNodes ~ BoardType + Constraint, FUN = mean, data = data)
aggregated_nodes$SD = aggregate(SearchNodes ~ BoardType + Constraint, FUN = sd, data = data)$SearchNodes
aggregated_nodes$SE = aggregate(SearchNodes ~ BoardType + Constraint, FUN = standard_error, data = data)$SearchNodes
print(aggregated_nodes)

# Plot Search Nodes ############################################################
p = ggplot(aggregated_nodes, aes(x=Constraint, y=SearchNodes, fill = BoardType)) + 
  geom_bar(stat = "identity", position = position_dodge()) + 
  geom_errorbar(aes(ymin=SearchNodes-SE, ymax=SearchNodes+SE), width=.3, position = position_dodge(0.9)) +
  theme_bw() + theme(panel.grid.major = element_blank(),
                     panel.grid.minor = element_blank(),
                     legend.position = c(0.16,0.8), 
                     legend.title = element_text(size = 14),
                     legend.text = element_text(size = 14),
                     axis.text=element_text(size=14, color = "black"),
                     axis.title=element_text(size=titlesize)) +
  labs(y = "Mean Amount Search Nodes", x = "Constraint Condition") +
  scale_y_continuous(trans='log', breaks = c(1, 5, 50, 500, 5000, 50000), limits = c(1, 50000)) +
  scale_fill_manual(values=c("#51b3e6",
                             "#6bb234",
                             "#e769d1"))
show(p)

ggsave("searchnodes_custom.pdf", path = "pics", width = width+150, height = height, 
      units = c("px"))
