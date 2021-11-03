package TreeMap;

/**
 *  In dieser Klasse wird die Funktionsweise der TreeMap demonstriert.
 *  Bei der Ausgabe einer TreeMap wird diese grundsätzlich sortiert ausgegeben.
 *  Eine TreeMap akzeptiert keine Duplikate! Ein vorhandener Key wird ersetzt.
 */

public class TreeMap {

    public static void treeMapDemo() {

        // Hier wird eine String-ArrayList erstellt.
        java.util.TreeMap<String, String> name = new java.util.TreeMap<>();

        name.put("Max", "Muster");
        name.put("Peter", "Parker");
        name.put("Donald", "Duck");
        name.put("Al", "Bundy");

        // Durch die Methode "get" und die Eingabe des Keys kann der Wert des Keys ausgegeben werden
        System.out.println(name.get("Donald")); // erwartete Ausgabe = Duck
        System.out.println("----------------------------------------------\n");

        /*
         Mit der Metzhode "containsKey" kann abgefragt werden, ob ein Key(Schlüssel) existiert.
         Die Ausgabe ist ein 'treu' oder 'false'
         */
        System.out.println(name.containsKey("Peter")); // erwartet = true
        System.out.println("----------------------------------------------\n");

        /*
         Mit der Methode "containsValue" kann abgefragt werden, ob ein Wert existiert.
         Die Ausgabe ist ein 'treu' oder 'false'
         */
        System.out.println(name.containsValue("Mustermann")); // erwartet = false
        System.out.println("----------------------------------------------\n");

        System.out.println("Ausgabe des gesamten Inhaltes der TreeMap:\n");
        // In einer erweiterten For-Schleife wird die TreeMap ausgelesen.
        for (String ergebnis : name.keySet()) {

            /*
             In jedem Durchlauf der Schleife wird der Variable 'ergebnis' der aktuelle 'Key' übergeben.
             Um den Wert eines Key zu ermitteln, muss der jeweilige Key der Funktion 'get' übergeben werden
             */
            System.out.println(ergebnis + " " + name.get(ergebnis));
        }

        System.out.println("\n----------------------------------------------------------");

        /*
         Löschen von Key-Value-Paaren.
         Hier wird der Key 'Max' und der dazugehörige Wert 'Muster' entfernt.
         */
        name.remove("Max");

        System.out.println("Ausgabe des gesamten Inhaltes der TreeMap nach dem Entfernen eines Eintrags:\n");
        // In einer erweiterten For-Schleife wird die TreeMap ausgelesen.
        for (String ergebnis : name.keySet()) {

            /*
             In jedem Durchlauf der Schleife wird der Variable 'ergebnis' der aktuelle 'Key' übergeben.
             Um den Wert eines Key zu ermitteln, muss der jeweilige Key der Funktion 'get' übergeben werden.
             */
            System.out.println(ergebnis + " " + name.get(ergebnis));
        }

        System.out.println("\n----------------------------------------------------------");

        // Eintrag der TreeMap hinzufügen
        name.put("Kelly", "Bundy");

        System.out.println("Ausgabe des gesamten Inhaltes der TreeMap nach dem Hinzufügen eines Eintrags:\n");

        // In einer erweiterten For-Schleife wird die TreeMap ausgelesen.
        for (String ergebnis : name.keySet()) {

            /*
             In jedem Durchlauf der Schleife wird der Variable 'ergebnis' der aktuelle 'Key' übergeben.
             Um den Wert eines Key zu ermitteln, muss der jeweilige Key der Funktion 'get' übergeben werden
             */
            System.out.println(ergebnis + " " + name.get(ergebnis));
        }

        System.out.println("\n----------------------------------------------------------");
    }

    /**
     * Diese Methode zaehlt die vorkommenden Woerter in einem String - mit Beruecksichtigung von Gross- und Kleinschreibung
     */
    public static void worteZaehlen () {

        String text = "Hallo Welt hallo welt ich bin wieder hier Welt Hallo";

        String[] anzahlWorte = text.split(" ");

        // Erstellen einer TreeMap mit einem String als Key und einem Integer als Value
        java.util.TreeMap<String, Integer> wortListe = new java.util.TreeMap<>();

        for (String wort : anzahlWorte) {

            /*
             Ueberpruefung mit 'containsKey' ob ein Wort(Key) in der Liste schon existiert.
             Die Funktion 'containsKey' gibt ein True oder False zurueck.
             */
            if (!wortListe.containsKey(wort)) {
                wortListe.put(wort, 1);
            } else {
                /*
                 Ist ein Key schon existent, wird der Value um 1 erhoeht.
                 Mit der Funktion 'get(Key)' wird der Value ermittelt.
                 */
                wortListe.put(wort, wortListe.get(wort) + 1);
            }
        }
            System.out.println(wortListe);
    }
}

