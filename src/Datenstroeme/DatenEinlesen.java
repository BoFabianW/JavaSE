package Datenstroeme;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DatenEinlesen {

    /**
     * Diese Methode liest eine .txt-Datei aus.
     */
    public static void lesenReader() {

        // Pfadangabe zur auslesenden Datei.
        Path pfad = Paths.get("C:\\temp\\writer.txt");

        // Variabele für Lesepuffer erstellen.
        BufferedReader lesen;

        try {
            // Variable 'lesen' erhält einen neuen Lesepuffer für die Datei aus der Variable 'pfad'.
            lesen = Files.newBufferedReader(pfad);

            String zeile;

            /*
            Durch die Funktion 'ready' wird die Schleife so lange durchlaufen, wie es eine neue Zeile in der Datei gibt.
            Datei wird Zeile für Zeile durchlaufen.
             */
            while (lesen.ready()){

                // Speichern der aktuellen Zeile aus der Datei in der String-Variable 'zeile'.
                zeile = lesen.readLine();

                // Ausgabe der aktuelen Zeile auf der Konsole.
                System.out.println(zeile);
            }

            // Schließen des LesePuffers.
            lesen.close();

        } catch (Exception e) {
            // Konolenausgabe bei Error.
            System.out.println("Datei konnte nicht gelesen werden!");
        }
    }

    /**
     * Mit dieser Methode wird eine txt-Datei durch 'InputStream' ausgelesen
     * Es wird ein Byteorientierter Datenstrom ausgelsen
     * @throws IOException kann beim auslesen der Datei auftreten
     */
    public static void lesenInputStream() throws IOException {

        InputStream is;

        // Angabe des Pfades zu der Datei.
        is = new FileInputStream("C:\\temp\\writer.txt");

        // Die Größe des Arrays sollte ein vielfaches von 2 sein - Noch besser: 2 hoch x
        final byte[] BUFFER = new byte[1024];
        // Blockweises Einlesen der Datei und eintragen in das BUFFER-Array.
        if (is.read(BUFFER) != 0) {
            // Umwandeln des Arrays in ein neues String-Objekt und Ausgabe auf der Konsole.
            String s = new String(BUFFER);
            System.out.println(s);
        } else {
            System.out.println("Fehler beim Lesen der Datei.");
        }
    }
}
