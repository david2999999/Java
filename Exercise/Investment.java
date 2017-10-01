import javax.swing.JOptionPane;

public class Investment{
      public static void main(String[] args) {

            String investmentString = JOptionPane.showInputDialog("Enter Investment Amount: ");
            Double investment = Double.parseDouble(investmentString);

            String monthlyInterestString = JOptionPane.showInputDialog("Enter monthly Interest rate: ");
            Double monthlyInterest = Double.parseDouble(monthlyInterestString);

            String numberOfYearsString = JOptionPane.showInputDialog("Enter number of years: ");
            Double numberOfYears = Double.parseDouble(numberOfYearsString);

            Double futureInvesmentValue = investment * Math.pow((1 + monthlyInterest), numberOfYears * 12);

            String output = "Accumulated value is " + futureInvesmentValue;
            JOptionPane.showMessageDialog(null, output);
      }
}
