package fenetre;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Maillot
 */
public class F09Absolue {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Placement absolu");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 200));

        frame.getContentPane().setLayout(null);
        JButton b1 = new JButton("B1");

        b1.setBounds(20, 20, (int)b1.getPreferredSize().getWidth(), (int)b1.getPreferredSize().getHeight());
        frame.getContentPane().add(b1); 
        frame.pack();       
    }
}
