package centre;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author yvan.maillot
 */
public class MaFrameADesBoutons {
    private JButton nord;
    private JButton sud;
    private JButton est;
    private JButton ouest;
    private JLabel centre;
    private JFrame frame;

    public MaFrameADesBoutons() {
        frame = new JFrame("Frame à boutons");

        centre = new JLabel("Centre", JLabel.CENTER);
        centre.setPreferredSize(new Dimension(200, 200));
        
        nord = new JButton("Nord");
        nord.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                centre.setText("Nord");
            }
        });

        sud = new JButton("Sud");
        sud.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                centre.setText("Sud");
            }
        });
        
        est = new JButton("Est");
        est.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                centre.setText("Est");
            }
        });
        
        ouest = new JButton("Ouest");
        ouest.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                centre.setText("Ouest");
            }
        });
        
        frame.getContentPane().add(nord, "North");
        frame.getContentPane().add(sud, "South");
        frame.getContentPane().add(est, "East");
        frame.getContentPane().add(ouest, "West");
        frame.getContentPane().add(centre, "Center");

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }
    
    public static void main(String[] args) {
        new MaFrameADesBoutons();
    }
}
