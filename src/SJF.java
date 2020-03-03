
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SJF {
    JFrame frame;
    JLabel p1Label, p2Label, p3Label, p4Label, averageLabel;
    JPanel pane;
    JButton back;
    SJFAttributes[] sjfObjects, sortedSjfObjects;
    double firstProcessBurstTime, secondProcessBurstTime, thirdProcessBurstTime, fourthProcessBurstTime, totalBurstTime, averageWaitingTime;
    int firstProcessWidth, secondProcessWidth, thirdProcessWidth, fourthProcessWidth;
    final int SJF_ARRAY_LENGTH = 4;
    final int PROCESS_LABEL_Y_COORDINATE = 200;
    final int PROCESS_LABEL_HEIGHT = 100;
    
    public SJF(double firstProcessBurstTime, double secondProcessBurstTime, double thirdProcessBurstTime, double fourthProcessBurstTime) {
        sjfObjects = new SJFAttributes[SJF_ARRAY_LENGTH];
        sortedSjfObjects = new SJFAttributes[SJF_ARRAY_LENGTH];

        for(int i = 0; i < SJF_ARRAY_LENGTH; i++) {
            sjfObjects[i] = new SJFAttributes();
            sortedSjfObjects[i] = new SJFAttributes();
        }

        sjfObjects[0].setProcessLabel("P1");
        sjfObjects[0].setBurstTime(firstProcessBurstTime);
        sjfObjects[1].setProcessLabel("P2");
        sjfObjects[1].setBurstTime(secondProcessBurstTime);
        sjfObjects[2].setProcessLabel("P3");
        sjfObjects[2].setBurstTime(thirdProcessBurstTime);
        sjfObjects[3].setProcessLabel("P4");
        sjfObjects[3].setBurstTime(fourthProcessBurstTime);

        sortedSjfObjects = SJFAttributes.sortBurstTime(sjfObjects, SJF_ARRAY_LENGTH);

        firstProcessBurstTime = sortedSjfObjects[0].getBurstTime();
        secondProcessBurstTime = sortedSjfObjects[1].getBurstTime();
        thirdProcessBurstTime = sortedSjfObjects[2].getBurstTime();
        fourthProcessBurstTime = sortedSjfObjects[3].getBurstTime();
        totalBurstTime = firstProcessBurstTime + secondProcessBurstTime + thirdProcessBurstTime + fourthProcessBurstTime;
        averageWaitingTime = ((4 * (firstProcessBurstTime) + 3 * (secondProcessBurstTime) + 2 * (thirdProcessBurstTime) + 1 * (fourthProcessBurstTime)) / 4);

        firstProcessWidth = (int) (firstProcessBurstTime / totalBurstTime * 500);
        secondProcessWidth = (int) (secondProcessBurstTime / totalBurstTime * 500);
        thirdProcessWidth = (int) (thirdProcessBurstTime / totalBurstTime * 500);
        fourthProcessWidth = (int) (fourthProcessBurstTime / totalBurstTime * 500);

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

        p1Label = new JLabel(sortedSjfObjects[0].getProcessLabel(), SwingConstants.CENTER);
        p1Label.setBounds(0, PROCESS_LABEL_Y_COORDINATE, firstProcessWidth, PROCESS_LABEL_HEIGHT);
        p1Label.setBackground(Color.BLACK);
        p1Label.setOpaque(true);
        pane.add(p1Label);

        p2Label = new JLabel(sortedSjfObjects[1].getProcessLabel(), SwingConstants.CENTER);
        p2Label.setBounds(firstProcessWidth, PROCESS_LABEL_Y_COORDINATE, secondProcessWidth, PROCESS_LABEL_HEIGHT);
        p2Label.setBackground(Color.BLUE);
        p2Label.setOpaque(true);
        pane.add(p2Label);

        p3Label = new JLabel(sortedSjfObjects[2].getProcessLabel(), SwingConstants.CENTER);
        p3Label.setBounds(firstProcessWidth+secondProcessWidth, PROCESS_LABEL_Y_COORDINATE, thirdProcessWidth, PROCESS_LABEL_HEIGHT);
        p3Label.setBackground(Color.CYAN);
        p3Label.setOpaque(true);
        pane.add(p3Label);

        p4Label = new JLabel(sortedSjfObjects[3].getProcessLabel(), SwingConstants.CENTER);
        p4Label.setBounds(firstProcessWidth+secondProcessWidth+thirdProcessWidth, PROCESS_LABEL_Y_COORDINATE, fourthProcessWidth, PROCESS_LABEL_HEIGHT);
        p4Label.setBackground(Color.DARK_GRAY);
        p4Label.setOpaque(true);
        pane.add(p4Label);

        averageLabel = new JLabel("Average Waiting Time: " + averageWaitingTime, SwingConstants.CENTER);
        averageLabel.setBounds(100, 100, 300, 100);

        pane.add(averageLabel);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new BurstTime();
                frame.dispose();
            }
        });
    }
}
