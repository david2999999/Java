import java.util.Scanner;

// THE ZERO IS GOING TO BE THE SENTINEL VALUE THAT STOPS THE LOOP

public class SentinelValue {
      public static void main (String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print(
                  "Enter an int value(The program exits if the input is 0) ");

            int data = input.nextInt();

            int sum = 0;
            while(data != 0){
                  sum += data;

                  System.out.print(
                        "Enter and int value (the program exits if the input is 0) ");
                  data = input.nextInt();
            }

            System.out.println("The sum is "+ sum);
      }
}
