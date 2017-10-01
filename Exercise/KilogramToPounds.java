public class KilogramToPounds{
      public static void main(String[] args) {

            System.out.println("Kilograms\t\t\tPounds");
            for (int i =1 ; i < 200; i++) {
                  System.out.format("%d\t\t\t%.1f",i,(2.2 * i));
                  System.out.println();
            }
      }
}
