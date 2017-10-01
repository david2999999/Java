import javax.swing.JOptionPane;

public class OccurrenceMaxNumber{
      public static void main(String[] args) {
            String numString = JOptionPane.showInputDialog("Enter a number: ");
            Integer number = Integer.parseInt(numString);

            int[] numArray = new int[100];
            int counter = 0;

            while(number > 0){
                  numArray[counter++] = number % 10;
                  number /= 10;
            }

            int largestNumber = 0;
            for (int i = 0 ; i < counter ; i++ ) {
                  if(largestNumber < numArray[i])
                        largestNumber = numArray[i];
            }

            int numberCount = 0;
            for (int i = 0; i < counter; i++) {
                  if(largestNumber == numArray[i])
                        ++numberCount;
            }

            System.out.println("The largest number is " + largestNumber);
            System.out.println("The occurrence of the largest number is " + numberCount);
      }
}
