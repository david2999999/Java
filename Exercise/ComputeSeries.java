public class ComputeSeries{
      public static void main(String[] args) {
            System.out.println("i\t\t\tm(i)");

            for (int i = 10; i <= 100; i +=10 ) {
                  System.out.format("%d\t\t\t%.5f",i, Series.m(i));
                  System.out.println();
            }
      }
}
