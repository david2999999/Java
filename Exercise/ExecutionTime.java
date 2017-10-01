import javax.swing.JOptionPane;

public class ExecutionTime{
      public static void main(String[] args) {
            int[] array = new int[100000000];
            int low = 0;
            int high = array.length - 1;

            for (int i = 0; i < array.length; i++) {
                  array[i] = i;
            }

            String numString = JOptionPane.showInputDialog("Enter a number: ");
            Integer number = Integer.parseInt(numString);

            long startTime = System.currentTimeMillis();
            for (int i = 0 ; i < array.length; i++ ) {
                  if(array[i] == number)
                        break;
            }
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;

            System.out.println("The time used for linear search is " + executionTime + " ms");

            long startTime2 = System.nanoTime();
            while(low <= high){
                  int medium = (low + high) / 2;
                  if(number > array[medium])
                        low = medium + 1;
                  else if(number < array[medium])
                        high = medium - 1;
                  else{
                        System.out.println(medium);
                        break;
                  }
            }
            long endTime2 = System.nanoTime();
            long executionTime2 = endTime2 - startTime2;

            System.out.println("The time used for binary search is " + executionTime2 + " ns");
      }
}
