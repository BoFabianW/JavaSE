package Datenstroeme;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DatenSchreiben {

    /**
     * In dieser Methode wird eine txt.Datei erstellt und mit Text gefüllt.
     */
    public static void schreibenWriter() {

        // Pfadangabe zur zu schreibenden Datei
        Path pfad = Paths.get("C:\\temp\\writer.txt");

        // Neue Objektvariable von 'Writer' erstellen
        Writer schreiben;

        /*
         In einem 'try-catch-block' wird versucht einen bestimmten Code auszuführen.
         Kommt es bei der Ausführung zu einem Fehler (Exeption), wird dieser abgefangen und darauf reagiert.
         In diesem Fall findet eine Konsolenausgabe mit einer Fehlermeldeung statt.
         */
        try {
            // Variable 'schreiben' erhält einen neuen SchreibPuffer für die Datei aus der Variable 'pfad'.
            schreiben = Files.newBufferedWriter(pfad);

            // Zeile in die Datei schreiben
            schreiben.write("Ich bin Zeile 1");

            // Einen Zeilenumbruch in die Datei schreiben
            schreiben.write(System.lineSeparator());

            // Neue Zeile in die Datei schreiben
            schreiben.write("Ich bin Zeile 2");

            /*
             Writer schließen - beim Schließen wird die Funktion 'flush' automatisch ausgeführt.
             Wird der Writer nicht geschlossen, muss zum Schreiben in die Datei die Funktion 'flush' ausgeführt werden (schreiben.flush(); )
             */
            schreiben.close();

            // Konsolenausgabe bei Erfolg.
            System.out.println("Datei wurde erfolgreich geschrieben!");

        } catch (IOException e) {
            // Konolenausgabe bei Error.
            System.out.println("Datei konnte nicht geschrieben werden!");
        }
    }

    /**
     * Mit dieser Methode wird einer txt-Datei (writer.txt) ausgelsen und der Inhalt
     * in Großbuchstaben in einer neuen txt-Datei (outputstream.txt) geschrieben.
     */
    public static void schreibenOutputStream() {

        // Zum Schreiben einer Datei muss ein Path-Objekt mit Angabe des Pfades zur Datei erstellt werden!
        Path pfad = Paths.get("c:\\temp\\outputstream.txt");

        InputStream in;
        String s = null;

          /*
         In einem 'try-catch-block' wird versucht einen bestimmten Code auszuführen.
         Kommt es bei der Ausführung zu einem Fehler (Exeption), wird dieser abgefangen und darauf reagiert.
         In diesem Fall findet eine Konsolenausgabe mit einer Fehlermeldeung statt.
         */
        try {
            // Angabe des Pfades zum Einlesen der Datei.
            in = new FileInputStream("C:\\temp\\writer.txt");

            // Die Größe des Arrays sollte ein vielfaches von 2 sein - Noch besser: 2 hoch x
            final byte[] BUFFER = new byte[1024];

            // Blockweises Einlesen der Datei und Eintragen in das BUFFER-Array.
            in.read(BUFFER);

            // Umwandeln des Arrays in ein neues String-Objekt.
            s = new String(BUFFER);

            // Konsolenausgabe bei Erfolg.
            System.out.println("Datei konnte erfolgreich ausgelesen werden!");

        } catch (IOException e) {
            // Konsolenausgabe bei Error.
            System.out.println("Es ist ein Fehler beim Auslesen der Datei aufgetreten!");
        }

        OutputStream out;

        try {
            // Angabe des Pfades wo die neue Datei gespeichert werden soll.
            out = Files.newOutputStream(pfad);

            // Hinzufügen des Strings 's' mit Umwandlung duch 'toUpperCase' in Großbuchstaben in das Byte-Array.
            assert s != null;
            byte[] byteArr = s.toUpperCase().getBytes();

            // Inhalt des Byte-Array in den Writer übertragen.
            out.write(byteArr);

            // Inhalt in die Datei schreiben.
            out.flush();

            // Konsolenausgabe bei Erfolg.
            System.out.println("Datei wurde erfolgreich erstellt!");

        } catch (IOException e) {
            // Konsolenausgabe bei Error.
            System.out.println("Datei konnte nicht erstellt werden");
        }
    }
}
