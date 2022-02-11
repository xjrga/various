package io.github.xjrga;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.math3.ml.clustering.CentroidCluster;
import org.apache.commons.math3.ml.clustering.DoublePoint;
import org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer;
import org.apache.commons.math3.ml.clustering.MultiKMeansPlusPlusClusterer;
import org.apache.commons.math3.ml.clustering.evaluation.SumOfClusterVariances;
import org.apache.commons.math3.ml.distance.EuclideanDistance;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Fats_and_oils_clustering_trial_Test {

    @Test
    public void test_01() throws Exception {
        List<DoublePoint> data = new ArrayList<>();
        Map<String, String> map = new HashMap();
        StringBuilder sb00 = new StringBuilder();
        Formatter formatter00 = new Formatter(sb00);
        int numTrials = 100;
        //Type SFA MUFA ALA LA        
        final DoublePoint avocado_oil = new DoublePoint(new double[]{11.6, 70.6, 1, 12.5});
        final DoublePoint brazil_nut_oil = new DoublePoint(new double[]{24.8, 32.7, 0.1, 41.9});
        final DoublePoint canola_oil = new DoublePoint(new double[]{7.4, 63.3, 9.1, 18.6});
        final DoublePoint coconut_oil = new DoublePoint(new double[]{82.5, 6.3, 0, 0});
        final DoublePoint corn_oil = new DoublePoint(new double[]{12.9, 27.6, 1, 58});
        final DoublePoint cottonseed_oil = new DoublePoint(new double[]{25.9, 17.8, 1, 54});
        final DoublePoint flaxseed_oil = new DoublePoint(new double[]{9, 18.4, 53, 13});
        final DoublePoint grapeseed_oil = new DoublePoint(new double[]{10.5, 14.3, 0, 74.7});
        final DoublePoint hemp_oil = new DoublePoint(new double[]{7, 9, 22, 54});
        final DoublePoint olive_oil = new DoublePoint(new double[]{13.8, 73, 0.7, 9.8});
        final DoublePoint palm_oil = new DoublePoint(new double[]{49.3, 37, 0.2, 9.1});
        final DoublePoint peanut_oil = new DoublePoint(new double[]{20.3, 48.1, 0, 31.4});
        final DoublePoint rice_bran_oil = new DoublePoint(new double[]{25.0, 38.4, 2.2, 34.4});
        final DoublePoint high_oleic_safflower_oil = new DoublePoint(new double[]{7.5, 75.2, 0, 12.8});
        final DoublePoint sesame_oil = new DoublePoint(new double[]{14.2, 39.7, 0.3, 41.3});
        final DoublePoint soybean_oil = new DoublePoint(new double[]{15.6, 22.8, 7, 51});
        final DoublePoint walnut_oil = new DoublePoint(new double[]{9.1, 22.8, 10.4, 52.9});
        final DoublePoint sunflower_standard_oil = new DoublePoint(new double[]{10.3, 19.5, 0, 65.7});
        final DoublePoint sunflower_60_oil = new DoublePoint(new double[]{10.1, 45.4, 0.2, 39.8});
        final DoublePoint sunflower_70_oil = new DoublePoint(new double[]{9.9, 83.7, 0.2, 3.6});
        final DoublePoint pistachio_nut = new DoublePoint(new double[]{5.645, 24.534, 0.212, 13.125});
        final DoublePoint pecan_oil = new DoublePoint(new double[]{9.22, 53.38, 1.74, 34.24});
        final DoublePoint macadamia_oil = new DoublePoint(new double[]{19.0, 60.0, 1.0, 1.5});
        final DoublePoint cashew_oil = new DoublePoint(new double[]{18.74, 63.865, 0.7, 16.69});
        final DoublePoint almond_oil = new DoublePoint(new double[]{4.092, 33.076, 0.006, 12.945});
        final DoublePoint hazelnut_oil = new DoublePoint(new double[]{4.511, 46.608, 0.0, 8.463});
        data.add(avocado_oil);
        data.add(brazil_nut_oil);
        data.add(canola_oil);
        data.add(coconut_oil);
        data.add(corn_oil);
        data.add(cottonseed_oil);
        data.add(flaxseed_oil);
        data.add(grapeseed_oil);
        data.add(hemp_oil);
        data.add(olive_oil);
        data.add(palm_oil);
        data.add(peanut_oil);
        data.add(rice_bran_oil);
        data.add(high_oleic_safflower_oil);
        data.add(sesame_oil);
        data.add(soybean_oil);
        data.add(walnut_oil);
        data.add(sunflower_standard_oil);
        data.add(sunflower_60_oil);
        data.add(sunflower_70_oil);
        data.add(pistachio_nut);
        data.add(pecan_oil);
        data.add(cashew_oil);
        data.add(macadamia_oil);
        data.add(almond_oil);
        data.add(hazelnut_oil);
        map.put(avocado_oil.toString(), "avocado oil");
        map.put(brazil_nut_oil.toString(), "brazil nut oil");
        map.put(canola_oil.toString(), "canola oil");
        map.put(coconut_oil.toString(), "coconut oil");
        map.put(corn_oil.toString(), "corn oil");
        map.put(cottonseed_oil.toString(), "cottonseed oil");
        map.put(flaxseed_oil.toString(), "flaxseed oil");
        map.put(grapeseed_oil.toString(), "grapeseed oil");
        map.put(hemp_oil.toString(), "hemp oil");
        map.put(olive_oil.toString(), "olive oil");
        map.put(palm_oil.toString(), "palm oil");
        map.put(peanut_oil.toString(), "peanut oil");
        map.put(rice_bran_oil.toString(), "rice bran oil");
        map.put(high_oleic_safflower_oil.toString(), "high-oleic safflower oil");
        map.put(sesame_oil.toString(), "sesame oil");
        map.put(soybean_oil.toString(), "soybean oil");
        map.put(walnut_oil.toString(), "walnut oil");
        map.put(sunflower_standard_oil.toString(), "sunflower standard oil");
        map.put(sunflower_60_oil.toString(), "sunflower 60 oil");
        map.put(sunflower_70_oil.toString(), "sunflower 70 oil");
        map.put(pistachio_nut.toString(), "pistachio nut");
        map.put(pecan_oil.toString(), "pecan oil");
        map.put(macadamia_oil.toString(), "macadamia oil");
        map.put(cashew_oil.toString(), "cashew oil");
        map.put(almond_oil.toString(), "almond oil");
        map.put(hazelnut_oil.toString(), "hazelnut oil");
        formatter00.format("%1$9s %2$25s", "Clusters", "Score");
        sb00.append("\n");       
        System.out.println("//Type SFA MUFA ALA LA");
        System.out.println("\n");
        System.out.println("*Started clustering trial*");
        System.out.println("");
        for (int i = 1; i < 19; i++) {
            KMeansPlusPlusClusterer<DoublePoint> kmpp = new KMeansPlusPlusClusterer<>(i);
            MultiKMeansPlusPlusClusterer multiKMPP = new MultiKMeansPlusPlusClusterer(kmpp, numTrials);
            List<CentroidCluster<DoublePoint>> results = multiKMPP.cluster(data);
            System.out.println("Number of clusters: " + results.size());
            SumOfClusterVariances<DoublePoint> clusterVar = new SumOfClusterVariances<>(new EuclideanDistance());
            double score = clusterVar.score(results);
            System.out.println("Score: " + score);
            System.out.println("");
            formatter00.format("%1$9s %2$25s", results.size(), score);
            sb00.append("\n");
            int j = 1;
            for (CentroidCluster<DoublePoint> result : results) {
                StringBuilder sb01 = new StringBuilder();
                Formatter formatter01 = new Formatter(sb01);
                DoublePoint centroid = (DoublePoint) result.getCenter();
                //System.out.println(centroid.toString());
                sb01.append("Cluster: " + j);
                j = j + 1;
                sb01.append("\n");
                List<DoublePoint> cluster_points = result.getPoints();
                for (DoublePoint point : cluster_points) {
                    formatter01.format("%1$25s %2$25s", map.get(point.toString()), point.toString());
                    sb01.append("\n");
                }
                sb01.append("\n");
                System.out.println(sb01.toString());
            }
        }
        System.out.println("*Finished clustering trial*");
        System.out.println("");
        System.out.println(sb00.toString());
    }
}

//Plot sum of variances vs the number of clusters
//https://en.wikipedia.org/wiki/Olive_oil
//https://en.wikipedia.org/wiki/Pistachio_oil
//https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5827884/
//https://en.wikipedia.org/wiki/Macadamia_oil
//Impact of roasting on the changes in composition and quality of cashew nut (Anacardium occidentale) oil.
