package fenetre;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Maillot
 */
public class F03LabelImage {

    public static void main(String[] args) {
        JFrame frameEtLabel = new JFrame("Une fenêtre avec un JLabel contenant une image");
        frameEtLabel.setVisible(true);
        frameEtLabel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon asDePique = new ImageIcon(F03LabelImage.class.getResource("images-cartes/As.gif"));
        frameEtLabel.getContentPane().add(new JLabel(asDePique, JLabel.CENTER));

        frameEtLabel.pack();
    }
}
