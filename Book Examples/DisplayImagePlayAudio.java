import javax.swing.*;
import java.net.URL;
import java.applet.*;

public class DisplayImagePlayAudio extends JApplet{
      private AudioClip audioClip;

      public DisplayImagePlayAudio(){
            URL urlForImage = getClass().getResource("image/pika2.gif");
            add(new JLabel(new ImageIcon(urlForImage)));

            URL urlForAudio = getClass().getResource("audio/music0.wav");
            audioClip = Applet.newAudioClip(urlForAudio);
            audioClip.loop();
      }

      public void start(){
            if(audioClip != null)
                  audioClip.loop();
      }

      public void stop(){
            if(audioClip != null)
                  audioClip.stop();
      }

      public static void main(String[] args){
            JFrame frame = new JFrame("Picture and Music");
            DisplayImagePlayAudio audio = new DisplayImagePlayAudio();
            frame.add(audio);
            frame.setSize(500, 500);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
      }
}
