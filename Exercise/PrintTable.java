public class PrintTable{
      public static void main(String[] args) {

            System.out.println("a\tb\tpow(a,b)");
            int a = 1;
            int b = 2;
            for (int i = 0; i < 5; i++) {
                  System.out.format(a + "\t" + b + "\t" + Math.pow(a,b) );
                  ++a;
                  ++b;
                  System.out.println();
            }
      }
}
