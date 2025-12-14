library(ggplot2)

# Set pdf settings 
width = 1500
height = 1100
titlesize = 16

# Load Data + Prep #############################################################
data = read.csv("results_easy.csv", sep=";", header=TRUE)
data = rbind(data, read.csv("results_medium.csv", sep=";", header = TRUE))
data = rbind(data, read.csv("results_hard.csv", sep=";", header = TRUE))

data_nofactors <- data

# Create Factors 
data$Condition = factor(data$Condition, levels = c("Easy", "Medium", "Hard"))
data$nD = factor(data$nD, labels = c("4", "5-6", "5-6", "7-8", "7-8", "9-10", "9-10", "11-12", "11-12", "13-14", "13-14", "15-16", "15-16"), 
                   levels = c(4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16))

# Show distribution of Dominoes to place #######################################
print(table(data$nD))

################################# Time #########################################

# Scatterplot by amount Domino #################################################
data_nofactors$Time = (data_nofactors$Time1 + data_nofactors$Time2 + data_nofactors$Time3)/3 
data$Time = (data$Time1 + data$Time2 + data$Time3)/3

p = ggplot(data_nofactors, aes(x = nD, y = Time)) +
             geom_point(color = "blue") + 
             theme_bw() + 
             theme(panel.grid.major = element_blank(),
                  panel.grid.minor = element_blank(),
                  legend.position = "none", 
                  axis.text=element_text(size=14, color = "black"),
                  axis.title=element_text(size=titlesize)) +
             labs(y = "Runtime in ms", x = "Number of Dominoes") +
             scale_y_continuous(trans='log', breaks = c(1, 5, 50, 500, 3000)) +
             scale_x_continuous(breaks = c(4, 6, 8, 10, 12, 14, 16))
ggsave("runtime_log_scatter.pdf", path = "pics", width = width, height = height, 
       units = c("px"))

# Aggregate Time by amount of Dominoes #########################################
standard_error <- function(x) sd(x) / sqrt(length(x))

bynD = aggregate(Time ~ nD, FUN = mean, data = data)
bynD$SD = aggregate(Time ~ nD, FUN = sd, data = data)$Time
bynD$SE = aggregate(Time ~ nD, FUN = standard_error, data = data)$Time
bynD$amount = table(data$nD)
print(bynD)

# Plot 
p = ggplot(bynD, aes(x=nD, y=Time, fill = nD)) + 
  geom_bar(stat = "identity") + 
  geom_errorbar(aes(ymin=Time-SE, ymax=Time+SE), width=.1) +
  theme_bw() + theme(panel.grid.major = element_blank(),
                     panel.grid.minor = element_blank(), 
                     legend.position = "none", 
                     axis.text=element_text(size=14, color = "black"),
                     axis.title=element_text(size=titlesize)) +
  labs(x = "Number of Dominoes", y = "Mean Runtime in ms") +
  scale_y_continuous(trans='log', breaks = c(1, 10, 100, 1000, 10000), limits = c(1, 35000))

ggsave("runtime_numberDominoes.pdf", path = "pics", width = width, height = height, 
       units = c("px"))             

# Aggregate Time by Difficulty  ################################################
bydifficulty = aggregate(Time ~ Condition, FUN = mean, data = data)
bydifficulty$SD = aggregate(Time ~ Condition, FUN = sd, data = data)$Time
bydifficulty$SE = aggregate(Time ~ Condition, FUN = standard_error, data = data)$Time
print(bydifficulty)

# Plot 
p = ggplot(bydifficulty, aes(x=Condition, y=Time, fill = Condition)) + 
  geom_bar(stat = "identity") + 
  geom_errorbar(aes(ymin=Time-SE, ymax=Time+SE), width=.1) +
  theme_bw() + theme(panel.grid.major = element_blank(),
                     panel.grid.minor = element_blank(),
                     legend.position = "none", 
                     axis.text=element_text(size=14, color = "black"),
                     axis.title=element_text(size=titlesize)) +
  labs(y = "Mean Runtime in ms") +
  scale_y_continuous(trans='log', breaks = c(1, 10, 100, 1000, 10000), limits = c(1, 35000)) + 
  scale_fill_manual(values = c("green", "orange", "red"))

