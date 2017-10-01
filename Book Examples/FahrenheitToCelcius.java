import java.util.Scanner;

public class FahrenheitToCelcius {
      public static void main (String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print(" Enter a degree in Fahrenheit  ");

            double fahrenheit = input.nextDouble();

            double celcius = (5.0 / 9 ) * (fahrenheit  - 32);

            System.out.println("Fahrenheit " + fahrenheit + " is "
            + celcius + " in celcius ");

      }
}
