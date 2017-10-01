public class StandardDeviation{
      public static void main(String[] args) {
            double[] x = {1.9, 2.5 ,3.7,2, 1, 6 , 3, 4 , 5 , 2 };
            System.out.format("The mean is %.2f ", mean(x));
            System.out.println();
            System.out.format("The standard deviation is %.5f", deviation(x));
      }

      public static double deviation(double[] x){
            double sum = 0;
            for (int i = 0; i < x.length; i++) {
                  sum += Math.pow(x[i] - mean(x), 2);
            }

            double deviation = Math.pow(sum / (x.length - 1) , .5);

            return deviation;
      }

      public static double mean(double[] x){
            double sum = 0;

            for (int i = 0; i < x.length; i++) {
                  sum += x[i];
            }

            return (sum / x.length);
      }
}
