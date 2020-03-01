
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SJF {
    JFrame frame;
    JLabel p1, p2, p3, p4, avg;
	JPanel pane;
	JButton back;
	double bt1, bt2, bt3, bt4, total;
	int x1, x2, x3, x4;
	SJFAttributes[] sjf;
	SJFAttributes sjfTemp;
    
    public SJF(String p1, String p2, String p3, String p4) {
		sjf = new SJFAttributes[4];
		
		for(int i = 0; i < sjf.length; i++) {
			sjf[i] = new SJFAttributes();
		}
		
		sjf[0].setProcess("P1");
		sjf[0].setBurstTime(Integer.parseInt(p1));
		sjf[1].setProcess("P2");
		sjf[1].setBurstTime(Integer.parseInt(p2));
		sjf[2].setProcess("P3");
		sjf[2].setBurstTime(Integer.parseInt(p3));
		sjf[3].setProcess("P4");
		sjf[3].setBurstTime(Integer.parseInt(p4));
		sjfTemp = new SJFAttributes();
		
		for(int i = 0; i < sjf.length; i++) {
			for(int j = 0; j < sjf.length-i-1; j++) {
				if(sjf[j].getBurstTime() > sjf[j+1].getBurstTime()) {
					 sjfTemp = sjf[j];
					 sjf[j] = sjf[j+1];
					 sjf[j+1] = sjfTemp;
				}
			}
		}
		
		bt1 = sjf[0].getBurstTime();
		bt2 = sjf[1].getBurstTime();
		bt3 = sjf[2].getBurstTime();
		bt4 = sjf[3].getBurstTime();
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
		
		back = new JButton("Back");
		back.setBounds(200, 350, 100, 50);
		pane.add(back);
		
		p1 = new JLabel(sjf[0].getProcess(), SwingConstants.CENTER);
		p1.setBounds(0, 200, (int)bt1, 100);
		p1.setBackground(Color.BLACK);
		p1.setOpaque(true);
		pane.add(p1);
		
		p2 = new JLabel(sjf[1].getProcess(), SwingConstants.CENTER);
		p2.setBounds(x1, 200, x2, 100);
		p2.setBackground(Color.BLUE);
		p2.setOpaque(true);
		pane.add(p2);
		
		p3 = new JLabel(sjf[2].getProcess(), SwingConstants.CENTER);
		p3.setBounds(x1+x2, 200, x3, 100);
		p3.setBackground(Color.CYAN);
		p3.setOpaque(true);
		pane.add(p3);
		
		p4 = new JLabel(sjf[3].getProcess(), SwingConstants.CENTER);
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
		avg.setBounds(100, 100, 300, 100);
		
		pane.add(avg);
		
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				new BurstTimeInputFrame();
				frame.dispose();
			}
		} );
	}
}
