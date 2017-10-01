import java.lang.*;

public class FindingOccurence{
      public static void main(String[] args) {
            int[] array = new int[101];
            int[] integerArray = {2, 5, 6, 5, 4, 3, 23, 43, 2, 0};

            for (int i = 0; i < integerArray.length; i++) {
                  ++array[integerArray[i]];
            }

            for (int i = 1; i < array.length; i++) {
                  if(array[i] > 1)
                        System.out.println(i + " occurs " + array[i] + " times");
                  else if(array[i] == 1)
                        System.out.println(i + " occurs " + array[i] + " time");
                  else
                        continue;
            }
      }
}
