import java.util.*;

public class SortingStudents{
      public static void main(String[] args) {
            String[] names = {"A","B","C","D","E","F","G","H"};
            int[] scores = {90, 80 , 70, 10, 20, 45, 32, 78};
            int temp;
            String temp2;

            for (int i = 0; i < names.length; i++ ) {
                  for (int j = 1; j < names.length; j++ ) {
                        if(scores[j - 1] > scores[j]){
                              temp = scores[j];
                              scores[j] = scores[j - 1];
                              scores[j - 1] = temp;

                              temp2 = names[j];
                              names[j] = names[j-1];
                              names[j-1] = temp2;
                        }
                  }
            }

            System.out.println(Arrays.toString(names));
            System.out.println(Arrays.toString(scores));
      }
}
