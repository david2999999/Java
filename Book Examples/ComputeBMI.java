import java.util.Scanner;

public class ComputeBMI{
      public static void main (String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("Entr weight in pounds: ");
            double weight = input.nextDouble();

            System.out.print("Enter height in inches:  ");
            double height = input.nextDouble();

            final double KILOGRAM_PER_POUNDS = 0.45359237;      // Constant values
            final double METERS_PER_INCH = 0.0254;

            double weightInKilograms = weight * KILOGRAM_PER_POUNDS;
            double heightsInMeters = height * METERS_PER_INCH;
            double bmi = weightInKilograms / (heightsInMeters * heightsInMeters);

            System.out.printf("Your BMI is %5.2f \n", bmi);
            if (bmi < 16)
                  System.out.println("You are seriously underweight ");
            else if (bmi < 18)
                  System.out.println("You are underweight ");
            else if (bmi < 24)
                  System.out.println("You are normal weight");
            else if (bmi < 29)
                  System.out.println("You are overweight");
            else if (bmi < 35)
                  System.out.println("You are seriously overweight ");
            else
                  System.out.println("You are gravely overweight ");
      }
}
