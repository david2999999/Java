import javax.swing.JOptionPane;

public class AnalyzingScores{
      public static void main(String[] args) {
            int counter = 0;
            int[] arrayScores = new int[100];
            int sum = 0;
            double average;
            int lessThan = 0;
            int moreThan = 0;

            String numString = JOptionPane.showInputDialog("Enter a Score: ");
            Integer number = Integer.parseInt(numString);
            arrayScores[counter] = number;
            ++counter;

            while(number != -1){
                  numString = JOptionPane.showInputDialog("Enter a integer: ");
                  number = Integer.parseInt(numString);
                  arrayScores[counter++] = number;
            }

            for (int i = 0; i < counter - 1; i++ ) {
                  sum += arrayScores[i];
            }
            average = sum / (counter - 1);

            for (int i = 0; i < counter - 1; i++) {
                  if(arrayScores[i] >= average)
                        ++moreThan;
                  else
                        ++lessThan;
            }

            System.out.println("The number of scores greater than or equal to average is " + moreThan);
            System.out.println("The number of scores less than average is " + lessThan);

      }
}
