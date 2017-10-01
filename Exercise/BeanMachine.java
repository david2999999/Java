import javax.swing.JOptionPane;
import java.util.*;

public class BeanMachine{
      public static void main(String[] args) {
            String ballString = JOptionPane.showInputDialog("Enter the number of balls: ");
            Integer balls = Integer.parseInt(ballString);
            String slotString = JOptionPane.showInputDialog("Enter the number of slots: ");
            Integer slot = Integer.parseInt(slotString);

            int[] slots = new int[slot];
            String[] direction = new String[slot];

            for (int i = 0; i < balls; i++ ) {
                  int counter = 0;
                  int sum = 0;
                  for (int j = 0; j < slot; j++ ) {
                        double number = Math.random();
                        if(number <.5)
                              direction[counter++] = "L";
                        else
                              direction[counter++] = "R";
                  }
                  for (int k = 0; k < counter; k++) {
                        System.out.print(direction[k]);
                  }
                  System.out.println();

                  for (int p = 0; p < counter; p++ ) {
                        if(direction[p] == "R")
                              ++sum;
                  }
                  ++slots[sum - 1];
            }

            //finding maximum number of ball in the slots
            int max = slots[0];
            for (int i = 1; i < slots.length;i++ ) {
                  if(max < slots[i])
                        max = slots[i];
            }

            System.out.println();

                  for (int i = max; i > 0 ; i-- ) {
                        for (int j = 0; j < slots.length; j++ ) {
                              if(slots[j] == i){
                                    --slots[j];
                                    System.out.print("0|");
                              }
                              else
                                    System.out.print(" |");
                        }
                              System.out.println();
                  }

      }
}
