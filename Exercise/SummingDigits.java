import javax.swing.JOptionPane;

public class SummingDigits{
      public static void main(String[] args) {
            String numString = JOptionPane.showInputDialog("Enter a number: ");
            Integer number = Integer.parseInt(numString);

            System.out.println("The sum of the digits is " + sumDigits(number));
      }
      public static int sumDigits(long n){
            long sum = 0;
            while(n > 0){
                  sum = sum + (n % 10);
                  n /= 10;
            }

            return (int)sum;
      }
}
