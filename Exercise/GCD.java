import javax.swing.JOptionPane;

public class GCD{
      public static void main(String[] args) {
            String n1String = JOptionPane.showInputDialog("Enter the 1st number: ");
            Integer n1 = Integer.parseInt(n1String);

            String n2String = JOptionPane.showInputDialog("Enter the 2nd number: ");
            Integer n2 = Integer.parseInt(n2String);

            int min;
            int gcd;
            if( (n1 - n2 ) >= 0)
                  min = n2;
            else
                  min = n2;

            while(true){
                  if( ((n1 % min) == 0) && ((n2 % min) == 0) ){
                        gcd = min;
                        break;
                  }
                  --min;
            }

            if( (n1 > 0) && (n2 > 0) )
                  System.out.print("The gcd of the two integers is : " + gcd);
            else
                  System.out.print("Only Positive Integers are allowed.");
      }
}
