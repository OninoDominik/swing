package fenetre;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * @author Maillot
 */
public class F01Vide {

    public static void main(String[] args) {
        JFrame frameframeframe = new JFrame("Une simple fenêtre vide");
        frameframeframe.setVisible(true);
        frameframeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameframeframe.setPreferredSize(new Dimension(600, 200));
        frameframeframe.pack();
    }
}
