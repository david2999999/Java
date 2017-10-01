import java.awt.*;
import javax.swing.*;

public class BounceBallApp extends JApplet{
      public BounceBallApp(){
            add(new BallControl());
      }

      public static void main(String[] args) {
            JFrame frame = new JFrame("Bounce Ball App");
            BounceBallApp NewBall = new BounceBallApp();
            frame.add(NewBall);
            frame.setSize(500, 500);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
      }
}
