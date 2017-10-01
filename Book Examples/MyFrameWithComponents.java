import javax.swing.*;

public class MyFrameWithComponents{
      public static void main(String[] args) {
            JFrame frame = new JFrame("Frame with Components");

            JButton jbtOk = new JButton("OK");
            frame.add(jbtOk);

            frame.setSize(500 , 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
      }
}
