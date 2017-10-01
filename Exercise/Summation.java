public class Summation{
      public static void main(String[] args) {

            double sum = 0;

            for (int i = 1; i < 625; i++) {
                  sum = sum + 1/(Math.sqrt(i) + Math.sqrt(i + 1));
            }

            System.out.format("The summation of the terms is %.2f", sum);
      }
}
