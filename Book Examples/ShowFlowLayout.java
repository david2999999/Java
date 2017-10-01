import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class ShowFlowLayout extends JFrame{
      public ShowFlowLayout(){
            setLayout(new FlowLayout(FlowLayout.LEFT , 10 , 20));

            add(new JLabel("First Name"));
            add(new JTextField(8));
            add(new JLabel("MI"));
            add(new JTextField(1));
            add(new JLabel("Last Name"));
            add(new JTextField(8));
      }

      public static void main(String[] args) {
            ShowFlowLayout frame = new ShowFlowLayout();
            frame.setTitle("Show Flow Layout");
            frame.setSize(500, 500);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
      }
}
