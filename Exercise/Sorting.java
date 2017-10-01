import javax.swing.JOptionPane;
import java.util.*;

public class Sorting{
      public static void main(String[] args) {
            String num1String = JOptionPane.showInputDialog("Enter the 1st Number: ");
            Double num1 = Double.parseDouble(num1String);

            String num2String = JOptionPane.showInputDialog("Enter the 2nd Number: ");
            Double num2 = Double.parseDouble(num2String);

            String num3String = JOptionPane.showInputDialog("Enter the 3rd Number: ");
            Double num3 = Double.parseDouble(num3String);

            double[] list = {num1, num2 , num3};

            double temp = 0;

            for (int i = 0; i < 2; i++) {
                  for (int j = i + 1; j < 3 ; j++) {
                        if(list[i] > list[j])
                              temp = list[i];
                              list[i] = list[j];
                              list[j] = temp;
                  }
            }

            System.out.print(Arrays.toString(list));
      }
}
