import javax.swing.JOptionPane;

public class AreaOfPentagon{
      public static void main(String[] args) {
            String sideString = JOptionPane.showInputDialog("Enter the side of a pentagon: ");
            Double side = Double.parseDouble(sideString);

            double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/ 5));

            System.out.format("The area of the pentagon: %.2f", area);
      }
}
