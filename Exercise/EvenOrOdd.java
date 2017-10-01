import javax.swing.JOptionPane;

public class EvenOrOdd{
      public static void main(String[] args) {
            String numberString = JOptionPane.showInputDialog("Enter an Integer : ");
            Integer number = Integer.parseInt(numberString);

            if((number % 2) == 0)
                  System.out.print("The number " + number + " is even");
            else
                  System.out.print("The number "+ number + " is odd");
      }
}
