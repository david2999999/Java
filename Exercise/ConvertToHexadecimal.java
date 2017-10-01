import javax.swing.JOptionPane;

public class ConvertToHexadecimal{
      public static void main(String[] args) {
            String numString = JOptionPane.showInputDialog("Enter the number to convert to hexadecimal: ");
            Integer number = Integer.parseInt(numString);

            final String[] hexadecimal = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
            String[] convertedValues = new String[100];
            int counter = 0;
            int remainder;

            while(number > 0){
                  remainder = number % 16;
                  convertedValues[counter] = hexadecimal[remainder];
                  number /= 16;
                  ++counter;
            }

            System.out.print("The hexadecimal conversion of the integer " + numString + " is ");
            for (int i = counter - 1; i >= 0 ; i-- ) {
                  System.out.print(convertedValues[i]);
            }
      }
}
