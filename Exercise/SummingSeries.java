public class SummingSeries{
      public static void main(String[] args) {
            System.out.println("i\t\t\tm(i)");

            for (int i = 1; i <= 20;i++ ) {
                  System.out.format("%d\t\t\t%.4f", i , m(i));
                  System.out.println();
            }
      }

      public static double m(int i){
            double sum = 0;

            for (int j = 1; j <= i ;j++ ) {
                  sum += (j * 1.0)/(j + 1);
            }

            return sum;
      }
}
