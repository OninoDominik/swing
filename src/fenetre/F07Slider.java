package fenetre;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 * @author Maillot
 */
public class F07Slider {

    public static void main(String[] args) {
        JFrame reineDeLaGlisse = new JFrame("Une fenêtre avec un glisseur");
        
        reineDeLaGlisse.setVisible(true);
        reineDeLaGlisse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panneau = new JPanel();
        panneau.add(new JSlider());
        reineDeLaGlisse.getContentPane().add(panneau);

        reineDeLaGlisse.pack();
    }
}
