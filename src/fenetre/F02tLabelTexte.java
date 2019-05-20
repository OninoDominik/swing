package fenetre;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Maillot
 */
public class F02tLabelTexte {

    public static void main(String[] args) {
        JFrame frameEtLabel = new JFrame("Une fenêtre avec un JLabel");
        frameEtLabel.setVisible(true);
        frameEtLabel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        frameEtLabel.getContentPane().add(new JLabel("Pour écrire du texte", JLabel.CENTER), "West");
        frameEtLabel.setPreferredSize(new Dimension(400,400));
        frameEtLabel.pack();
    }
}
