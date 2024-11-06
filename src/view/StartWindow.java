package view;

import javax.swing.*;
import java.awt.*;

public class StartWindow {
    private JFrame frame;
    private JButton startBtn;
    private JButton endBtn;
    private JLabel label;
    public StartWindow()
    {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new BorderLayout());
        
        initComponents();
        
        frame.setVisible(true);
    }

    private void initComponents() {
        startBtn = new JButton("Start");
        endBtn = new JButton("End");
        label = new JLabel("0");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());



        panel.add(startBtn);
        panel.add(endBtn);
        panel.add(label);
        frame.add(panel);
    }

    public JButton getStartBtn()
    {
        return startBtn;
    }
    public JButton getEndBtn()
    {
        return endBtn;
    }
    public JLabel getLabel()
    {
        return label;
    }
    public void updateLabel(int seconds)
    {
        label.setText(String.valueOf(seconds));
    }
}
