import java.awt.*;
import javax.swing.*;

public class GuiApp {
	public static void main(String[] args) {
		JFrame f=new JFrame();
//		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //ByDefault
//		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setSize(400, 300); //W,H
		f.setTitle("My App");
		f.setLocationRelativeTo(null);
//		f.getContentPane().setBackground(Color.YELLOW);
		f.getContentPane().setBackground(new Color(3, 80, 92));
		f.setLayout(null);
		
		JButton b1=new JButton("OK");
		b1.setBounds(50, 30, 60, 40); //X,Y,W,H
		f.add(b1);
		JButton b2=new JButton("Incapp");
		b2.setForeground(Color.BLUE);
		b2.setBackground(Color.YELLOW);
		b2.setBounds(120, 30, 100, 40); //X,Y,W,H
		f.add(b2);
		
		JLabel l=new JLabel("Hello Incapp");
		l.setForeground(Color.YELLOW);
		l.setBounds(50, 80, 100, 20);
		f.add(l);
		
		JTextField t1=new JTextField();
		t1.setForeground(Color.RED);
		t1.setBounds(50, 120, 100, 30);
		f.add(t1);
		
		JTextField t2=new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setBackground(Color.YELLOW);
		t2.setBounds(50, 160, 100, 30);
		f.add(t2);
	
		f.setVisible(true);
	}
}
