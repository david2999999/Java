import java.awt.*;
import javax.swing.*;

public class TextAreaDemo extends JFrame{
      private DescriptionPanel descriptionPanel = new DescriptionPanel();

      public static void main(String[] args) {
            TextAreaDemo frame = new TextAreaDemo();
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
      }

      public TextAreaDemo(){
            descriptionPanel.setTitle("Pikachu");
            String description = "Hello, Hello, Pikachu here";
            descriptionPanel.setDescription(description);
            descriptionPanel.setImageIcon(new ImageIcon("image/pika9.gif"));

            setLayout(new BorderLayout());
            add(descriptionPanel, BorderLayout.CENTER);
      }
}
