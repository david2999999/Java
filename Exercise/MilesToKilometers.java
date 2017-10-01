public class MilesToKilometers{
      public static void main(String[] args) {
            System.out.println("Miles\t\t\tKilometers");
            for (int i = 1; i < 11; i++) {
                  System.out.format("%d\t\t\t%.3f", i , (1.609 * i));
                  System.out.println();
            }
      }
}
