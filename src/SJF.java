
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SJF {
    JFrame frame;
    JLabel p1, p2, p3, p4;
	int bt1, bt2, bt3, bt4;
    
    public SJF(String p1, String p2, String p3, String p4) {
		frame = new JFrame("SJF");
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		this.bt1 = Integer.parseInt(p1);
		this.bt2 = Integer.parseInt(p2);
		this.bt3 = Integer.parseInt(p3);
		this.bt4 = Integer.parseInt(p4);
		
		frame.getContentPane().add(this.p1);
		frame.getContentPane().add(this.p2);
		frame.getContentPane().add(this.p3);
		frame.getContentPane().add(this.p4);
		
		this.p1 = new JLabel("P1", SwingConstants.CENTER);
		this.p1.setBounds(5,5,bt1,20);
		this.p1.setBackground(Color.BLACK);
		
		this.p2 = new JLabel("P2", SwingConstants.CENTER);
		this.p2.setBounds(5+bt1,5,bt2,20);
		this.p2.setBackground(Color.BLUE);
		
		this.p3 = new JLabel("P3", SwingConstants.CENTER);
		this.p3.setBounds(5+bt1+bt2,5,bt3,20);
		this.p3.setBackground(Color.CYAN);
		
		this.p4 = new JLabel("P4", SwingConstants.CENTER);
		this.p4.setBounds(5+bt1+bt2+bt3,5,bt4,20);
		this.p4.setBackground(Color.DARK_GRAY);
		this.p1.repaint(); this.p1.revalidate();
		this.p2.repaint(); this.p2.revalidate();
		this.p3.repaint(); this.p3.revalidate();
		this.p4.repaint(); this.p4.revalidate();
		frame.pack();
    }
}
