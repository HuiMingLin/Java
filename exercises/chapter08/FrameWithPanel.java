import java.awt.*;
import javax.swing.*;

public class FrameWithPanel {
  public static void main(String a[]) {
    JFrame frame = new JFrame("Frame with Panel");
    Container contentPane = frame.getContentPane();
    contentPane.setBackground(Color.CYAN);
    JPanel panel = new JPanel();
    panel.setBackground(Color.yellow);
    JButton button = new JButton("Press me ");
    panel.add(button);
    contentPane.add(panel, BorderLayout.SOUTH);
    frame.setSize(300, 200);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}