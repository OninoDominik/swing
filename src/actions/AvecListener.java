package actions;

import java.awt.event.*;
import javax.swing.*;

public class AvecListener {
    private JButton Bouton;
    private JFrame frame;
    
    public AvecListener() {
        frame = new JFrame("Ma frame a des boutons");
        frame.setVisible(true);
        Bouton = new JButton("Cliquez moi !");
        frame.getContentPane().add(Bouton);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Bouton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Bouton.setText(Bouton.getText()+" Encore !");
                frame.pack();
            }
        });
    }

    public static void main(String[] args) {
        new AvecListener();
    }
}
