import javax.swing.JOptionPane;
import java.util.*;

public class TimerSleep{
      public static void main(String[] args) {
            String numString = JOptionPane.showInputDialog("Enter the number of seconds: ");
            Integer seconds = Integer.parseInt(numString);

            while(seconds >= 0){
                  try{
                        Thread.sleep(1000);
                  }catch(InterruptedException e){
                        System.exit(0);
                  }

                  if( seconds != 0)
                        System.out.println(seconds + " seconds remaining.");
                  else
                        System.out.println("Stopped");

                  --seconds;
            }
      }
}
