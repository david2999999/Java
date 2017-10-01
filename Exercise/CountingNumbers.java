import java.util.Scanner;

public class CountingNumbers{
      public static void main(String[] args) {

            int positive = 0;
            int negative = 0;
            double sum = 0;

            double[] array = { 1 , 2 , -1 , 3 , 0};

            for (int i = 0; i < array.length; i++) {
                  if( array[i] > 0)
                        ++positive;
                  else if(array[i] < 0)
                        ++negative;
                  else
                        continue;
            }

            for (int i = 0 ; i < array.length ; i++ ) {
                  sum += array[i];
            }

            double average = sum / (array.length -1 );

            System.out.println("The number of positives is " + positive);
            System.out.println("The number of negatives is " + negative);
            System.out.println("The total is " + sum);
            System.out.println("The average is " + average);



      }
}
