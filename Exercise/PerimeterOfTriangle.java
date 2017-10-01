import javax.swing.JOptionPane;

public class PerimeterOfTriangle{
      public static void main(String[] args) {
            String num1String = JOptionPane.showInputDialog("Enter the 1st Side: ");
            Double num1 = Double.parseDouble(num1String);

            String num2String = JOptionPane.showInputDialog("Enter the 2nd Side: ");
            Double num2 = Double.parseDouble(num2String);

            String num3String = JOptionPane.showInputDialog("Enter the 3rd Side: ");
            Double num3 = Double.parseDouble(num3String);


            if( ((num1 + num2) > num3) && ((num1 + num3) > num2) && ((num2 + num3) > num1))
                        System.out.print("The perimeter of the triangle is " + (num1 + num2 + num3));
            else
                        System.out.print("This is not the side of a triangle");

      }
}
