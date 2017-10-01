import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

public class ImageAudioAnimation extends JApplet{
      private static int NUMBER_OF_SONGS = 5;
      private int current = 0;
      private ImageIcon[] icons = new ImageIcon[NUMBER_OF_SONGS];
      private AudioClip[] audioClips = new AudioClip[NUMBER_OF_SONGS];
      private AudioClip currentAudioClip;

      private int[] delays = {48000, 54000, 59000, 54000, 59000};
      private Timer timer = new Timer(delays[0], new TimerListener());

      private JLabel jlblImageLabel = new JLabel();
      private JButton jbtResume = new JButton("Resume");
      private JButton jbtSuspend = new JButton("Suspend");
      private JComboBox jcboPokemon = new JComboBox(new Object[] {
            "pic", "pic2", "pic3", "pic4", "pic5"});

      public ImageAudioAnimation(){
            for (int i = 0; i < NUMBER_OF_SONGS; i++) {
                  icons[i] = new ImageIcon(getClass().getResource(
                        "image/pika" + i + ".gif"));
                  audioClips[i] = Applet.newAudioClip(getClass().getResource(
                                                "Audio/music" + i + ".wav"));
            }

            JPanel panel = new JPanel();
            panel.add(jbtResume);
            panel.add(jbtSuspend);
            panel.add(new JLabel("Select"));
            panel.add(jcboPokemon);
            add(jlblImageLabel, BorderLayout.CENTER);
            add(panel, BorderLayout.SOUTH);

            jbtResume.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent e){
                        start();
                  }
            });
            jbtSuspend.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent e){
                        stop();
                  }
            });
            jcboPokemon.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent e){
                        stop();
                        current = jcboPokemon.getSelectedIndex();
                        presentMusic(current);
                        timer.start();
                  }
            });

            timer.start();
            jlblImageLabel.setIcon(icons[0]);
            jlblImageLabel.setHorizontalAlignment(JLabel.CENTER);
            currentAudioClip = audioClips[0];
            currentAudioClip.play();
      }

      private class TimerListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                  current = (current + 1) % NUMBER_OF_SONGS;
                  presentMusic(current);
            }
      }

      private void presentMusic(int index){
            jlblImageLabel.setIcon(icons[index]);
            jcboPokemon.setSelectedIndex(index);
            currentAudioClip = audioClips[index];
            currentAudioClip.play();
            timer.setDelay(delays[index]);
      }

      public void start(){
            timer.start();
            currentAudioClip.play();
      }

      public void stop(){
            timer.stop();
            currentAudioClip.stop();
      }

      public static void main(String[] args) {
            JFrame frame = new JFrame("Music and GIF");
            ImageAudioAnimation animation = new ImageAudioAnimation();
            frame.add(animation);
            frame.setSize(500, 500);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
      }
}
