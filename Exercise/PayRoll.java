import javax.swing.JOptionPane;

public class PayRoll{
      public static void main(String[] args) {
            String name = JOptionPane.showInputDialog("Enter Employee's Name: ");

            String hourString = JOptionPane.showInputDialog("Enter number of hours worked in a week: ");
            Double hour = Double.parseDouble(hourString);

            String payRateString = JOptionPane.showInputDialog("Enter Hourly Pay Rate: ");
            Double payRate = Double.parseDouble(payRateString);

            String federalTaxWithHoldString = JOptionPane.showInputDialog("Enter federal tax withholding rate: ");
            Double federalTaxWithHold = Double.parseDouble(federalTaxWithHoldString);

            String stateTaxWithHoldString = JOptionPane.showInputDialog("Enter State tax withholding rate: ");
            Double stateTaxWithHold = Double.parseDouble(stateTaxWithHoldString);

            double grossPay = hour * payRate;
            double federalWithHolding = grossPay * federalTaxWithHold;
            double stateWithholding = grossPay * stateTaxWithHold;
            double totalDeduction = federalWithHolding + stateWithholding;
            double netPay = grossPay - totalDeduction;

            String output = "Employee Name: " + name +
                                    "\nHours Worked: " + hour +
                                     "\nPay Rate: $" + payRate +
                                     "\nGross Pay: $" + grossPay +
                                     "\nDeductions: \n" +
                                          "\n\tFederal Withholding  (" + federalTaxWithHold * 100 + "%): $" + federalWithHolding +
                                          "\n\tState Withholding (" + stateTaxWithHold * 100  +"%): $" + stateWithholding +
                                          "\n\tTotal Deduction: $" + totalDeduction +
                                    "\nNet Pay: $" + netPay;

            JOptionPane.showMessageDialog(null, output);
      }
}
