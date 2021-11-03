package JSON;

import javax.json.*;
import java.io.FileWriter;
import java.io.IOException;

public class JsonBuilder {

    public static void JsonSchreiben() {

        // Dateipfadangabe ohne Datei.
        String dirPath = "C:\\Users\\Fabian\\Documents\\Entwicklung\\Java Testdateien";

        JsonObjectBuilder job = Json.createObjectBuilder();

        job.add("Vorname", "Fabian");
        job.add("Nachname", "Werner");
        job.add("Alter", 39);

        JsonArrayBuilder jab = Json.createArrayBuilder();

        jab.add(job);

        JsonObject jo = job.build();

        // Neues FileWriter-Objekt mit der Pfadangabe aus der Variable 'dirPath' und Angabe des Dateinamens in die geschrieben werden soll.
        try {
            FileWriter neueDatei = new FileWriter(dirPath + "\\output_json_builder.json");

            JsonWriter jw = Json.createWriter(neueDatei);
            jw.writeObject(jo);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
