import javax.swing.JOptionPane;

public class DisplayingPyramid{
      public static void main(String[] args) {
            String numString = JOptionPane.showInputDialog("Enter a Number for the layer of pyramid: ");
            Integer number = Integer.parseInt(numString);

            for (int i = 1; i <= number; i++) {
                  for (int j = number ; j > i; j-- ) {
                        System.out.print("  ");
                  }

                  for (int j = i; j > 0; j-- ) {
                        System.out.print(j + " ");
                  }

                  for (int j = 2; j <= i ; j++ ) {
                        System.out.print(j + " ");
                  }

                  System.out.println();
            }
      }
}
