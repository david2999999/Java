import java.util.*;

public class ReverseArray{
      public static void main(String[] args) {
            double[] x = {1.9, 2.5 ,3.7,2, 1, 6 , 3, 4 , 5 , 2 };
            double[] y = new double[x.length];
            int counter = x.length - 1;

            for (int i = 0 ; i < x.length; i++) {
                  y[counter] = x[i];
                  --counter;
            }


            System.out.print("The reverse array is " + Arrays.toString(y));
      }
}
