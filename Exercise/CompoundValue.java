import javax.swing.JOptionPane;

public class CompoundValue{
      public static void main(String[] args) {
            String savingString = JOptionPane.showInputDialog("Enter the Amount of Saving: ");
            Double saving = Double.parseDouble(savingString);

            String interestString = JOptionPane.showInputDialog("Enter the Interest Amount: ");
            Double interestRate = Double.parseDouble(interestString);

            String monthString = JOptionPane.showInputDialog("Enter the Number of Monthes: ");
            Integer numberOfMonthes = Integer.parseInt(monthString);

            double monthlyInterestRate = (interestRate / 100) / 12;

            double sum = 0;
            for (int i = 0 ; i < numberOfMonthes ;i++ ) {
                  sum = (saving + sum) * ( 1 + monthlyInterestRate);
                  System.out.format("The value in the account after %d monthes is %.3f", (i + 1), sum);
                  System.out.println();
            }
      }
}
