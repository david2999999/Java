import javax.swing.JOptionPane;

public class Interest{
      public static void main(String[] args) {

            String balanceString = JOptionPane.showInputDialog("Enter Balance: ");
            Double balance = Double.parseDouble(balanceString);

            String annualInterestString = JOptionPane.showInputDialog("Enter Interest Rate(e.g., 3 for 3%): ");
            Double annualInterest = Double.parseDouble(annualInterestString);

            Double interest = balance  * (annualInterest / 1200);

            String output = "The interest is " + interest;

            JOptionPane.showMessageDialog(null, output);
      }
}
