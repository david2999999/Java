import javax.swing.JOptionPane;

public class FutureInvestment{
      public static void main(String[] args) {
      String investString = JOptionPane.showInputDialog("Enter the amount invested: ");
      Double amountInvested = Double.parseDouble(investString);
      String interestString = JOptionPane.showInputDialog("Enter the Annual Interest Rate: ");
      Double annualInterest = Double.parseDouble(interestString);
      String yearString = JOptionPane.showInputDialog("Enter the number of years: ");
      Integer year = Integer.parseInt(yearString);

      double monthlyInterestRate = annualInterest / 12.0;
      System.out.println("Years\t\t\tFuture Value");
            for (int i = 1; i <= year; i++) {
                  System.out.format("%d\t\t\t%.2f", i, InvestmentValue.futureInvestmentValue(amountInvested,
                                                monthlyInterestRate, i));
                  System.out.println()
            }
      }
}
