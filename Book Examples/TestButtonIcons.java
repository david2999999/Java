import javax.swing.*;

public class TestButtonIcons extends JFrame{
      public static void main(String[] args) {
            JFrame frame = new TestButtonIcons();
            frame.setTitle("Button Icons");
            frame.setSize(500, 300);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
      }

      public TestButtonIcons(){
            ImageIcon pika = new ImageIcon("image/pika.gif");
            ImageIcon pika2 = new ImageIcon("image/pika2.gif");
            ImageIcon pika3 = new ImageIcon("image/pika3.gif");

            JButton jbt = new JButton("Click it", pika);
            jbt.setPressedIcon(pika2);
            jbt.setRolloverIcon(pika3);

            add(jbt);
      }
}
