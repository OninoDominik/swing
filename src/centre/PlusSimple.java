package centre;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Maillot
 */
public class PlusSimple {
    JButton nord = new JButton("Nord");
    JButton sud = new JButton("Sud");
    JButton est = new JButton("Est");
    JButton ouest = new JButton("Ouest");
    JLabel centre = new JLabel("Centre", JLabel.CENTER);

    public PlusSimple() {
        JFrame frame = new JFrame("Cliquez moi !");

        centre.setPreferredSize(new Dimension(200, 200));

        frame.getContentPane().add(nord, "North");
        frame.getContentPane().add(sud, "South");
        frame.getContentPane().add(est, "East");
        frame.getContentPane().add(ouest, "West");
        frame.getContentPane().add(centre, "Center");

        ActionListener action = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton bouton = (JButton) e.getSource();
                centre.setText(bouton.getText());
            }
        };

        nord.addActionListener(action);
        sud.addActionListener(action);
        est.addActionListener(action);
        ouest.addActionListener(action);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);        
    }
    
    public static void main(String[] args) {
        new PlusSimple();
    }
}
