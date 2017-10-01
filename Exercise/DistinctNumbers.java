import javax.swing.JOptionPane;

public class DistinctNumbers{
      public static void main(String[] args) {
            int[] arrayScores = new int[10];
            int counter = 0;
            int distinctCounter = 0;


            String numString = JOptionPane.showInputDialog("Enter a integer: ");
            Integer number = Integer.parseInt(numString);
            arrayScores[distinctCounter] = number;
            ++counter;
            ++distinctCounter;

            while(counter != 10){
                  numString = JOptionPane.showInputDialog("Enter a integer: ");
                  number = Integer.parseInt(numString);
                  ++counter;
                  if (!inArray(arrayScores,number)) {
                        arrayScores[distinctCounter++] = number;
                  }
            }

            System.out.print("The distinct numbers are: ");
            for (int i = 0; i < distinctCounter;i++ ) {
                  System.out.print(arrayScores[i] + " ");
            }

      }

      public static boolean inArray(int[] array, int value){
            boolean inTheArray = false;
            for (int i = 0; i < array.length; i++) {
                  if(array[i] == value)
                        return true;
            }
            return inTheArray;
      }
}
