public class TemperatureChart{
      public static void main(String[] args) {
            double celsius = 40.0;
            double fahrenheit = 120.0;

            System.out.println("Celsius\t\t\tFahrenheit\t\t\tCelsius\t\t\tFahrenheit");
            for (int i = 0; i < 10 ; i++) {
                  System.out.format("%.1f\t\t\t%.1f\t\t\t\t%.1f\t\t\t%.2f", celsius ,
                        Temperature.celsiusToFahrenheit(celsius), fahrenheit,
                        Temperature.fahrenheitToCelsius(fahrenheit));

                  celsius -= 1;
                  fahrenheit -= 10;
                  System.out.println();
            }
      }
}
