import javax.swing.JOptionPane;

public class InsideCircle{
      public static void main(String[] args) {
            String xString = JOptionPane.showInputDialog("Choose a X position: ");
            Double x = Double.parseDouble(xString);

            String yString = JOptionPane.showInputDialog("Choose a Y position: ");
            Double y = Double.parseDouble(yString);

            double distanceFromOrigin = Math.sqrt(Math.pow(x,2) + Math.pow(y , 2));

            final int radius = 10;

            if (distanceFromOrigin > radius)
                  System.out.print("Point (" +  x +  ", " + y + ") is outside the circle");
            else
                  System.out.print("Point (" + x + ", " + y + ") is inside the circle");
      }
}
