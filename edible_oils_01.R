library(ggdendro)
library(ggplot2)
oils <- read.csv("edible_oils.csv", header=TRUE, check.names = FALSE)
row.names(oils) = oils[,1]
oils=oils[,-1]
oils<-t(oils)
distance_matrix <- dist(oils, method = 'euclidean')
hc <- hclust(distance_matrix, method = "average")
ggdendrogram(hc, rotate = TRUE, size = 4, theme_dendro = FALSE) + labs(title = "Cluster Dendogram: Edible Oils")

