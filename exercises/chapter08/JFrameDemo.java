import java.awt.*;
import javax.swing.*;

public class JFrameDemo {
  public static void main(String a[]) {
    JFrame frame = new JFrame("JFrameDemo");
    JButton button = new JButton("Press me");
    frame.getContentPane().add(button, BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}