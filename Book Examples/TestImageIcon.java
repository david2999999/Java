import javax.swing.*;
import java.awt.*;

public class TestImageIcon extends JFrame{
      private ImageIcon pika1Icon = new ImageIcon("image/pika.gif");
      private ImageIcon pika2Icon = new ImageIcon("image/pika2.gif");
      private ImageIcon pika3Icon = new ImageIcon("image/pika3.gif");
      private ImageIcon pika4Icon = new ImageIcon("Image/pika4.gif");
      private ImageIcon pika5Icon = new ImageIcon("image/pika5.gif");
      private ImageIcon pika6Icon = new ImageIcon("image/pika6.gif");
      private ImageIcon pika7Icon = new ImageIcon("image/pika7.gif");
      private ImageIcon pika8Icon = new ImageIcon("Image/pika8.gif");

      public TestImageIcon(){
            setLayout(new GridLayout(1 , 8 ,5 ,5));
            add(new JLabel(pika1Icon));
            add(new JLabel(pika2Icon));
            add(new JButton(pika3Icon));
            add(new JButton(pika4Icon));
            add(new JLabel(pika5Icon));
            add(new JLabel(pika6Icon));
            add(new JButton(pika7Icon));
            add(new JButton(pika8Icon));
      }

      public static void main(String[] args) {
            TestImageIcon frame = new TestImageIcon();
            frame.setTitle("Pikachu");
            frame.setSize(1000, 500);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
      }
}
