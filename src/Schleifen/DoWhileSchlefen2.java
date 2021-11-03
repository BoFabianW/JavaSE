package Schleifen;

public class DoWhileSchlefen2 {

    // In dieser Methode werden beide Schleifen nacheinander verwendet
    public static void doWhileUndIfAnweisung() {


        // Hier wird eine Variable "zahl" deklariert und mit dem Wert "-50" initialisiert
        int zahl1 = -50;

        System.out.println("\nVerwendung der While-Schleife\n");
        System.out.println(zahl1);

        /*
         Als erstes wird eine While-Schleife verwendet.
         Es werden alle Zahlen von -50 bis -35 durchlaufen. Enthaelt die Variable "zahl1" den Wert "-40" wird die Schleife beendet.
         Auf der Konsole stoppt die Aufzaehlung bei 40
         Mit der Anweisung "break" wird das Durchlaufen der Schleife gestoppt
         */
        while (zahl1 < -35) {

            zahl1 = zahl1 + 1;
            System.out.println(zahl1);

            if (zahl1 >= -40) {
                System.out.println("Die Zahl -40 ist erreicht !!!");
                break;
            }
        }

        // Hier wird die Variable "zahl" wieder auf den Wert "-50" gesetzt
        zahl1 = -50;

        System.out.println("\n\n------------------------------------------\n");
        System.out.println("Verwendung der Do-While-Schleife\n");

        /*
         Als Zweites wird eine Do-While-Schleife verwendet.
         Es werden alle Zahlen von -50 bis -35 durchlaufen. Enthaelt die Variable "zahl1" den Wert "-39" wird die Schleife beendet.
         Auf der Konsole stoppt die Aufzaehlung bei 40.
         Mit der Anweisung "break" wird das Durchlaufen der Schleife gestoppt.
         */

        do {
            System.out.println(zahl1);
            zahl1 = zahl1 + 1;

            if (zahl1 == -39) {
                System.out.println("Die Zahl -40 ist erreicht !!!\n");
                System.out.println("----------------------------------------\n");
                break;
            }
        }
        while (zahl1 < -34) ;
    }
}
