public class SummingASeries{
      public static void main(String[] args) {

            double sum = 0;
            double numerator = 1;
            double denominator = 3;

            for (int i = 0; i <= 48; i++) {
                  sum += (numerator / denominator);
                  numerator += 2;
                  denominator +=2;
            }

            System.out.println("The sum of the series is " + sum);
      }
}
