package DatenbankSQL;

import java.sql.*;

public class DatenbankFunktion {

    // Erhält den SQL Code
    public static String createTable;
    // Enthält die Datenbankdatei inkl. Pfad
    public static String dateibankdatei = "c:\\temp\\tag26.sqlite";
    // Variable des Connection-Objekts
    public static Connection con;

    /*
     * Die Klasse DriverManager stellt die Verbindung zur Datenbank her und gibt
     * ein Objekt vom Typ Connection zurück, dass diese Verbindung darstellt.
     * Eine Try-Catch-Methode muss an dieser Stelle gesetzt werden, da es durch die Variable 'dateibankdatei'
     * eine Exception geworfen werden kann (Datei nicht gefunden usw.)
     */
    static {
        try {
            con = DriverManager.getConnection("jdbc:sqlite:" + dateibankdatei);
            System.out.println("Erfolgreich mit Datenbank verbunden ...\n");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void erstellenUndAbfrage() throws SQLException {

        // Erstellen eines Statements (Abfrage/Änderung)
        /*
         * Übersetzung: Erstelle eine Tabelle mit dem Namen "testtabelle", benenne die
         * erste Spalte "id", gib ihr den Datentyp Integer, mach sie zum primary key,
         * zähle automatisch hoch, verbiete ungültige (null) Werte und eine Spalte
         * "Vorname", "Nachname", "Telefon" mit einem Text mit maximaler Länger von 200, der ebenfalls nicht null
         * sein darf.
         */
        createTable = "CREATE TABLE IF NOT EXISTS \"Kontakte\" (id INTEGER PRIMARY KEY AUTOINCREMENT, Vorname VARCHAR(200) NOT NULL, Nachname VARCHAR(200) NOT NULL, Telefon VARCHAR(200) NOT NULL);";

        /*
         * Ein Statement muss erst mittels Connection-Objekt erstellt und dann
         * ausgeführt werden. Der SQL-Befehl wird beim execute als String übergeben. Das
         * Statement hat verschiedene Methoden zum Ausführen von SQL-Befehlen:
         *
         * execute gibt einen boolean zurück, (Für alle SQL-Befehle)
         *
         * executeUpdate gibt die Anzahl der manipulierten Zeilen zurück (für DML-Befehle: INSERT, UPDATE, DELETE)
         *
         * executeQuery gibt ein ResultSet zurück.  (für den DQL-Befehl SELECT)
         */
        Statement stmt = con.createStatement();

        // Erstellen der Tabelle
        // Sollte Tabelle schon existieren wird keine neue erstellt.
        stmt.execute(createTable);

        // Neuen Datensatz einfügen
        /* Der SQL-Befehl muss mit einem Semikolon abgeschlossen werden. */
        stmt.executeUpdate("INSERT INTO [Kontakte] (Vorname, Nachname, Telefon) VALUES (\"Fabian\", \"Werner\", \"012356478\");");
        stmt.executeUpdate("INSERT INTO [Kontakte] (Vorname, Nachname, Telefon) VALUES (\"Nicole\", \"Wilmes\", \"123456\");");
        stmt.executeUpdate("INSERT INTO [Kontakte] (Vorname, Nachname, Telefon) VALUES (\"Tyler\", \"Werner\", \"98523\");");
        stmt.executeUpdate("INSERT INTO [Kontakte] (Vorname, Nachname, Telefon) VALUES (\"Josephine\", \"Zeller\", \"0000000\");");

        /*
         * Abfrage erstellen und ausführen. Der Rückgabewert ist ein ResultSet,
         * also eine Art "Tabelle"
         */
        ResultSet rs = stmt.executeQuery("SELECT * FROM Kontakte;");

        // Tabelle wird Zeile für Zeile durchlaufen solange es eine neue Zeile gibt.
        while (rs.next()) {

            // Ausgeben der Spaltenwerte der aktuellen Zeile
            System.out.println("| " + rs.getInt(1) + " | " + rs.getString("Vorname") + " | " + rs.getString("Nachname") + " | " + rs.getString("Telefon") + " |");
        }

        // ResultSet schließen!
        rs.close();
    }
}

