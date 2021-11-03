package Serialisierung;

import java.io.*;

/**
 * Serialisierung dient z.B. dem Austausch von Daten aus Objekten über Netzwerk oder Email.
 */
public class Main {

    /**
     * In dieser Methode wird ein Objekt der Klasse 'Konto' erzeugt und als txt-Datei gespeichert und wieder ausgelesen
     * und auf der Konsole ausgegeben.
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Konto kto = new Konto("Fabian Werner", "25412365884");

        // Abspeichern des Konto-Objektes in einer Datei
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:\\temp\\konto.txt"));
        // Schreiben des Objekts in die Datei
        oos.writeObject(kto);
        oos.close(); // Die Funktion 'close' beinhaltet automatisch die Funktion 'flush' die, die Datei mit Inhalt füllt.

        System.out.println("Datei wurde erfolgreich angelegt!\n");

        // Einlesen der zuvor abgespeicherten Datei
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:\\temp\\konto.txt"));

        // Ausgelesens Objekt in ein Konto casten.
        Konto konto = (Konto) ois.readObject();

        // Informationen des ausgelesenen Objektes auf der Konsole ausgeben
        System.out.println(konto.getInhaber());

        // Schließen des Streams
        ois.close();
    }
}
