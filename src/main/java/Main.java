import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.ZipfDistribution;



public class Main  {

    public static void main(String[] args) throws Exception {
        // first has twice of ocuurence of second, three tilmes the third, four times the fourth and so on...
        //first has twice  of ocuurence of second (1/2^0.8)*first, three tilmes the third, four times the fourth and so on...
        System.out.println();
        System.out.println("Zipf Distribution");
        ZipfDistribution zipfDistribution = new ZipfDistribution(10, 0.8);
        int [] totalSamples = new int [11];
        for (int i = 0; i < 100000; i++) {
            int sample = zipfDistribution.sample();
            totalSamples[sample]++;
            //System.out.println(words[sample]);
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("key " + i + " appeared " + totalSamples[i] + " so its probaility is " +
                    (double)(totalSamples[i])/100000.0);

        }
    }

}