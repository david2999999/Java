import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo extends JFrame{
      private JSlider jsldHort = new JSlider(JSlider.HORIZONTAL);
      private JSlider jsldVert = new JSlider(JSlider.VERTICAL);

      private MessagePanel messagePanel = new MessagePanel("Welcome to Java");

      public static void main(String[] args) {
            SliderDemo frame = new SliderDemo();
            frame.setTitle("Slider Demo");
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
      }

      public SliderDemo(){
            setLayout(new BorderLayout(5, 5));
            add(messagePanel, BorderLayout.CENTER);
            add(jsldVert, BorderLayout.EAST);
            add(jsldHort, BorderLayout.SOUTH);

            jsldHort.setMaximum(50);
            jsldHort.setPaintLabels(true);
            jsldVert.setPaintTicks(true);
            jsldHort.setMajorTickSpacing(10);
            jsldHort.setMinorTickSpacing(1);
            jsldHort.setPaintTrack(false);
            jsldVert.setInverted(true);
            jsldVert.setMaximum(10);
            jsldVert.setPaintLabels(true);
            jsldVert.setPaintTicks(true);
            jsldVert.setMajorTickSpacing(10);
            jsldVert.setMinorTickSpacing(1);

            jsldHort.addChangeListener(new ChangeListener(){
                  public void stateChanged(ChangeEvent e){
                        double value = jsldHort.getValue();
                        double maximumValue = jsldHort.getMaximum();
                        double newX = (value * messagePanel.getWidth() / maximumValue);
                        messagePanel.setXCoordinate((int)newX);
                  }
            });

            jsldVert.addChangeListener(new ChangeListener(){
                  public void stateChanged(ChangeEvent e){
                        double value = jsldVert.getValue();
                        double maximumValue = jsldVert.getMaximum();
                        double newY = (value * messagePanel.getHeight() / maximumValue);
                        messagePanel.setYCoordinate((int)newY);
                  }
            });
      }
}
