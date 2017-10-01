import javax.swing.JOptionPane;

public class InsideTriangle{
      public static void main(String[] args) {
            String xString = JOptionPane.showInputDialog("Enter X position: ");
            Double x = Double.parseDouble(xString);

            String yString = JOptionPane.showInputDialog("Enter Y position: ");
            Double y = Double.parseDouble(yString);

            double yPositionAtX = (-(0.5) * x) + 100;
            double xPositionAtY = (y - 100) / (-0.5);

            if( (x >= 0) && (y >= 0)){
                  if( (x <= xPositionAtY) && ( y <= yPositionAtX))
                        System.out.print("The point is in the triangle.");
                  else
                        System.out.print("The point is not inside the triangle.");
            }
            else
                  System.out.print("The point is not inside the triangle.");

      }
}