ggsave("runtime_difficulty.pdf", path = "pics", width = width, height = height, 
       units = c("px"))

############################## SearchNodes #####################################

# Scatterplot Search Nodes #####################################################
data_nofactors$SearchNodes = (data_nofactors$SearchNodes1 + data_nofactors$SearchNodes2 + data_nofactors$SearchNodes3)/3 
data$SearchNodes = (data$SearchNodes1 + data$SearchNodes2 + data$SearchNodes3)/3

p = ggplot(data_nofactors, aes(x = nD, y = SearchNodes)) +
  geom_point(color = "blue") + 
  theme_bw() + 
  theme(panel.grid.major = element_blank(),
        panel.grid.minor = element_blank(),
        legend.position = "none", 
        axis.text=element_text(size=14, color = "black"),
        axis.title=element_text(size=titlesize)) +
  labs(y = "Search Nodes", x = "Number of Dominoes") +
  scale_y_continuous(trans='log', breaks = c(1, 10, 100, 1000, 10000), limits = c(1, 35000)) +
  scale_x_continuous(breaks = c(4, 6, 8, 10, 12, 14, 16))

ggsave("searchnodes_log_scatter.pdf", path = "pics", width = width, height = height, 
       units = c("px"))

# Aggregate Search nodes by amount of Dominoes ##################################
byNodesnD = aggregate(SearchNodes ~ nD, FUN = mean, data = data)
byNodesnD$SD = aggregate(SearchNodes ~ nD, FUN = sd, data = data)$SearchNodes
byNodesnD$SE = aggregate(SearchNodes ~ nD, FUN = standard_error, data = data)$SearchNodes
byNodesnD$amount = table(data$nD)
print(byNodesnD)

# Plot 
p = ggplot(byNodesnD, aes(x=nD, y=SearchNodes, fill = nD)) + 
  geom_bar(stat = "identity") + 
  geom_errorbar(aes(ymin=SearchNodes-SE, ymax=SearchNodes+SE), width=.1) +
  theme_bw() + theme(panel.grid.major = element_blank(),
                     panel.grid.minor = element_blank(), 
                     legend.position = "none", 
                     axis.text=element_text(size=14, color = "black"),
                     axis.title=element_text(size=titlesize)) +
  labs(x = "Number of Dominoes", y = "Mean Amount Search Nodes") +
  scale_y_continuous(trans='log', breaks = c(1, 10, 100, 1000, 10000), limits = c(1, 35000))

ggsave("searchnodes_numberDominoes.pdf", path = "pics", width = width + 150, height = height, 
       units = c("px"))

# Aggregate SearchNodes by Difficulty ##########################################
bydifficulty = aggregate(SearchNodes ~ Condition, FUN = mean, data = data)
bydifficulty$SD = aggregate(SearchNodes ~ Condition, FUN = sd, data = data)$SearchNodes
bydifficulty$SE = aggregate(SearchNodes ~ Condition, FUN = standard_error, data = data)$SearchNodes
# print(bydifficulty)

# Plot 
p = ggplot(bydifficulty, aes(x=Condition, y=SearchNodes, fill = Condition)) + 
  geom_bar(stat = "identity") + 
  geom_errorbar(aes(ymin=SearchNodes-SE, ymax=SearchNodes+SE), width=.1) +
  theme_bw() + theme(panel.grid.major = element_blank(),
                     panel.grid.minor = element_blank(),
                     legend.position = "none", 
                     axis.text=element_text(size=14, color = "black"),
                     axis.title=element_text(size=titlesize)) +
  labs(y = "Mean Amount Search Nodes") +
  scale_y_continuous(trans='log', breaks = c(1, 10, 100, 1000, 10000), limits = c(1, 35000)) + 
  scale_fill_manual(values = c("green", "orange", "red"))

ggsave("searchnodes_difficulty.pdf", path = "pics", width = width, height = height, 
       units = c("px"))

