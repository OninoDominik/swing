package fenetre;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Maillot
 */
public class F04Bouton {

    public static void main(String[] args) {
        JFrame Boutonneuse = new JFrame("Une fenêtre avec un bouton qui ne fait rien pour l'instant");
        
        Boutonneuse.setVisible(true);
        Boutonneuse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panneau = new JPanel();
        panneau.add(new JButton("Cliquez moi !"));
        Boutonneuse.getContentPane().add(panneau);

        Boutonneuse.pack();
    }
}
