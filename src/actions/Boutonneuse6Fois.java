package actions;

import java.awt.*;
import javax.swing.*;

public class Boutonneuse6Fois {
    private JButton b1, b2, b3, b4, b5, b6;
    private JFrame frame;
    
    public Boutonneuse6Fois() {
        frame = new JFrame("Ma frame a six boutons");
        frame.setVisible(true);
        b1 = new JButton("Un");
        b2 = new JButton("Deux");
        b3 = new JButton("Trois");
        b4 = new JButton("Quatre");
        b5 = new JButton("Cinq");
        b6 = new JButton("Six");
        frame.getContentPane().setLayout(new GridLayout(3,2));
        // frame.getContentPane().setLayout(new FlowLayout(FlowLayout.RIGHT));
        frame.getContentPane().add(b1);
        frame.getContentPane().add(b2);
        frame.getContentPane().add(b3);
        frame.getContentPane().add(b4);
        frame.getContentPane().add(b5);
        frame.getContentPane().add(b6);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

    public static void main(String[] args) {
        new Boutonneuse6Fois();
    }
}
