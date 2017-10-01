import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxDemo extends JFrame{
      private String[] pokeNames = {"poke1", "poke2", "poke3", "poke4", "poke5", "poke6",
                                                            "poke7", "poke8", "poke9"};

      private ImageIcon[] pokeImage = {
            new ImageIcon("image/poke1.gif"),
            new ImageIcon("image/poke2.gif"),
            new ImageIcon("image/poke3.gif"),
            new ImageIcon("image/poke4.gif"),
            new ImageIcon("image/poke5.gif"),
            new ImageIcon("image/poke6.gif"),
            new ImageIcon("image/poke7.gif"),
            new ImageIcon("image/poke8.gif"),
            new ImageIcon("image/poke9.gif"),
      };

      private String[] pokeDescription = new String[9];
      private DescriptionPanel descriptionPanel = new DescriptionPanel();
      private JComboBox<String> jcbo = new JComboBox<String>(pokeNames);

      public static void main(String[] args) {
            ComboBoxDemo frame = new ComboBoxDemo();
            frame.pack();
            frame.setTitle("Combo Box Demo");
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
      }

      public ComboBoxDemo(){
            pokeDescription[0] = "1st Pokemon";
            pokeDescription[1] = "2nd Pokemon";
            pokeDescription[2] = "3rd Pokemon";
            pokeDescription[3] = "4th Pokemon";
            pokeDescription[4] = "5th Pokemon";
            pokeDescription[5] = "6th Pokemon";
            pokeDescription[6] = "7th Pokemon";
            pokeDescription[7] = "8th Pokemon";
            pokeDescription[8] = "9th Pokemon";

            setDisplay(0); // set the first pokemon for display

            add(jcbo, BorderLayout.NORTH);
            add(descriptionPanel, BorderLayout.CENTER);

            jcbo.addItemListener(new ItemListener(){
                  public void itemStateChanged(ItemEvent e){
                        setDisplay(jcbo.getSelectedIndex());
                  }
            });
      }

      public void setDisplay(int index){
            descriptionPanel.setTitle(pokeNames[index]);
            descriptionPanel.setImageIcon(pokeImage[index]);
            descriptionPanel.setDescription(pokeDescription[index]);
      }
}
