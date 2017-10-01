import javax.swing.JOptionPane;

public class ConvertToBinary{
      public static void main(String[] args) {

      int[] binary = new int[100];
      int counter = 0;

      String numString = JOptionPane.showInputDialog("Enter a number to be converted to binary: ");
      Integer number =  Integer.parseInt(numString);

      while(number > 0){
            if((number % 2) == 1){
                  binary[counter] = 1;
                  ++counter;
            }else{
                  binary[counter] = 0;
                  ++counter;
            }
            number /= 2;
      }

      System.out.print("The binary conversion of the interger " + numString + " is ");
      for (int i = counter - 1; i >= 0; i--) {
            System.out.print(binary[i]);
      }

      }
}
