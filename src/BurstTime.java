
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public final class BurstTime implements ActionListener {
    JFrame frame;
    JPanel pane;
    JLabel processLabel, burstTimeLabel;
    JLabel p1, p2, p3, p4;	// processes labels
    JTextField bt1TextField, bt2TextField, bt3TextField, bt4TextField;	// burst times text fields
    JButton sjfButton, fcfsButton;
    
    public static void main(String[] args)  {
        new BurstTime();
    }
    
    public BurstTime() {
        initComponents();
    }
    
    public void initComponents() {
		frame = new JFrame("Scheduling Algorithm Simulator");
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        pane = new JPanel(new GridBagLayout());
		frame.add(pane);
		
        GridBagConstraints c = new GridBagConstraints();
		
        c.insets = new Insets(5,5,5,5);
		c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx = 100;
        c.ipady = 20;
        c.weightx = 0.5;
        c.weighty = 0.5;
        
        processLabel = new JLabel("Process", SwingConstants.CENTER);
        c.gridx = 0;
        c.gridy = 0;
        pane.add(processLabel, c);
        
        burstTimeLabel = new JLabel("Burst Time", SwingConstants.CENTER);
        c.gridx = 1;
        c.gridy = 0;
        pane.add(burstTimeLabel, c);
        
        p1 = new JLabel("P1", SwingConstants.CENTER);
        c.gridx = 0;
        c.gridy = 1;
        pane.add(p1, c);
        
        p2 = new JLabel("P2", SwingConstants.CENTER);
        c.gridx = 0;
        c.gridy = 2;
        pane.add(p2, c);
        
        p3 = new JLabel("P3", SwingConstants.CENTER);
        c.gridx = 0;
        c.gridy = 3;
        pane.add(p3, c);
        
        p4 = new JLabel("P4", SwingConstants.CENTER);
        c.gridx = 0;
        c.gridy = 4;
        pane.add(p4, c);
       
		c.fill = GridBagConstraints.NONE;
	
        bt1TextField = new JTextField();
        c.gridx = 1;
        c.gridy = 1;
        pane.add(bt1TextField, c);
        
        bt2TextField = new JTextField();
        c.gridx = 1;
        c.gridy = 2;
        pane.add(bt2TextField, c);
        
        bt3TextField = new JTextField();
        c.gridx = 1;
        c.gridy = 3;
        pane.add(bt3TextField, c);
        
        bt4TextField = new JTextField();
        c.gridx = 1;
        c.gridy = 4;
        pane.add(bt4TextField, c);
        
        sjfButton = new JButton("SJF");
        c.gridx = 0;
        c.gridy = 5;
        pane.add(sjfButton, c);
        
        fcfsButton = new JButton("FCFS");
        c.gridx = 1;
        c.gridy = 5;
        pane.add(fcfsButton, c);
        
        sjfButton.addActionListener(this);
        fcfsButton.addActionListener(this);
		
		frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        double bt1, bt2, bt3, bt4;	// burst times variables
		bt1 = bt2 = bt3 = bt4 = 0;
        
		try {
			bt1 = Double.parseDouble(bt1TextField.getText());
			bt2 = Double.parseDouble(bt2TextField.getText());
			bt3 = Double.parseDouble(bt3TextField.getText());
			bt4 = Double.parseDouble(bt4TextField.getText());
		} catch (NullPointerException e) { 
			System.out.println(e.getMessage());
		}
		
        switch(ae.getActionCommand()) {
            case "SJF":
                SJF sjf = new SJF(bt1, bt2, bt3, bt4);
				frame.dispose();
                break;
            case "FCFS":
                frame.dispose();
                FCFS fcfs = new FCFS(bt1, bt2, bt3, bt4);
                break;
        }
    }
}
