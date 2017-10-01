import javax.swing.JOptionPane;

public class ComputeLoansUsingInputDialog {
      public static void main (String[] args){

            String annualInterestRateString = JOptionPane.showInputDialog(
                  "Enter Yearly interest rate, for example 8.25: ");

            double annualInterestRate = Double.parseDouble(annualInterestRateString);

            double monthlyInterestRate = annualInterestRate / 1200;

            String numberOfYearsString = JOptionPane.showInputDialog(
                        "Enter number of  years as an integer, \n for example 5: ");

            int numberOfYears = Integer.parseInt(numberOfYearsString);

            String loanString = JOptionPane.showInputDialog(
                  "Enter Load Amount, for example 1200000.95:  " );

            double loanAmount = Double.parseDouble(loanString);

            double monthlyPayment = loanAmount * monthlyInterestRate / ( 1 - 1/ Math.pow(
                        1 + monthlyInterestRate, numberOfYears * 12));

            double totalPayment = monthlyPayment * numberOfYears * 12;

            monthlyPayment = (int)(monthlyPayment * 100)  / 100.0;
            totalPayment = (int)(totalPayment * 100) / 100.0;

            String output = "The monthly payment is " + monthlyPayment + "\n The total payment is"
                        + totalPayment ;

            JOptionPane.showMessageDialog(null, output);

      }
}
