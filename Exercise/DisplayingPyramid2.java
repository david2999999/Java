import javax.swing.JOptionPane;

public class DisplayingPyramid2{
      public static void main(String[] args) {
            String numString = JOptionPane.showInputDialog("Enter the amount of layer of the pyramid: ");
            Integer number = Integer.parseInt(numString);

            for (int i = 0; i < number; i++) {
                  for (int j = number; j > i; j-- )
                        System.out.print("      ");

                  for (int k = 0; k < i ; k++ )
                        System.out.format("%3d   ", (int)Math.pow(2,k));

                  for (int p = i + 1; p >= 1; p-- ) {
                        System.out.format("%3d   ",(int)Math.pow(2, p) / 2);
                  }

                  System.out.println();
            }
      }
}
