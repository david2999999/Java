import javax.swing.JOptionPane;

public class AreaOfTriangle{
      public static void main(String[] args) {
            String x1String = JOptionPane.showInputDialog("Enter x1");
            Double x1 = Double.parseDouble(x1String);

            String y1String = JOptionPane.showInputDialog("Enter y1");
            Double y1 = Double.parseDouble(y1String);

            String x2String = JOptionPane.showInputDialog("Enter x2");
            Double x2 = Double.parseDouble(x2String);

            String y2String = JOptionPane.showInputDialog("Enter y2");
            Double y2 = Double.parseDouble(y2String);

            String x3String = JOptionPane.showInputDialog("Enter x3");
            Double x3 = Double.parseDouble(x3String);

            String y3String = JOptionPane.showInputDialog("Enter y3");
            Double y3 = Double.parseDouble(y3String);

            double side1 = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), .5);
            double side2 = Math.pow(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2), .5);
            double side3 = Math.pow(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2), .5);

            double s = (side1 + side2 + side3) / 2;
            double area = Math.pow(s*(s - side1) * (s - side2) *(s - side3), .5);

            System.out.format("The area of the triangle is %.1f", area);
      }
}
