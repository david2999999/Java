import java.util.Scanner;

public class LeapYear {
      public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a year: ");
            int year = input.nextInt();


            // check to see if the year is a leap year
            boolean isLeapYear =
                  (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

                  System.out.println(year + "is a leap year? " + isLeapYear);
      }
}
