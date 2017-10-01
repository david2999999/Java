import javax.swing.JOptionPane;

public class AreaOfHexagon{
      public static void main(String[] args) {
            String sideString = JOptionPane.showInputDialog("Enter the Side: ");
            Double side = Double.parseDouble(sideString);

            double area = ((3 * Math.pow(3 , .5)) / 2) * Math.pow(side, 2);

            System.out.format("The area of the hexagon is %.4f", area);
      }
}
