
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SJF {
    JFrame frame;
    JButton p1, p2, p3, p4;
	int bt1, bt2, bt3, bt4;
    
    public SJF(String p1, String p2, String p3, String p4) {
		frame = new JFrame("SJF");
		
		this.bt1 = Integer.parseInt(p1);
		this.bt2 = Integer.parseInt(p2);
		this.bt3 = Integer.parseInt(p3);
		this.bt4 = Integer.parseInt(p4);
		
		this.p1 = new JButton("P1");
		this.p1.setBounds(5,5,bt1,20);
		this.p1.setBackground(Color.BLACK);
		
		this.p2 = new JButton("P2");
		this.p2.setBounds(5+bt1,5,bt2,20);
		this.p2.setBackground(Color.BLUE);
		
		this.p3 = new JButton("P3");
		this.p3.setBounds(5+bt1+bt2,5,bt3,20);
		this.p3.setBackground(Color.CYAN);
		
		this.p4 = new JButton("P4");
		this.p4.setBounds(5+bt1+bt2+bt3,5,bt4,20);
		this.p4.setBackground(Color.DARK_GRAY);
		
		frame.getContentPane().add(this.p1);
		frame.getContentPane().add(this.p2);
		frame.getContentPane().add(this.p3);
		frame.getContentPane().add(this.p4);
		frame.setSize(new Dimension(500,500));
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.pack();
    }
}
