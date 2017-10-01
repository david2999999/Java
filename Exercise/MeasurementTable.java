public class MeasurementTable{
      public static void main(String[] args) {
            System.out.println("Feet\t\t\tMeters\t\t\tMeters\t\t\tFeet");
            double feet = 1.0;
            double meters = 20.0;

            for (int i = 0; i < 10;i++ ) {
                  System.out.format("%.1f\t\t\t%.3f\t\t\t%.1f\t\t\t%.3f", feet,
                                    Measurement.footToMeter(feet), meters , Measurement.meterToFoot(meters));
                  System.out.println();
                  ++feet;
                  meters +=5;
            }
      }
}
