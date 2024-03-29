library(cluster)

oils = data.frame(
  #These saturated fatty acids have the most potent hypercholesterolemic effects
  lauric = c(0.19900,0.00900,0.73000,0.00000,0.00000,0.00000,41.84000,0.00000,0.00000,0.01800,0.00000,0.39000,0.00000,0.10000,0.00000,0.00000,0.00000,0.00000,0.00000,0.00000,0.00000,0.00000),
  myristic = c(1.29400,0.10400,2.74700,0.00000,0.00000,0.00000,16.65300,0.02400,0.80000,0.07700,0.10000,0.24000,0.00000,1.00000,0.10000,0.00000,0.00000,0.00000,0.05700,0.00000,0.00000,0.10000),
  palmitic = c(23.68100,6.86000,13.41200,6.50000,10.90000,4.29800,8.63600,10.57900,22.70000,5.10900,6.70000,16.67000,11.29000,43.50000,9.50000,4.28800,8.90000,10.45500,3.68200,5.90000,7.00000,16.60000),
  #These are essential fatty acids
  linoleic = c(10.14900,3.53800,17.11000,17.40000,12.53000,19.00500,1.68300,53.51500,51.50000,14.32700,69.60000,39.08000,9.76200,9.10000,32.00000,74.62300,41.30000,50.95200,3.60600,65.70000,52.90000,54.80000),
  linolenic = c(0.99500,0.10300,1.12600,0.00000,0.95700,9.13700,0.01900,1.16100,0.20000,53.36800,0.10000,1.79000,0.76100,0.20000,0.00000,0.00000,0.30000,6.78900,0.19200,0.00000,10.40000,6.90000),
  #A higher monounsaturated diet is recommended
  mufa = c(44.87400,11.73800,31.83200,69.90000,70.55400,63.27600,6.33200,27.57600,17.80000,18.43800,16.10000,35.11000,72.96100,37.00000,46.20000,14.35500,39.70000,22.78300,83.68900,19.50000,22.80000,15.10000)
)
row.names(oils) <- c("Animal fat, bacon grease","Egg, yolk, raw, fresh","Margarine-like, butter-margarine blend, 80% fat, stick, without salt","Oil, almond","Oil, avocado","Oil, canola","Oil, coconut","Oil, corn, industrial and retail, all purpose salad or cooking","Oil, cottonseed, salad or cooking","Oil, flaxseed, cold pressed","Oil, grapeseed","Oil, oat","Oil, olive, salad or cooking","Oil, palm","Oil, peanut, salad or cooking","Oil, safflower, salad or cooking, linoleic, (over 70%)","Oil, sesame, salad or cooking","Oil, soybean, salad or cooking","Oil, sunflower, high oleic (70% and over)","Oil, sunflower, linoleic, (approx. 65%)","Oil, walnut","Oil, wheat germ")
#divisive clustering
h.clus<-diana(oils, metric="euclidean")
pltree(h.clus, cex = 0.6, main = "Cluster Dendogram: Edible Oils", sub = "", xlab = "", ylab = "")
