import java.awt.*;
import javax.swing.*;

public class DisplayClock extends JFrame{
      public DisplayClock(){
            StillClock clock = new StillClock();

            MessagePanel messagePanel = new MessagePanel(clock.getHour() + " : " + clock.getMinute() +
                                          " : " + clock.getSecond());
            messagePanel.setCentered(true);
            messagePanel.setForeground(Color.BLUE);
            messagePanel.setFont(new Font("Courier", Font.BOLD, 16));

            add(clock);
            add(messagePanel, BorderLayout.NORTH);
      }

      public static void main(String[] args) {
            DisplayClock frame = new DisplayClock();
            frame.setTitle("Display Clock");
            frame.setSize(500, 650);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
      }
}
