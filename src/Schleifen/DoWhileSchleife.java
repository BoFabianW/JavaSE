package Schleifen;

public class DoWhileSchleife {

    // In dieser Methode werden beide Schleifen nacheinander verwendet
    public static void doWhileSchleife() {


        // Hier wird eine Variable "zahl" deklariert und mit dem Wert "-50" initialisiert
        int zahl = -50;

        System.out.println("\nAufgabe mit Verwendung der While-Schleife\n");
        System.out.println(zahl);

        /*
         Als erstes wird eine While-Schleife verwendet.
         Es werden alle Zahlen von -50 bis -35 auf der Konsole ausgegeben.
         */
        while (zahl <= -35) {

            System.out.println(zahl);
            zahl++;

        }

        // Hier wird die Variable "zahl" wieder auf den Wert "-50" gesetzt
        zahl = -50;

        System.out.println("\n\n------------------------------------------\n");
        System.out.println("Aufgabe mit Verwendung der Do-While-Schleife\n");

        /*
         Als zweites wird eine Do-While-Schleife verwendet.
         Es werden alle Zahlen von -50 bis -35 auf der Konsole ausgegeben.
         */
        do {
            System.out.println(zahl);
            zahl = zahl + 1;
        } while (zahl < -34);
    }
}
