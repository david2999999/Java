import javax.swing.Timer;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ball extends JPanel{
      private int delay = 10;

      private Timer timer = new Timer(delay, new TimerListener());

      private int x = 0;
      private  int y = 0;
      private int radius = 5;
      private int dx = 2;
      private int dy = 2;

      public Ball(){
            timer.start();
      }

      private class TimerListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                  repaint();
            }
      }

      protected void paintComponent(Graphics g){
            super.paintComponent(g);

            g.setColor(Color.red);

            if(x < radius) dx = Math.abs(dx);
            if(x > getWidth() - radius) dx = -Math.abs(dx);
            if(y < radius) dy = Math.abs(dy);
            if(y > getHeight() - radius) dy = -Math.abs(dy);

            x += dx;
            y+= dy;
            g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
      }

      public void suspend(){
            timer.stop();
      }

      public void resume(){
            timer.start();
      }

      public void setDelay(int delay){
            this.delay = delay;
            timer.setDelay(delay);
      }
}
