import javax.swing.JOptionPane;

public class FactorsOfInteger{
      public static void main(String[] args) {

            String n1String = JOptionPane.showInputDialog("Enter the 1st number: ");
            Integer number = Integer.parseInt(n1String);

            int arrayCounter = 0;
            int[] arrayOfFactors = new int[100];
            int factor = 2;

            while(true){
                  if((number % factor) == 0){
                        arrayOfFactors[arrayCounter++] = factor;
                        number = number / factor;
                  }else
                        ++factor;

                  if (number ==1) {
                        break;
                  }
            }

            for (int i = 0; i < arrayCounter; i++) {
                  System.out.print(arrayOfFactors[i] + " ");
            }
      }
}
