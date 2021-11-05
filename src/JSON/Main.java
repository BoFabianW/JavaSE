package JSON;

/*
 * Die JavaScript Object Notation (JSON) ist ein kompaktes Datenformat in einer einfach lesbaren Textform
 * und dient dem Zweck des Datenaustausches zwischen Anwendungen. JSON ist von der Programmiersprache unabhängig.
 * Parser und Generatoren existieren in allen verbreiteten Sprachen.
 * JSON muss über 'Global Labraries' der Projekteigenschaften importiert werden!
 */

public class Main {

    public static void main(String[] args) {

        JsonDatei.dateiSchreiben();
        JsonDatei.dateiLesen();
    }
}