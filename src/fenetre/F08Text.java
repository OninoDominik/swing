package fenetre;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Maillot
 */
public class F08Text {

    public static void main(String[] args) {
        JFrame textuelle = new JFrame("Une fenêtre avec du texte à saisir");
        
        textuelle.setVisible(true);
        textuelle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panneau = new JPanel();
        panneau.add(new JTextField(10));
        textuelle.getContentPane().add(panneau);

        textuelle.pack();
    }
}
