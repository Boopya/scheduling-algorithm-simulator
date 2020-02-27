
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class BurstTimeInputFrame extends JFrame {
    JLabel processLabel, btLabel;
    JLabel p1, p2, p3, p4, p5;
    JTextField bt1, bt2, bt3, bt4;
    JButton sjfButton, fcfsButton;
    
    public BurstTimeInputFrame() {
        super("Scheduling Algorithm Simulator");
        
        JPanel pane = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5,5,5,5);
        
        processLabel = new JLabel("Process", SwingConstants.CENTER);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx = 100;
        c.ipady = 20;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(processLabel, c);
        
        btLabel = new JLabel("Burst Time", SwingConstants.CENTER);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx = 100;
        c.ipady = 20;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(btLabel, c);
        
        p1 = new JLabel("P1", SwingConstants.CENTER);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx = 100;
        c.ipady = 20;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(p1, c);
        
        p2 = new JLabel("P2", SwingConstants.CENTER);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx = 100;
        c.ipady = 20;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 2;
        pane.add(p2, c);
        
        p3 = new JLabel("P3", SwingConstants.CENTER);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx = 100;
        c.ipady = 20;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 3;
        pane.add(p3, c);
        
        p4 = new JLabel("P4", SwingConstants.CENTER);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx = 100;
        c.ipady = 20;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 4;
        pane.add(p4, c);
       
        bt1 = new JTextField();
        c.fill = GridBagConstraints.NONE;
        c.ipadx = 100;
        c.ipady = 20;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 1;
        c.gridy = 1;
        pane.add(bt1, c);
        
        bt2 = new JTextField();
        c.fill = GridBagConstraints.NONE;
        c.ipadx = 100;
        c.ipady = 20;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 1;
        c.gridy = 2;
        pane.add(bt2, c);
        
        bt3 = new JTextField();
        c.fill = GridBagConstraints.NONE;
        c.ipadx = 100;
        c.ipady = 20;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 1;
        c.gridy = 3;
        pane.add(bt3, c);
        
        bt4 = new JTextField();
        c.fill = GridBagConstraints.NONE;
        c.ipadx = 100;
        c.ipady = 20;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 1;
        c.gridy = 4;
        pane.add(bt4, c);
        
        
        sjfButton = new JButton("SJF");
        c.fill = GridBagConstraints.NONE;
        c.ipadx = 100;
        c.ipady = 20;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 5;
        pane.add(sjfButton, c);
        
        fcfsButton = new JButton("FCFS");
        c.fill = GridBagConstraints.NONE;
        c.ipadx = 100;
        c.ipady = 20;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 1;
        c.gridy = 5;
        pane.add(fcfsButton, c);
        
        add(pane);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args)  {
        new BurstTimeInputFrame();
    }
}
