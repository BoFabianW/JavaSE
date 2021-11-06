package Schleifen;

public class DoWhileSchleife {

    // In dieser Methode werden beide Schleifen nacheinander verwendet
    public static void doWhileSchleife() {

        System.out.println("AUSGABE EINFACHE FOR-EACH-SCHLEIFE --- AUSGABE BIS -35");

        int zahl = -50;

        // While-Schleifen prüfen erst die Bedingung und werden danach gegebenenfalls ausgeführt.
        while (zahl <= -35) {

            System.out.print(zahl + ", ");
            zahl++;
        }

        // Hier wird die Variable "zahl" wieder auf den Wert "-50" gesetzt
        zahl = -50;

        System.out.println("\n-----------------------------------------------------------------------\n");
        System.out.println("AUSGABE EINFACHE FOR-EACH-SCHLEIFE --- AUSGABE BIS -35");

        // do-while-Schleifen werden erst einmal durchlaufen und dann wird für einen eventuellen weiteren Druchlauf die Bedingung geprüft.
        do {
            System.out.print(zahl + ", ");
            zahl = zahl + 1;
        } while (zahl < -34);

        System.out.println("\n-----------------------------------------------------------------------\n");
    }
}
