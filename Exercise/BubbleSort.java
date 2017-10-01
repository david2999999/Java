import java.util.*;

public class BubbleSort{
      public static void main(String[] args) {
            int counter = 0;
            double[] array = {6, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5,};
            double temp;

            while(counter != array.length){
                  ++counter;
                  for (int i = 0; i < array.length - 1; i++ ) {
                        if(array[i] > array[i + 1]){
                              temp = array[i + 1];
                              array[i + 1] = array[i];
                              array[i] = temp;
                        }
                  }
            }

            System.out.println(Arrays.toString(array));
      }
}
