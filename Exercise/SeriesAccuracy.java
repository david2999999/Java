public class SeriesAccuracy{
      public static void main(String[] args) {
            double rightToLeft = 0;
            double leftToRight = 0;

            for (int i = 1; i <= 50000; i++ ) {
                  leftToRight += (1.0/i);
            }

            for (int i = 50000; i >= 1; i--) {
                  rightToLeft += (1.0/i);
            }

            double difference = rightToLeft - leftToRight;
            System.out.println("The difference between the two values is " + difference);
      }
}
