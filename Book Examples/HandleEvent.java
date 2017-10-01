import javax.swing.*;
import java.awt.event.*;

public class HandleEvent extends JFrame{
      public HandleEvent(){
            JButton jbtOk = new JButton("OK");
            JButton jbtCancel = new JButton("Cancel");

            JPanel panel = new JPanel();
            panel.add(jbtOk);
            panel.add(jbtCancel);

            add(panel);

            OKListenerClass listener1 = new OKListenerClass();
            CancelListenerClass listener2 = new CancelListenerClass();
            jbtOk.addActionListener(listener1);
            jbtCancel.addActionListener(listener2);
      }

            public static void main(String[] args){
                  JFrame frame = new HandleEvent();
                  frame.setTitle("Handle Event");
                  frame.setSize(200, 150);
                  frame.setLocation(200, 100);
                  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  frame.setVisible(true);
            }
}

class OKListenerClass implements ActionListener{
      public void actionPerformed(ActionEvent e){
            System.out.println("OK button clicked");
      }
}

class CancelListenerClass implements ActionListener{
      public void actionPerformed(ActionEvent e){
            System.out.println("Cancel button clicked");
      }
}
