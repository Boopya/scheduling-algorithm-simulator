
import java.awt.Color;
import javax.swing.*;

public class FCFS {
	JFrame frame;
    JPanel pane;
	JLabel p1, p2, p3, p4, avg;
	double bt1, bt2, bt3, bt4, total;
	int x1, x2, x3, x4;
	
	public FCFS(String p1, String p2, String p3, String p4) {
		bt1 = Double.parseDouble(p1);
		bt2 = Double.parseDouble(p2);
		bt3 = Double.parseDouble(p3);
		bt4 = Double.parseDouble(p4);
		total = bt1 + bt2 + bt3 + bt4;
		bt1 = bt1 / total * 500;
		bt2 = bt2 / total * 500;
		bt3 = bt3 / total * 500;
		bt4 = bt4 / total * 500;
		x1 = (int) bt1;
		x2 = (int) bt2;
		x3 = (int) bt3;
		x4 = (int) bt4;
		initComponents();
	}
	
	public void initComponents() {
		frame = new JFrame("FCFS");
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pane = new JPanel();
		pane.setLayout(null);
		frame.add(pane);
		
		p1 = new JLabel("P1", SwingConstants.CENTER);
		p1.setBounds(0, 200, (int)bt1, 100);
		p1.setBackground(Color.BLACK);
		p1.setOpaque(true);
		pane.add(p1);
		
		p2 = new JLabel("P2", SwingConstants.CENTER);
		p2.setBounds(x1, 200, x2, 100);
		p2.setBackground(Color.BLUE);
		p2.setOpaque(true);
		pane.add(p2);
		
		p3 = new JLabel("P3", SwingConstants.CENTER);
		p3.setBounds(x1+x2, 200, x3, 100);
		p3.setBackground(Color.CYAN);
		p3.setOpaque(true);
		pane.add(p3);
		
		p4 = new JLabel("P4", SwingConstants.CENTER);
		p4.setBounds(x1+x2+x3, 200, x4, 100);
		p4.setBackground(Color.DARK_GRAY);
		p4.setOpaque(true);
		pane.add(p4);
		
		avg = new JLabel("Average Waiting Time: " +
				(4 * (bt1 * total / 500) + 
				 3 * (bt2 * total / 500) + 
				 2 * (bt3 * total / 500) + 
				 1 * (bt4 * total / 500)) / 4,
				SwingConstants.CENTER);
		avg.setBounds(100, 300, 300, 150);
		pane.add(avg);
	}
}
