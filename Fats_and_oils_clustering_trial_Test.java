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
        int numTrials = 100;
        //Type SFA MUFA ALA LA        
        final DoublePoint avocado = new DoublePoint(new double[]{11.6, 70.6, 1, 12.5});
        final DoublePoint brazil_nut = new DoublePoint(new double[]{24.8, 32.7, 0.1, 41.9});
        final DoublePoint canola = new DoublePoint(new double[]{7.4, 63.3, 9.1, 18.6});
        final DoublePoint coconut = new DoublePoint(new double[]{82.5, 6.3, 0, 0});
        final DoublePoint corn = new DoublePoint(new double[]{12.9, 27.6, 1, 58});
        final DoublePoint cottonseed = new DoublePoint(new double[]{25.9, 17.8, 1, 54});
        final DoublePoint flaxseed = new DoublePoint(new double[]{9, 18.4, 53, 13});
        final DoublePoint grapeseed = new DoublePoint(new double[]{10.5, 14.3, 0, 74.7});
        final DoublePoint hempseed = new DoublePoint(new double[]{7, 9, 22, 54});
        final DoublePoint olive = new DoublePoint(new double[]{13.8, 73, 0.7, 9.8});
        final DoublePoint palm = new DoublePoint(new double[]{49.3, 37, 0.2, 9.1});
        final DoublePoint peanut = new DoublePoint(new double[]{20.3, 48.1, 0, 31.4});
        final DoublePoint high_oleic_safflower = new DoublePoint(new double[]{7.5, 75.2, 0, 12.8});
        final DoublePoint sesame = new DoublePoint(new double[]{14.2, 39.7, 0.3, 41.3});
        final DoublePoint soybean = new DoublePoint(new double[]{15.6, 22.8, 7, 51});
        final DoublePoint walnut = new DoublePoint(new double[]{9.1, 22.8, 10.4, 52.9});
        final DoublePoint sunflower_standard = new DoublePoint(new double[]{10.3, 19.5, 0, 65.7});
        final DoublePoint sunflower_60 = new DoublePoint(new double[]{10.1, 45.4, 0.2, 39.8});
        final DoublePoint sunflower_70 = new DoublePoint(new double[]{9.9, 83.7, 0.2, 3.6});
        data.add(avocado);
        data.add(brazil_nut);
        data.add(canola);
        data.add(coconut);
        data.add(corn);
        data.add(cottonseed);
        data.add(flaxseed);
        data.add(grapeseed);
        data.add(hempseed);
        data.add(olive);
        data.add(palm);
        data.add(peanut);
        data.add(high_oleic_safflower);
        data.add(sesame);
        data.add(soybean);
        data.add(walnut);
        data.add(sunflower_standard);
        data.add(sunflower_60);
        data.add(sunflower_70);
        map.put(avocado.toString(), "avocado");
        map.put(brazil_nut.toString(), "brazil nut");
        map.put(canola.toString(), "canola");
        map.put(coconut.toString(), "coconut");
        map.put(corn.toString(), "corn");
        map.put(cottonseed.toString(), "cottonseed");
        map.put(flaxseed.toString(), "flaxseed");
        map.put(grapeseed.toString(), "grapeseed");
        map.put(hempseed.toString(), "hempseed");
        map.put(olive.toString(), "olive");
        map.put(palm.toString(), "palm");
        map.put(peanut.toString(), "peanut");
        map.put(high_oleic_safflower.toString(), "high-oleic safflower");
        map.put(sesame.toString(), "sesame");
        map.put(soybean.toString(), "soybean");
        map.put(walnut.toString(), "walnut");
        map.put(sunflower_standard.toString(), "sunflower_standard");
        map.put(sunflower_60.toString(), "sunflower 60");
        map.put(sunflower_70.toString(), "sunflower 70");

        System.out.println("*Started clustering trial*");
        System.out.println("");
        for (int i = 1; i < 19; i++) {
            KMeansPlusPlusClusterer<DoublePoint> kmpp = new KMeansPlusPlusClusterer<>(i);
            MultiKMeansPlusPlusClusterer multiKMPP = new MultiKMeansPlusPlusClusterer(kmpp, numTrials);
            List<CentroidCluster<DoublePoint>> results = multiKMPP.cluster(data);
            System.out.println("Size: " + results.size());
            SumOfClusterVariances<DoublePoint> clusterVar = new SumOfClusterVariances<>(new EuclideanDistance());
            double score = clusterVar.score(results);
            System.out.println("Score: " + score);
            System.out.println("");
            int j = 1;
            for (CentroidCluster<DoublePoint> result : results) {
                StringBuilder sb = new StringBuilder();
                Formatter formatter = new Formatter(sb);
                DoublePoint centroid = (DoublePoint) result.getCenter();
                //System.out.println(centroid.toString());
                sb.append("Cluster: " + j);
                j = j + 1;
                sb.append("\n");
                List<DoublePoint> cluster_points = result.getPoints();
                for (DoublePoint point : cluster_points) {
                    formatter.format("%1$25s %2$25s", map.get(point.toString()), point.toString());
                    sb.append("\n");
                }
                sb.append("\n");
                System.out.println(sb.toString());
            }
        }
        System.out.println("*Finished clustering trial*");
    }
}
