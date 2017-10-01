import java.util.*;

public class IdenticalArray{
      public static void main(String[] args) {
            int[] list1 = {5, 2, 1, 6, 6, 1};
            int[] list2 = {5, 2, 1, 6, 1, 6};

            if(equal(list1, list2) == true)
                  System.out.println("Two lists are strictly identical. ");
            else
                  System.out.println("Two lists are not strictly identical.");

            if(identical(list1, list2) == true)
                  System.out.println("Two lists are identical. ");
            else
                  System.out.println("Two lists are not identical.");
      }

      public static boolean equal(int[] list1 , int[] list2){
            if(list1.length != list2.length)
                  return false;

            boolean isequal = true;
            for (int i = 0; i < list1.length ;i++ ) {
                  if(list1[i] != list2[i])
                        return false;
            }
            return isequal;
      }

      public static boolean identical(int[] list1, int[] list2){
            if(list1.length != list2.length)
                  return false;

            Arrays.sort(list1);
            Arrays.sort(list2);

            boolean isequal = true;
            for (int i = 0; i < list1.length;i++ ) {
                  if(list1[i] != list2[i])
                        return false;
            }

            return isequal;
      }
}
