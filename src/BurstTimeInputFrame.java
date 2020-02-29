
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public final class BurstTimeInputFrame implements ActionListener {
    JFrame frame;
    JPanel pane;
    JLabel processLabel, btLabel;
    JLabel p1, p2, p3, p4;
    JTextField bt1, bt2, bt3, bt4;
    JButton sjfButton, fcfsButton;
    
    public static void main(String[] args)  {
        BurstTimeInputFrame burstTimeInputFrame = new BurstTimeInputFrame();
        burstTimeInputFrame.frame.setVisible(true);
    }
    
    public BurstTimeInputFrame() {
        initComponents();
    }
    
    public void initComponents() {
		frame = new JFrame();
        pane = new JPanel(new GridBagLayout());
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
        
        btLabel = new JLabel("Burst Time", SwingConstants.CENTER);
        c.gridx = 1;
        c.gridy = 0;
        pane.add(btLabel, c);
        
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
	
        bt1 = new JTextField();
        c.gridx = 1;
        c.gridy = 1;
        pane.add(bt1, c);
        
        bt2 = new JTextField();
        c.gridx = 1;
        c.gridy = 2;
        pane.add(bt2, c);
        
        bt3 = new JTextField();
        c.gridx = 1;
        c.gridy = 3;
        pane.add(bt3, c);
        
        bt4 = new JTextField();
        c.gridx = 1;
        c.gridy = 4;
        pane.add(bt4, c);
        
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
        
        frame.getContentPane().add(pane);
        frame.setTitle("Scheduling Algorithm Simulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String bt1, bt2, bt3, bt4;
        bt1 = bt2 = bt3 = bt4 = "";
        
        switch(ae.getActionCommand()) {
            case "SJF":
                try {
                    bt1 = this.bt1.getText();
                    bt2 = this.bt2.getText();
                    bt3 = this.bt3.getText();
                    bt4 = this.bt4.getText();
                } catch (NullPointerException e) { 
                    System.out.println(e.getMessage());
                }
                frame.setVisible(false);
                SJF sjf = new SJF(bt1, bt2, bt3, bt4);
                break;
                
            case "FCFS":
                try {
                    bt1 = this.bt1.getText();
                    bt2 = this.bt2.getText();
                    bt3 = this.bt3.getText();
                    bt4 = this.bt4.getText();
                } catch (NullPointerException e) { 
                    System.out.println(e.getMessage());
                }
                frame.setVisible(false);
                //FCFS fcfs = new FCFS(bt1, bt2, bt3, bt4);
                break;
        }
    }
}
