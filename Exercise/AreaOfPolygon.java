import javax.swing.JOptionPane;

public class AreaOfPolygon{
      public static void main(String[] args) {
            String numString = JOptionPane.showInputDialog("Enter the number of side of a polygon: ");
            Double numSide = Double.parseDouble(numString);

            String sideString = JOptionPane.showInputDialog("Enter the side of a polygon: ");
            Double side = Double.parseDouble(sideString);

            double area = (numSide * Math.pow(side , 2)) / (4 * Math.tan(Math.PI / numSide));

            System.out.format("The area of the polygon is %.2f", area);
      }
}
