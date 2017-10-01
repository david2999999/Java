import javax.swing.JOptionPane;

public class QuadraticEquation{
      public static void main(String[] args) {
            String aString = JOptionPane.showInputDialog("Enter a: ");
            Double a = Double.parseDouble(aString);

            String bString = JOptionPane.showInputDialog("Enter b: ");
            Double b = Double.parseDouble(bString);

            String cString = JOptionPane.showInputDialog("Enter c: ");
            Double c = Double.parseDouble(cString);

            double discriminant = Math.pow(b, 2) - (4 * a * c);

            if (discriminant > 0) {
                  double r1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)) )/ (2 * a);
                  double r2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

                  System.out.format("The roots are %.4f and %.4f", r1, r2);
            }else if (discriminant == 0) {
                  double r1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)))/ (2 * a);

                  System.out.format("The roots is %.4f", r1);
            }else
                  System.out.print("The equation has no real roots");

      }
}
