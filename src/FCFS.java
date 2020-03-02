
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FCFS {
	JFrame frame;
    JPanel pane;
	JLabel p1Label, p2Label, p3Label, p4Label, averageLabel;
	JButton backButton;
	double totalBurstTime, averageWaitingTime;
	int p1width, p2width, p3width, p4width;
	final int PROCESS_LABEL_Y_COORDINATE = 200;
	final int PROCESS_LABEL_HEIGHT = 100;
	
	public FCFS(double p1burstTime, double p2burstTime, double p3burstTime, double p4burstTime) {
		totalBurstTime = p1burstTime + p2burstTime + p3burstTime + p4burstTime;
		averageWaitingTime = ((4 * (p1burstTime) + 3 * (p2burstTime) + 2 * (p3burstTime) + 1 * (p4burstTime)) / 4);
		
		p1width = (int) (p1burstTime / totalBurstTime * 500);
		p2width = (int) (p2burstTime / totalBurstTime * 500);
		p3width = (int) (p3burstTime / totalBurstTime * 500);
		p4width = (int) (p4burstTime / totalBurstTime * 500);
		
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
		
		backButton = new JButton("Back");
		backButton.setBounds(200, 350, 100, 50);
		pane.add(backButton);
		
		p1Label = new JLabel("P1", SwingConstants.CENTER);
		p1Label.setBounds(0, PROCESS_LABEL_Y_COORDINATE, p1width, PROCESS_LABEL_HEIGHT);
		p1Label.setBackground(Color.BLACK);
		p1Label.setOpaque(true);
		pane.add(p1Label);
		
		p2Label = new JLabel("P2", SwingConstants.CENTER);
		p2Label.setBounds(p1width, PROCESS_LABEL_Y_COORDINATE, p2width, PROCESS_LABEL_HEIGHT);
		p2Label.setBackground(Color.BLUE);
		p2Label.setOpaque(true);
		pane.add(p2Label);
		
		p3Label = new JLabel("P3", SwingConstants.CENTER);
		p3Label.setBounds(p1width+p2width, PROCESS_LABEL_Y_COORDINATE, p3width, PROCESS_LABEL_HEIGHT);
		p3Label.setBackground(Color.CYAN);
		p3Label.setOpaque(true);
		pane.add(p3Label);
		
		p4Label = new JLabel("P4", SwingConstants.CENTER);
		p4Label.setBounds(p1width+p2width+p3width, PROCESS_LABEL_Y_COORDINATE, p4width, PROCESS_LABEL_HEIGHT);
		p4Label.setBackground(Color.DARK_GRAY);
		p4Label.setOpaque(true);
		pane.add(p4Label);
		
		averageLabel = new JLabel("Average Waiting Time: " + averageWaitingTime, SwingConstants.CENTER);
		averageLabel.setBounds(100, 100, 300, 100);
		
		pane.add(averageLabel);
		
		backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				new BurstTime();
				frame.dispose();
			}
		} );
	}
}
