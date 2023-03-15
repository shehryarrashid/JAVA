package Graphical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame = new JFrame();
    private JButton button;
    private JPanel panel = new JPanel();
    public GUI(){


        button = new JButton("Click Me");
        button.addActionListener(this);
        this.label = new JLabel("Number Of Clicks: 0");

        panel.setBorder(BorderFactory.createEmptyBorder(90,90,200,200));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Shehryar GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        this.count++;
        label.setText("Number Of Clicks: " + count);
    }


    public static void main(String[] args) {
        new GUI();
    }


}
