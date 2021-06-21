import java.awt.*;
import javax.swing.*;

public class JFrameDemo2 {
  public static void main(String a[]) {
    JFrame frame = new JFrame("JFrameDemo2");
    JButton button = new JButton("Press me");
    JPanel contentPane = new JPanel();
    contentPane.setLayout(new BorderLayout());
    contentPane.add(button, BorderLayout.CENTER);
    frame.setContentPane(contentPane);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}