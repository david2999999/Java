import javax.swing.*;

public class GUIComponents{
      public static void main(String[] args) {
            JButton jbtOK = new JButton("OK");
            JButton jbtCancel = new JButton("Cancel");
            JLabel JlblName = new JLabel("Enter your name: ");
            JTextField jtfName = new JTextField("Typer Name here");
            JCheckBox jchkBold = new JCheckBox("Bold");
            JCheckBox jchkItalic = new JCheckBox("Italic");
            JRadioButton jrbRed = new JRadioButton("Red");
            JRadioButton jrbYellow = new JRadioButton("Yellow");
            JComboBox <String> jcboColor = new JComboBox <String> (new String[]{"Freshman", "Sophomore","Junior", "Senior"});

            // CREATING A PANEL TO GROUP COMPONENTS
            JPanel panel = new JPanel();
            panel.add(jbtOK);
            panel.add(jbtCancel);
            panel.add(JlblName);
            panel.add(jtfName);
            panel.add(jchkBold);
            panel.add(jchkItalic);
            panel.add(jrbRed);
            panel.add(jrbYellow);
            panel.add(jcboColor);

            // CREATE A FRAME FOR THE PANEL
            JFrame frame  =  new JFrame();
            frame.add(panel);
            frame.setTitle("Show Gui Components");
            frame.setSize(450, 100);
            frame.setLocation(200,100);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
      }
}
