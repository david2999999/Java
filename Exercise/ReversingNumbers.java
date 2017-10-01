import javax.swing.JOptionPane;

public class ReversingNumbers{
      public static void main(String[] args) {
            int[] array = new int[10];
            int counter = 0;

            while(counter != 10){
                  String numString = JOptionPane.showInputDialog("Enter a integer: ");
                  Integer number = Integer.parseInt(numString);
                  array[counter++] = number;
            }

            for (int i = counter - 1; i >=0 ; i--) {
                  System.out.print(array[i] + " ");
            }
      }
}
