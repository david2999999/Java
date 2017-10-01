import javax.swing.JOptionPane;

public class Distance{
      public static void main(String[] args) {
            String x1String = JOptionPane.showInputDialog("Enter x1");
            Double x1 = Double.parseDouble(x1String);

            String y1String = JOptionPane.showInputDialog("Enter y1");
            Double y1 = Double.parseDouble(y1String);

            String x2String = JOptionPane.showInputDialog("Enter x2");
            Double x2 = Double.parseDouble(x2String);

            String y2String = JOptionPane.showInputDialog("Enter y2");
            Double y2 = Double.parseDouble(y2String);

            double distance = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), .5);

            System.out.format("The distance of two points is %.3f", distance);
      }
}
