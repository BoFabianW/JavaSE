package GUI.BMIrechner;

import javax.swing.*;
import java.awt.*;

public class BmiRechner extends JFrame{

        private JLabel lbl1, lbl2, lbl3;
        private JTextField tf1, tf2, tf3;
        private JButton btnBmiBerechnen, btnBeenden;


    /*
     Hier wird der Konstruktor erstellt. Dieser ruft zum Initialisieren der Komponeten
     die Methode 'KomponenetenInitialisieren' auf.
     */
    public BmiRechner() {
            KomponenetenInitialisieren();
        }

        private void KomponenetenInitialisieren() {

            // Position des Frames
            this.setLocation(500, 100);

            // Größe des Frames
            this.setSize(350, 300);

            // Titel des Frames setzen
            this.setTitle("Erster BMI-Rechner in Swing");

            // Layoutmanager deaktivieren!
            this.setLayout(null);

            // Beschriftungen
            lbl1 = new JLabel("Größe");
            lbl2 = new JLabel("Gewicht");
            lbl3 = new JLabel("Ergebnis");

            // Größe und Position der Beschriftungen (Diese Angaben werden ignoriert, wenn ein LayoutManager aktiv ist)
            lbl1.setLocation(10, 30);
            lbl1.setSize(90, 20);
            lbl2.setBounds(10, 60, 90, 20); // setBounds ist eine Zusammenfassung aus setLocation und setSize
            lbl3.setBounds(10, 90, 90, 20); // setBounds ist eine Zusammenfassung aus setLocation und setSize

            // Beschriftungen dem Frame hinzufügen
            this.add(lbl1);
            this.add(lbl2);
            this.add(lbl3);

            // Textfeld 1
            tf1 = new JTextField();
            tf1.setBounds(100, 30, 200, 20);
            this.add(tf1);

            // Textfeld 2
            tf2 = new JTextField();
            tf2.setBounds(100, 60, 200, 20);
            this.add(tf2);

            // Textfeld 3
            tf3 = new JTextField();
            tf3.setBounds(100, 90, 200, 20);
            this.add(tf3);

            // Textfeld nicht editierbar machen
            tf3.setEditable(false);

            // Buttons zum Frame hinzufügen
            btnBmiBerechnen = new JButton("BMI berechnen");
            btnBmiBerechnen.setBounds(110, 160, 120, 25);
            this.add(btnBmiBerechnen);

            btnBeenden = new JButton();
            btnBeenden.setText("Beenden");
            btnBeenden.setBounds(110, 200, 120, 25);
            this.add(btnBeenden);

            // Listener für die Buttons hinzufügen
            btnBmiBerechnen.addActionListener(rechnen ->rechnen());
            btnBeenden.addActionListener(beenden -> System.exit(0));

            // Schließen des Programms beim Anklicken des X rechts oben
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Frame sichtbar machen.
            this.setVisible(true);
        }

        /*
         Hier wird aus der inneren Klasse 'BmiAuswerten' ein neues Objekt erstellt um auf die darinliegende Methode
         bmiBerechnen zugreifen zu können.
         */
        public void rechnen(){
            BmiAuswerten a = new BmiAuswerten();
            a.bmiBerechnen();
            }

        // In dieser inneren Klasse befindet sich die Methode 'bmiBerechnen' zum Auswerten des BMIs.
        public class BmiAuswerten {

            public void bmiBerechnen() {

                double bmiA = 0;
                double groesse;
                double gewicht;

                /*
                 Mit dieser 'Try - catch' Methode wird die Fehlermeldung 'NUmberFormatExeption' abgefangen.
                 Diese ensteht bei ungültigen Eingaben.
                 */
                try {
                    // Durch die Funktion 'replace' wird das Komma durch einen Punkt ersetzt, da ein Double keine Kommas kennt
                    groesse = Double.parseDouble(tf1.getText().replace(',', '.'));
                    gewicht = Double.parseDouble(tf2.getText().replace(',', '.'));

                    bmiA = groesse * groesse;
                    bmiA = gewicht / bmiA;
                }
                catch (NumberFormatException ignored) {}

                // Mit der Funktion 'setForeground' wird die Schriftfarbe geändert.
                if (bmiA <= 10 || bmiA >= 50) {
                    tf3.setText("Überprüfen Sie Ihre Eingabe ");
                    tf3.setForeground(Color.RED);
                } else if (bmiA <= 15) {
                    tf3.setText("Sie haben Magersucht");
                    tf3.setForeground(Color.BLACK);
                } else if (bmiA <= 20) {
                    tf3.setText("Sie haben Untergewicht");
                    tf3.setForeground(Color.BLACK);
                } else if (bmiA <= 25) {
                    tf3.setText("Sie haben Normalgewicht");
                    tf3.setForeground(Color.BLACK);
                } else if (bmiA <= 30) {
                    tf3.setText("Sie haben Übergewicht");
                    tf3.setForeground(Color.BLACK);
                } else if (bmiA <= 40) {
                    tf3.setText("Sie haben Fettsucht");
                    tf3.setForeground(Color.BLACK);
                } else if (bmiA <= 50) {
                    tf3.setText("Sie haben morbide Fettsucht");
                    tf3.setForeground(Color.BLACK);
                }
            }
        }
    }
