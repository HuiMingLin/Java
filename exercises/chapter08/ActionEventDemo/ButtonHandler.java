package ActionEventDemo;

import java.awt.event.*;

public class ButtonHandler implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    System.out.printf("Action occurred ");
  }
}