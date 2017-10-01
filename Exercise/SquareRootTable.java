public class SquareRootTable{
      public static void main(String[] args) {
            System.out.println("Number\t\t\tSquareRoot");
            for (int i = 0; i <= 20; i +=2) {
                  System.out.format("%d\t\t\t%.4f",i, Math.sqrt(i));
                  System.out.println();
            }

      }
}
