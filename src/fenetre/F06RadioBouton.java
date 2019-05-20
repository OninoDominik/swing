package fenetre;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * @author Maillot
 */
public class F06RadioBouton {

    public static void main(String[] args) {
        JFrame radiophonique = new JFrame("Une fenêtre avec des boutons dits \"radio\"");
        
        radiophonique.setVisible(true);
        radiophonique.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ButtonGroup group = new ButtonGroup();
        JRadioButton b1 = new JRadioButton("Pomme");
        JRadioButton b2 = new JRadioButton("Poire");
        JRadioButton b3 = new JRadioButton("Banane");
        group.add(b2);
        group.add(b1);
        group.add(b3);
        JPanel panneau = new JPanel();
        panneau.add(b1);
        panneau.add(b2);
        panneau.add(b3);
        radiophonique.getContentPane().add(panneau, "Center");

        radiophonique.pack();
    }
}
