import javax.swing.JOptionPane;

public class InsideRectangle{
      public static void main(String[] args) {
            String xString = JOptionPane.showInputDialog("Choose a X position: ");
            Double x = Double.parseDouble(xString);

            String yString = JOptionPane.showInputDialog("Choose a Y position: ");
            Double y = Double.parseDouble(yString);

            final int xRight = 5;
            final int xLeft = -5;
            final double yUp = 2.5;
            final double yBottom = -2.5;

            if( (x >= xLeft) && (x <= xRight) && (y >= yBottom) && (y <= yUp))
                  System.out.print("The point (" + x + ", " + y + ") is inside the rectangle" );
            else
                  System.out.print("The point (" + x + ", " + y + ") is not inside the rectangle" );

      }
}
