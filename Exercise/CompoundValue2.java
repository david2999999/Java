import javax.swing.JOptionPane;

public class CompoundValue2{
      public static void main(String[] args) {
       String depositString = JOptionPane.showInputDialog("Enter the initial deposit amount: ");
       Double deposit = Double.parseDouble(depositString);

       String percentageString = JOptionPane.showInputDialog("Enter annual percentage yield: ");
       Double annualPercentage = Double.parseDouble(percentageString);

       String periodString = JOptionPane.showInputDialog("Enter maturity period(number of monthes)");
       Integer maturityPeriod = Integer.parseInt(periodString);

       System.out.println("Month\t\t\t\tCD Value");

       double monthlyPercentage = annualPercentage / 1200;
       double sum = deposit;

            for (int i = 0; i < maturityPeriod; i++) {
                  sum = sum + sum * monthlyPercentage;
                  System.out.format("%d\t\t\t\t%.2f", (i+1), sum);
                  System.out.println();
            }
      }
}
