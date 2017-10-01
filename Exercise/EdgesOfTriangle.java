import javax.swing.JOptionPane;

public class EdgesOfTriangle{
      public static void main(String[] args) {
            String num1String = JOptionPane.showInputDialog("Enter the 1st Side: ");
            Double num1 = Double.parseDouble(num1String);

            String num2String = JOptionPane.showInputDialog("Enter the 2nd Side: ");
            Double num2 = Double.parseDouble(num2String);

            String num3String = JOptionPane.showInputDialog("Enter the 3rd Side: ");
            Double num3 = Double.parseDouble(num3String);

            boolean triangle = false;

            if( ((num1 + num2) > num3) && ((num1 + num3) > num2) && ((num2 + num3) > num1))
                  triangle = true;

            System.out.print("Can the edges" + num1 + " , " + num2 + " , and " + num3 + " form a triangle? " + triangle);
      }
}
