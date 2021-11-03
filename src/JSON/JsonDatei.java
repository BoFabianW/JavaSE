package JSON;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonDatei {

    public static void dateiLesen() {

        // Dateipfadangabe ohne Datei.
        String dirPath = "C:\\Users\\Fabian\\Documents\\Entwicklung\\Java Testdateien";

        // Neues Fileobjekt durch Angabe des Pfades aus der Variable 'dirPath' und der zu lesenden Datei.
        File file = new File(dirPath + "\\output_json.json");

        // Try-Catch-Block ist ein MUSS - Da Fehler beim Auslesen der Datei auftreten können.
        try {

            // Neue String-Variable
            // Auszulesende Datei wird Byte für Byte ausgelesen und in der Variable 'dateiInhalt' als String unter Berücksichtigung von UTF-8 gespeichert.
            String dateiInhalt = new String(Files.readAllBytes(Paths.get(file.toURI())), "UTF-8");

            // Neues JSONObject erhält den Inhalt aus der String-Variable 'dateiInhalt'
            JSONObject jo = new JSONObject(dateiInhalt);

            // String-Variable wird der Wert vom Key 'name' aus der Json-Datei übergeben.
            String name = jo.getString("name");
            // Int-Variable wird der Wert vom Key 'age' aus der Json-Datei übergeben.
            int alter = jo.getInt("age");

            // Ausgabe der Variablen auf der Konsole
            System.out.println(name + " " + alter);

            // Neues JSONObject aus dem JSONObject 'jo'. JSON-Datein beinhalten oft verschachtelte JSONObjects.
            JSONObject jo2 = jo.getJSONObject("movie");

            // Neue String-Variable wird der Wert von 'action' aus dem JSSONObject 'jo2' übergeben.
            String movie = jo2.getString("action");

            // Ausgabe der Variable auf der Konsole.
            System.out.println(movie);

            // Erstellen eines neuen JSONArrays.
            // Arrays mit dem Array 'cars' aus der JSON-Datei füllen.
            JSONArray ja = jo.getJSONArray("cars");

            // Neues JSONObject erstellen und das JSONObject an index '0' aus dem JSONArray übergeben.
            JSONObject temp = ja.getJSONObject(0);

            // Übergabe des Wertes aus dem Key 'name' aus JSONObject 'temp' an die Variable 'carName'.
            String carName = temp.getString("name");

            // Ausgabe des Strings über die Konsole.
            System.out.println(carName);

            // Neues JSONArray erstellen und die Werte aus dem JSONArray aus dem JSONObject 'temp' übergeben.
            JSONArray models = temp.getJSONArray("models");

            // Ausgabe des Arrays über die Konsole.
            System.out.println(models);

        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }

    public static void dateiSchreiben() {

        // Dateipfadangabe ohne Datei.
        String dirPath = "C:\\Users\\Fabian\\Documents\\Entwicklung\\Java Testdateien";

        // Neues Fileobjekt durch Angabe des Pfades aus der Variable 'dirPath' und der zu lesenden Datei.
        File file = new File(dirPath + "\\json_test_komplex.json");

        // Try-Catch-Block ist ein MUSS - Da Fehler beim Schreiben der Datei auftreten können.
        try {

            // Neue String-Variable
            // Auszulesende Datei wird Byte für Byte ausgelesen und in der Variable 'dateiInhalt' als String unter Berücksichtigung von UTF-8 gespeichert.
            String dateiInhalt = new String(Files.readAllBytes(Paths.get(file.toURI())), "UTF-8");

            // Neues JSONObject erhält den Inhalt aus der String-Variable 'dateiInhalt'
            JSONObject jo = new JSONObject(dateiInhalt);

            // Neuen Eintrag hinzufügen.
            jo.put("NeuerSchlüssel", 40);

            // Neues FileWriter-Objekt mit der Pfadangabe aus der Variable 'dirPath' und Angabe des Dateinamens in die geschrieben werden soll.
            FileWriter neuerEintrag = new FileWriter(dirPath + "\\output_json.json");

            // Das JSONObject wird als String mit der Funktion 'write' des FileWriter-Objects in den Speicher geschrieben.
            neuerEintrag.write(jo.toString());

            // Die Funktion 'flush' schreibt den Inhalt aus dem Speicher in die Datei.
            neuerEintrag.flush();

            // Schließt den FileWriter
            neuerEintrag.close();

            // Info über erfolgreiche Speicherung der Datei über die Konsole.
            System.out.println("Datei erfolgreich geschrieben.");

        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }
}
