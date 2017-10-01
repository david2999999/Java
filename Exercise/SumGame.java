import javax.swing.JOptionPane;
import java.lang.*;

public class SumGame{
      public static void main(String[] args) {
            int n1 = (int)Math.floor(Math.random() * 101);
            int n2 = (int)Math.floor(Math.random() * 101);
            int sum = n1 + n2;

            String sumString = JOptionPane.showInputDialog("What is " + n1 + "+"+  n2);
            Integer sumInput = Integer.parseInt(sumString);

            if (sumInput == sum) {
                  System.out.print("Your answer is correct");
            }else
                  System.out.print("Your answer is wrong, the right answer is " + sum);

      }
}
