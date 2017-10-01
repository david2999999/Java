import javax.swing.JOptionPane;

public class WindChill{
      public static void main(String[] args) {
            String tempString = JOptionPane.showInputDialog("Enter the temperature in Fahrenheit: ");
            Double temperature = Double.parseDouble(tempString);

            String windSpeedString = JOptionPane.showInputDialog("Enter the wind speed miles per hour: ");
            Double windSpeed = Double.parseDouble(windSpeedString);

            double twc = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

            JOptionPane.showMessageDialog(null, String.format("The wind chill index is %.3f", twc ));
      }
}
