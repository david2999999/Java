import javax.swing.*;
import java.awt.*;

public class SixFlags extends JFrame{
      public SixFlags() {
            Image image1 = new ImageIcon("image/pika.gif").getImage();
            Image image2 = new ImageIcon("image/pika2.gif").getImage();
            Image image3 = new ImageIcon("image/pika3.gif").getImage();
            Image image4 = new ImageIcon("image/pika4.gif").getImage();
            Image image5 = new ImageIcon("image/pika5.gif").getImage();
            Image image6 = new ImageIcon("image/pika6.gif").getImage();

            setLayout(new GridLayout(2, 0 , 5 , 5));
            add(new ImageViewer(image1));
            add(new ImageViewer(image2));
            add(new ImageViewer(image3));
            add(new ImageViewer(image4));
            add(new ImageViewer(image5));
            add(new ImageViewer(image6));
      }

      public static void main(String[] args) {
            SixFlags frame = new SixFlags();
            frame.setTitle("Six Figures");
            frame.setSize(400, 320);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
      }
}
