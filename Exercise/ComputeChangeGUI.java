import javax.swing.JOptionPane;

public class ComputeChangeGUI{
      public static void main(String[] args) {

            String amountString = JOptionPane.showInputDialog("Enter the amount to be calculated");
            double amount = Double.parseDouble(amountString);

            int remainingAmount = (int)(amount * 100);

            int numberOfOneDollars = remainingAmount / 100;
            remainingAmount = remainingAmount % 100;

            int numberOfQuarters = remainingAmount / 25;
            remainingAmount = remainingAmount % 25;

            int numberOfDimes = remainingAmount/ 10;
            remainingAmount = remainingAmount % 10;

            int numberOfNickels = remainingAmount / 5;
            remainingAmount = remainingAmount % 5;

            int numberOfPennies = remainingAmount;

            String output = "Your amount  " + amountString + " consist of \n" + numberOfOneDollars + " dollars\n" + numberOfQuarters
                        + " quarters\n" + numberOfDimes + " dimes\n" + numberOfNickels + " nickels\n" +
                        numberOfPennies + " pennies\n";

            JOptionPane.showMessageDialog(null, output);
      }
}
