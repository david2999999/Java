import javax.swing.JOptionPane;

public class CheckingNumber{
      public static void main(String[] args) {
            String num1String = JOptionPane.showInputDialog("Enter First integer");
            Integer num1 = Integer.parseInt(num1String);

            if((num1 % 5 == 0) && (num1 % 6 == 0))
                  System.out.print(num1 + " is divisible by both 5 and 6");
            else if (num1 % 5 ==0)
                  System.out.print(num1 + " is divisible by 5");
            else if (num1 % 6 == 0)
                  System.out.print(num1 + " is divisible by 6");
            else
                  System.out.print(num1 + " is not divisible by either 5 or 6");
      }
}
