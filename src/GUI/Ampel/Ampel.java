package GUI.Ampel;

import javax.swing.*;
import java.awt.*;

/**
 * Übung für eine Ampelschaltung mit Swing
 */

public class Ampel extends JFrame {

    private JPanel jpRot, jpGelb, jpGruen;
    private JButton buttonSchaltung;

    // Konstruktor zum aufrufen der Methoden zum initialisieren der Komponenten
    public Ampel(){

        initFrame();
        initButton();
        initPanels();
    }

    // Methode zum Initialisieren des Frames
    public void initFrame(){

        this.setTitle("Ampelschaltung");
        this.setResizable(false);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setBounds(700, 200, 250,600);
    }

    // Methode zum initialisieren des Button
    public void initButton(){

        buttonSchaltung = new JButton("Weiterschalten");

        buttonSchaltung.setBounds(15,500,200,35);
        buttonSchaltung.addActionListener(a -> schaltung());

        this.add(buttonSchaltung);
    }

    public void initPanels(){

        jpRot = new JPanel();
        jpGelb = new JPanel();
        jpGruen = new JPanel();

        jpRot.setBounds(15, 40, 200, 100);

        jpRot.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jpRot.setBackground(Color.RED);

        jpGelb.setBounds(15, 160, 200, 100);
        jpGelb.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jpGelb.setBackground(Color.WHITE);

        jpGruen.setBounds(15, 280, 200, 100);
        jpGruen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jpGruen.setBackground(Color.WHITE);

        this.add(jpRot);
        this.add(jpGelb);
        this.add(jpGruen);
    }

    // Mit dieser Methode wird die Hintergrundfarbe der Panels geprüft und gesetzt.
    public void schaltung(){

        if (jpRot.getBackground() == Color.RED && jpGelb.getBackground() == Color.WHITE) {

            jpGelb.setBackground(Color.YELLOW);
            jpGruen.setBackground(Color.WHITE);
        }
        else if (jpRot.getBackground() == Color.RED && jpGelb.getBackground() == Color.YELLOW){

            jpRot.setBackground(Color.WHITE);
            jpGelb.setBackground(Color.WHITE);
            jpGruen.setBackground(Color.GREEN);
        }

        else if (jpGruen.getBackground() == Color.GREEN){

            jpRot.setBackground(Color.RED);
            jpGelb.setBackground(Color.WHITE);
            jpGruen.setBackground(Color.WHITE);
        }
    }
}