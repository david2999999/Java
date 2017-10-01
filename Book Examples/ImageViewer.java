import javax.swing.*;
import java.awt.*;

public class ImageViewer extends JPanel{
      private java.awt.Image image;
      private boolean stretched = true;
      private int xCoordinate;
      private int yCoordinate;

      public ImageViewer(){
      }

      public ImageViewer(Image image){
            this.image = image;
      }

      protected void paintComponent(Graphics g){
            super.paintComponent(g);

            if(image != null)
                  if(isStretched())
                        g.drawImage(image, xCoordinate, yCoordinate, getWidth(), getHeight(), this);
                  else
                        g.drawImage(image, xCoordinate, yCoordinate, this);
      }

      public java.awt.Image getImage(){
            return image;
      }

      public void setImage(java.awt.Image image){
            this.image = image;
            repaint();
      }

      public boolean isStretched(){
            return stretched;
      }

      public void setStretched(boolean stretched){
            this.stretched = stretched;
            repaint();
      }

      public int getXCoordinate(){
            return xCoordinate;
      }

      public void setXCoordinate(int xCoordinate){
            this.xCoordinate = xCoordinate;
            repaint();
      }

      public int getYCoordinate(){
            return yCoordinate;
      }

      public void setYCoordinate(int yCoordinate){
            this.yCoordinate = yCoordinate;
            repaint();
      }
}
