import java.util.*;
import java.lang.*;

public class EliminatingDuplicates{
      public static void main(String[] args) {
            int[] numbers = {1,2,3,4,5,6,5,6,7,6,8,10,6,0};
            System.out.println(Arrays.toString(eliminateDuplicates(numbers)));
      }

      public static int[] eliminateDuplicates(int[] numbers){
            int[] noDuplicates = new int[numbers.length];
            int counter = 0;
            int counter2 = 0;

            for (int i = 0; i < numbers.length; i++) {
                  counter2 = 0;
                  for (int j = 0; j <= counter ; j++) {
                        ++counter2;
                        if(noDuplicates[j] == numbers[i])
                              break;
                  }
                        if( counter2 == counter + 1)
                              noDuplicates[counter++] = numbers[i];
            }

            numbers = Arrays.copyOfRange(noDuplicates, 0 , counter);
            return numbers;
      }
}
