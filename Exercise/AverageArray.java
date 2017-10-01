import javax.swing.JOptionPane;

public class AverageArray{
      public static void main(String[] args) {
            int[] array = new int[10];
            int counter = 0;

            while(counter != 10){
                  String numString = JOptionPane.showInputDialog("Enter a number: ");
                  Integer number = Integer.parseInt(numString);
                  array[counter++] = number;
            }

            System.out.print(average(array));
      }

      public static int average(int[] array){
            int sum = 0;
            for (int i = 0; i < array.length; i++ ) {
                  sum += array[i];
            }
            int average = sum / array.length;
            return average;
      }

      public static double average(double[] array){ // function overload
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                  sum += array[i];
            }
            double average = sum / array.length;
            return average;
      }
}
