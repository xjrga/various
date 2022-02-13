library(dplyr)

oils = data.frame(
  sfa = c(11.6,24.8,7.4,82.5,12.9,25.9,9,10.5,7,13.8,49.3,20.3,25.0,7.5,14.2,15.6,9.1,10.3,10.1,9.9,5.645,9.22,19.0,18.74,4.092,4.511),
  mufa = c(70.6, 32.7, 63.3, 6.3, 27.6, 17.8, 18.4, 14.3, 9, 73, 37, 48.1, 38.4, 75.2, 39.7, 22.8, 22.8, 19.5, 45.4, 83.7, 24.534, 53.38, 60.0, 63.865, 33.076, 46.608),
  ala = c(1,0.1,9.1,0,1,1,53,0,22,0.7,0.2,0,2.2,0,0.3,7,10.4,0,0.2,0.2,0.212,1.74,1.0,0.7,0.006,0.0),
  la = c(12.5,41.9,18.6,0,58,54,13,74.7,54,9.8,9.1,31.4,34.4,12.8,41.3,51,52.9,65.7,39.8,3.6,13.125,34.24,1.5,16.69,12.945,8.463)
)
row.names(oils) <- c("avocado oil",  "brazil nut oil",  "canola oil",  "coconut oil",  "corn oil",  "cottonseed oil",  "flaxseed oil",  "grapeseed oil",  "hemp oil",  "olive oil",  "palm oil",  "peanut oil",  "rice bran oil",  "high-oleic safflower oil",  "sesame oil",  "soybean oil",  "walnut oil",  "sunflower standard oil",  "sunflower 60 oil",  "sunflower 70 oil",  "pistachio nut",  "pecan oil",  "macadamia oil",  "cashew oil",  "almond oil",  "hazelnut oil")
distance_matrix <- dist(oils, method = 'euclidean')
hc <- hclust(distance_matrix, method = "average")
plot(hc,main = "Edible Oils Hierarchical Cluster",hang = -1, cex = 0.8,xlab = "Lipid Profile",ylab = "")
rect.hclust(hc, k = 7, border = "orange")