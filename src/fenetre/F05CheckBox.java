package fenetre;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 * @author Maillot
 */
public class F05CheckBox {

    public static void main(String[] args) {
        JFrame Checkable = new JFrame("Une fenêtre avec des cases à cocher");
        
        Checkable.setVisible(true);
        Checkable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Checkable.getContentPane().setLayout(new FlowLayout());

        Checkable.getContentPane().add(new JCheckBox("Pomme"), "South");
        Checkable.getContentPane().add(new JCheckBox("Poire"), "Center");
        Checkable.getContentPane().add(new JCheckBox("Banane"), "North");

        Checkable.pack();
    }
}
