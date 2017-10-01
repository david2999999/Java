import javax.swing.*;

public class DisplayLabel extends JApplet{
      public DisplayLabel(){
            add(new JLabel("Great"), JLabel.CENTER);
      }


public static void main(String[] args) {
      JFrame frame = new JFrame("Applet is in the frame");

      DisplayLabel applet = new DisplayLabel();

      frame.add(applet);


      frame.setSize(300, 100);
      frame.setLocationRelativeTo(null); // Center the frame
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      }
}
