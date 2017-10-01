import java.util.*;

public class SelectionSort{
      public static void main(String[] args) {
            double[] array = {1.2, 2 , 3.2, 4.5, 7.2, 1 , 2.1, 7, 12, 11};
            for (int i = 0; i < array.length - 1 ;i++ ) {
                  double currentMax = array[i];
                  int currentMaxIndex = i;

                  for (int j = i + 1; j < array.length ;j++ ) {
                        if(currentMax > array[j]){
                              currentMax = array[j];
                              currentMaxIndex = j;
                        }
                  }

                  if(currentMaxIndex != i){
                        array[currentMaxIndex] = array[i];
                        array[i] = currentMax;
                  }
            }

            System.out.println(Arrays.toString(array));
      }
}
