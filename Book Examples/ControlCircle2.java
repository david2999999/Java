import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ControlCircle2 extends JFrame{
      private JButton jbtEnlarge = new JButton("Enlarge");
      private JButton jbtShrink = new JButton("Shrink");
      private CirclePanel canvas = new CirclePanel();

      public ControlCircle2(){
            JPanel panel = new JPanel();
            panel.add(jbtEnlarge);
            panel.add(jbtShrink);

            this.add(canvas, BorderLayout.CENTER);
            this.add(panel, BorderLayout.SOUTH);

            jbtEnlarge.addActionListener(new EnlargeListener());
            jbtShrink.addActionListener(new ShrinkListener());
      }

      public static void main(String[] args) {
            JFrame frame = new ControlCircle2();
            frame.setTitle("Contro Circle2");
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setVisible(true);
      }

      class ShrinkListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                  canvas.shrink();
            }
      }

      class EnlargeListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                  canvas.enlarge();
            }
      }

      class CirclePanel extends JPanel{
            private int radius = 20;

            public void enlarge(){
                  radius = radius * 2;
                  repaint();
            }

            public void shrink(){
                  radius = radius / 2;
                  repaint();
            }
            protected void paintComponent(Graphics g){
                  super.paintComponent(g);
                  g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
            }
      }
}
