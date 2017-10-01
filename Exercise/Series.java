public class Series{
      public static double m(int number){
            double sum = 0;
            int k = 1;

            for (int j = 1;  j <= number; j++ ) {
                  sum = sum + k * (1.0/ (2 * j - 1));
                  k *= -1;
            }

            sum = 4 * sum;

            return sum;
      }
}
