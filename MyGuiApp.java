package myguiapp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyGuiApp {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(450, 350);
        f.setLayout(null);
        f.setTitle("Mini Calci");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.getContentPane().setBackground(Color.YELLOW);
        JLabel l1 = new JLabel("Enter a number:");
        l1.setBounds(60, 60, 120, 30);
        f.add(l1);
        JTextField t1 = new JTextField();
        t1.setBounds(180, 60, 120, 30);
        f.add(t1);
        JLabel l2 = new JLabel("Enter a number:");
        l2.setBounds(60, 110, 120, 30);
        f.add(l2);
        JTextField t2 = new JTextField();
        t2.setBounds(180, 110, 120, 30);
        f.add(t2);
        JButton b1 = new JButton("+");
        b1.setBounds(60, 170, 50, 40);
        b1.setForeground(Color.BLUE);
        b1.setBackground(Color.PINK);
        f.add(b1);
        JButton b2 = new JButton("-");
        b2.setBounds(120, 170, 50, 40);
        b2.setForeground(Color.BLUE);
        b2.setBackground(Color.PINK);
        f.add(b2);
        JButton b3 = new JButton("*");
        b3.setBounds(180, 170, 50, 40);
        b3.setForeground(Color.BLUE);
        b3.setBackground(Color.PINK);
        f.add(b3);
        JButton b4 = new JButton("/");
        b4.setBounds(240, 170, 50, 40);
        b4.setForeground(Color.BLUE);
        b4.setBackground(Color.PINK);
        f.add(b4);
        JButton b5 = new JButton("%");
        b5.setBounds(300, 170, 50, 40);
        b5.setForeground(Color.BLUE);
        b5.setBackground(Color.PINK);
        f.add(b5);
        JLabel l3 = new JLabel("Answer: ");
        l3.setBounds(60, 240, 100, 30);
        f.add(l3);
        JLabel l4 = new JLabel(".......");
        l4.setBounds(150, 240, 200, 30);
        f.add(l4);
        f.setVisible(true);

        class B1Action implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = t1.getText();
                String s2 = t2.getText();
                int n1 = Integer.parseInt(s1);
                int n2 = Integer.parseInt(s2);
                int n = n1 + n2;
                l4.setText(n + "");
            }
        }
        b1.addActionListener(new B1Action());
        
        class B2Action implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = t1.getText();
                String s2 = t2.getText();
                int n1 = Integer.parseInt(s1);
                int n2 = Integer.parseInt(s2);
                int n = n1 - n2;
                l4.setText(n + "");
            }
        }
        b2.addActionListener(new B2Action());
        
        class B3Action implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = t1.getText();
                String s2 = t2.getText();
                int n1 = Integer.parseInt(s1);
                int n2 = Integer.parseInt(s2);
                int n = n1 * n2;
                l4.setText(n + "");
            }
        }
        b3.addActionListener(new B3Action());
        
        class B4Action implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = t1.getText();
                String s2 = t2.getText();
                int n1 = Integer.parseInt(s1);
                int n2 = Integer.parseInt(s2);
                int n = n1 / n2;
                l4.setText(n + "");
            }
        }
        b4.addActionListener(new B4Action());
        
        class B5Action implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = t1.getText();
                String s2 = t2.getText();
                int n1 = Integer.parseInt(s1);
                int n2 = Integer.parseInt(s2);
                int n = n1 % n2;
                l4.setText(n + "");
            }
        }
        b5.addActionListener(new B5Action());
        
        
    }
}
