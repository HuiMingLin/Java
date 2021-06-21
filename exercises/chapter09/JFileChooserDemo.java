import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class JFileChooserDemo implements ActionListener {
  JFrame frame = new JFrame("JFileChooserDemo");
  JFileChooser fc = new JFileChooser();
  JTextField tf = new JTextField();
  JButton openButton, saveButton, deleteButton;

  public static void main(String args[]) {
    JFileChooserDemo fcd = new JFileChooserDemo();
    fcd.go();
  }

  public void go() {
    ImageIcon openIcon = new ImageIcon("open.gif");
    openButton = new JButton("Open a File...", openIcon);
    openButton.addActionListener(this);
    
    ImageIcon saveIcon = new ImageIcon("save.gif");
    saveButton = new JButton("Save a File...", saveIcon);
    saveButton.addActionListener(this);

    ImageIcon deletIcon = new ImageIcon("delete.gif");
    deleteButton = new JButton("Delete a File...", deletIcon);
    deleteButton.addActionListener(this);
    
    JPanel jp = new JPanel();
    jp.add(openButton);
    jp.add(saveButton);
    jp.add(deleteButton);

    Container cp = frame.getContentPane();
    cp.add(jp, BorderLayout.CENTER);
    cp.add(tf, BorderLayout.SOUTH);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    JButton button = (JButton)e.getSource();
    if(button == openButton) {
      int select = fc.showOpenDialog(frame);
      if(select == JFileChooser.APPROVE_OPTION) {
        File file = fc.getSelectedFile();
        tf.setText("Opening: " + file.getName());
      } else {
        tf.setText("Open command cancelled by user");
      }
    }
    if(button == saveButton) {
      int select = fc.showSaveDialog(frame);
      if(select == JFileChooser.APPROVE_OPTION) {
        File file = fc.getSelectedFile();
        tf.setText("Saving: " + file.getName());
      } else {
        tf.setText("Save command cancelled by user");
      }
    }
    if(button == deleteButton) {
      int select = fc.showDialog(frame, "删除");
      if(select == JFileChooser.APPROVE_OPTION) {
        File file = fc.getSelectedFile();
        tf.setText("Deleting: " + file.getName());
      } else {
        tf.setText("Delete command cancelled by user");
      }
    }
  }
}