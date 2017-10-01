import javax.swing.*;

public class DisplayImageWithURL extends JApplet{
      public DisplayImageWithURL(){
            java.net.URL url = this.getClass().getResource("image/pika.gif");
            add(new JLabel(new ImageIcon(url)));
      }

      public static void main(String[] args){
            JFrame frame = new JFrame("Display image with URL");
            DisplayImageWithURL image = new DisplayImageWithURL();
            frame.add(image);
            frame.setSize(500, 500);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
      }
}
