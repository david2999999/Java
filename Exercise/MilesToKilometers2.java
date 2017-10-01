public class MilesToKilometers2{
      public static void main(String[] args) {

            System.out.println("Miles\t\t\tKilometers\t\t\tKilometers\t\t\tMiles");

            double miles = 1;
            double kilometers = 20;

            for (int i = 0; i < 10; i++) {
                  System.out.format("%.0f\t\t\t%.3f\t\t\t\t%.0f\t\t\t\t%.3f",miles, miles * 1.609, kilometers, kilometers / 1.609);
                  System.out.println();
                  ++miles;
                  kilometers = kilometers + 5;
            }
      }
}
