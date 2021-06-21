package ActionEventDemo2;

import javax.swing.*;
import java.awt.event.*;

public class MyButton extends JButton implements ActionListener {
  public MyButton(String text) {
    super(text);
    addActionListener(this);
  }
  public void actionPerformed(ActionEvent e) {
    System.exit(0);
  }
}