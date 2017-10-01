import javax.swing.JOptionPane;

public class ReverseInteger{
      public static void main(String[] args) {
            String numString = JOptionPane.showInputDialog("Enter a number for the Palindrome: ");
            Integer number = Integer.parseInt(numString);

            reverse(number);
      }

      public static void reverse(int number){
            int[] reverse = new int[100];
            int remainder;
            int i = 0, k = 1;
            int reverseNumber = 0;

            while(number > 0){
                  remainder = number % 10;
                  reverse[i++] = remainder;
                  number /= 10;
            }

            for (int j = i - 1; j >= 0  ;j-- ) {
                  reverseNumber = reverseNumber + k*(reverse[j]);
                  k *= 10;
            }

            System.out.println(reverseNumber);
      }
}
