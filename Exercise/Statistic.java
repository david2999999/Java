public class Statistic{
      public static void main(String[] args) {
            double[] numArray = {1, 2, 3, 4.5, 5.6, 6, 7, 8, 9, 10};
            double sum = 0;

            for (int i = 0; i < numArray.length; i++) {
                  sum += numArray[i];
            }

            System.out.println("The mean is " + sum/numArray.length);

            double sum2 = 0;
            for (int i = 0; i < numArray.length; i++ ) {
                  sum2 += Math.pow(numArray[i] , 2);
            }

            double standardDeviation = Math.sqrt(((sum2) - Math.pow(sum,2)/numArray.length)/(numArray.length - 1));
            System.out.format("The standard deviation is %.5f ", standardDeviation);
      }
}
