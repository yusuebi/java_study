import java.awt.FlowLayout;
import javax.swing.*;
pulic class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("はじめてのGUI");
    JFrame frame = new JFrame("Hell World!!");
    JButton button = new JButton("押してね");
    frame.getContentPane().setLayout(newFlowLayout());
    frame.getContentPane().add(label);
    frame.getContentPane().add(button);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 100);
    frame.setVisible(true);
  }
}
