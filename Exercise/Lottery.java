import javax.swing.JOptionPane;
import java.lang.*;

public class Lottery{
      public static void main(String[] args) {
            String num1String = JOptionPane.showInputDialog("Enter the 1st Number: ");
            Integer num1 = Integer.parseInt(num1String);

            String num2String = JOptionPane.showInputDialog("Enter the 2nd Number: ");
            Integer num2 = Integer.parseInt(num2String);

            String num3String = JOptionPane.showInputDialog("Enter the 3rd Number: ");
            Integer num3 = Integer.parseInt(num3String);

            int n1 = (int)Math.floor(Math.random() * 101); // Generates a random number from 0 to 100 for the lottery
            int n2 = (int)Math.floor(Math.random() * 101);
            int n3 = (int)Math.floor(Math.random() * 101);

            int[] userArray = {num1, num2 , num3};
            int[] lottery = {n1, n2 , n3};

            int counter1 = 0;
            for (int i = 0; i < 3; i++) {
                  if(userArray[i] == lottery[i])
                        ++counter1;
            }

            if(counter1 == 3)
                  System.out.print("Congratulation you won $10,000");
            else{
                  int counter2 = 0;
                  for (int i = 0; i < 3 ; i++) {
                        for (int j = 0; j < 3; j++) {
                              if(userArray[i] == lottery[j])
                                    ++counter2;
                        }
                  }
                  if (counter2 == 3)
                        System.out.print("Congratulation you won $3,000");
                  else if (counter2 == 2)
                              System.out.print("Congratulation you won $2,000");
                  else if (counter2 == 1)
                        System.out.print("Congratulation you won $1,000");
                  else
                        System.out.print("Sorry no match!");
            }
      }
}
