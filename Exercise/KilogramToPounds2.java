public class KilogramToPounds2{
      public static void main(String[] args) {

            double[] kilograms = new double[100];
            double[] pounds = new double[100];
            int counter = 0;
            int counter1 = 0;

            for (int i = 1; i < 201; i = i + 2) {
                  kilograms[counter] = i;
                  ++counter;
            }

            for (int i = 20; i < 520 ; i = i + 5 ) {
                  pounds[counter1] = i;
                  ++counter1;
            }

            System.out.println("Kilograms\t\t\tPounds\t\t\tPounds\t\t\tKilograms");
            for (int i = 0; i < kilograms.length ; i++ ) {
                  System.out.format("%.0f\t\t\t\t%.1f\t\t\t%.0f\t\t\t%.2f", kilograms[i], kilograms[i] * 2.2, pounds[i], pounds[i] / 2.2);
                  System.out.println();
            }
      }
}
