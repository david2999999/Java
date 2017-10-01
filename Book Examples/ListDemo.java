import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListDemo extends JFrame{
      final int NUMBER_OF_POKEMONS = 9;

      private String[] pokeNames = {"poke1", "poke2", "poke3","poke4", "poke5",
                                                        "poke6","poke7", "poke8", "poke9"};

      private JList<String> jlist = new JList<String>(pokeNames);

      private ImageIcon[] imageIcons = {
            new ImageIcon("image/poke10.gif"),
            new ImageIcon("image/poke11.gif"),
            new ImageIcon("image/poke12.gif"),
            new ImageIcon("image/poke13.gif"),
            new ImageIcon("image/poke14.gif"),
            new ImageIcon("image/poke15.gif"),
            new ImageIcon("image/poke16.gif"),
            new ImageIcon("image/poke17.gif"),
            new ImageIcon("image/poke18.gif"),
      };

      private JLabel[] jlblImageViewer = new JLabel[NUMBER_OF_POKEMONS];

      public static void main(String[] args) {
            ListDemo frame = new ListDemo();
            frame.setSize(550,500);
            frame.setTitle("List Demo");
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
      }

      public ListDemo(){
            JPanel p = new JPanel(new GridLayout(3 , 3 , 5, 5));

            for (int i = 0; i < NUMBER_OF_POKEMONS; i++) {
                  p.add(jlblImageViewer[i] = new JLabel());
                  jlblImageViewer[i].setHorizontalAlignment(SwingConstants.CENTER);
            }

            add(p, BorderLayout.CENTER);
            add(new JScrollPane(jlist),BorderLayout.WEST);

            jlist.addListSelectionListener(new ListSelectionListener(){
                  public void valueChanged(ListSelectionEvent e){
                        int[] indices = jlist.getSelectedIndices();
                        int i;
                        for (i = 0; i < indices.length; i++) {
                              jlblImageViewer[i].setIcon(imageIcons[indices[i]]);
                        }

                        for (; i < NUMBER_OF_POKEMONS ;i++ ) {
                              jlblImageViewer[i].setIcon(null);
                        }
                  }
            });
      }
}
