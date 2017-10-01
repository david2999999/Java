import java.util.Scanner;

public  class DisplayTime {
      public static void  main (String[] args){

            System.out.print("Enter an integer for seconds:  ");

            int seconds = input.nextInt();

            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60 ;
            System.out.println(seconds + "Seconds is " + minutes + "minutes and " +
                  remainingSeconds + "Seconds");
      }
}
