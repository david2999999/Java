import javax.swing.JOptionPane;

public class Energy{
      public static void main(String[] args) {
            String waterString = JOptionPane.showInputDialog("Enter the amount of water in kilogram: ");
            Double water = Double.parseDouble(waterString);

            String initialTempString = JOptionPane.showInputDialog("Enter the initial Temperature: ");
            Double initialTemp = Double.parseDouble(initialTempString);

            String finalTempString = JOptionPane.showInputDialog("Enter the final temperature: ");
            Double finalTemp = Double.parseDouble(finalTempString);

            double Q = water * (finalTemp - initialTemp) * 4184;

            String output = "The energy needed is " + Q;

            JOptionPane.showMessageDialog(null, output);
      }
}
