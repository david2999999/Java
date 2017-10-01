import java.awt.*;
import javax.swing.*;

public class MessagePanel extends JPanel{
      private String message = "Welcome To Java";
      private int xCoordinate = 20;
      private int yCoordinate = 20;
      private boolean centered;
      private int interval = 10;

      public MessagePanel(){
      }

      public MessagePanel(String message){
            this.message = message;
      }

      public String getMessage(){
            return message;
      }

      public void setMessage(String message){
            this.message = message;
            repaint();
      }

      public int getXCoordinate(){
            return xCoordinate;
      }

      public void setXCoordinate(int x){
            this.xCoordinate = x;
            repaint();
      }

      public int getYCoordinate(int y){
            return yCoordinate;
      }

      public void setYCoordinate(int y){
            this.yCoordinate = y;
            repaint();
      }

      public boolean isCentered(){
            return centered;
      }

      public void setCentered(boolean centered){
            this.centered = centered;
            repaint();
      }

      public int getInterval(){
            return interval;
      }

      public void setInterval(int interval){
            this.interval = interval;
            repaint();
      }

      protected void paintComponent(Graphics g){
            super.paintComponent(g);

            if(centered){
                  FontMetrics fm = g.getFontMetrics();

                  int stringWidth = fm.stringWidth(message);
                  int stringAscent = fm.getAscent();

                  xCoordinate = getWidth() / 2 - stringWidth / 2;
                  yCoordinate = getHeight() / 2 + stringAscent / 2;
            }

            g.drawString(message, xCoordinate, yCoordinate);
      }

      public void moveLeft(){
            xCoordinate -= interval;
            repaint();
      }

      public void moveRight(){
            xCoordinate += interval;
            repaint();
      }

      public void moveUp(){
            yCoordinate -= interval;
            repaint();
      }

      public void moveDown(){
            yCoordinate += interval;
            repaint();
      }

      public Dimension getPerferredSize(){
            return new Dimension(200, 30);
      }

}
