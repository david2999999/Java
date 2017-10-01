import javax.swing.JOptionPane;

public class FinancialApplication{
      public static void main(String[] args) {
            String loanString = JOptionPane.showInputDialog("Enter Loan Amount: ");
            Double loanAmount = Double.parseDouble(loanString);
            String yearString = JOptionPane.showInputDialog("Enter Number of Years");
            Integer numberOfYears = Integer.parseInt(yearString);

            System.out.println("Interest Rate (%) \t\tMonthly Payment \t\t\t\tTotal Payment");
            System.out.println();

            double annualInterestRate = 5.000;
            for (int i = 0; i <= 24; i++) {
                  System.out.format("%.3f \t\t\t\t %.2f \t\t\t\t\t %.2f",
                        annualInterestRate, monthlyPayment(annualInterestRate,loanAmount,numberOfYears),
                        totalPayment(monthlyPayment(annualInterestRate,loanAmount,numberOfYears), numberOfYears) );
                  System.out.println();
                  annualInterestRate += .125;
            }

      }

      public static double monthlyPayment(double annualInterestRate, double loanAmount, int numberOfYears){
            double monthlyInterestRate = annualInterestRate / 1200;

            return loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
      }

      public static double totalPayment(double monthlyPayment, int numberOfYears){
            return monthlyPayment * numberOfYears * 12;
      }
}
