package Strings;

public class StringsErzeugen {

    // Hier wird eine String-Variable namens "text1" und "text2" deklariert und initialisiert.
    public static String text1 = "Java ist toll";
    public static String text2 = "Java ist toll";

    public static String text3 = "Java ist nicht toll";
    public static String text4 = "Java ist toll";

    /** Mit dieser Methode wird festgestellt, ob die Variablen "text1" und "text2" dasselbe Objekt ist.
     *  Da der Wert der Variablen indentisch sind, wird - ohne new - kein neues Objekt erstellt, sondern nur auf
     *  ein bestehendes Objekt mit demselben Wert verwiesen.
     */
    public static void StringsVergleichen() {

        // Vergleich von 2 Strings mit '=='.
        if (text1 == text2) {
            System.out.println("Die Variablen 'text1' und 'text2' sind dasselbe Objekt.\n");
        } else {
            System.out.println("Die Variablen 'text1' und 'text2' sind nicht dasselbe Objekt, aber eventuell mit gleichem Inhalt.\n");
        }
        System.out.println("------------------------------------------------------------\n");

        // Vergleich von 2 Strings mit 'equals'.
        if (text1.equals(text2)) {
            System.out.println("Die Variablen 'text1' und 'text2' haben den gleichen Inhalt.\n");
        } else {
            System.out.println("Die Variablen 'text1' und 'text2' haben nicht den gleichen Inhalt.\n");
        }
        System.out.println("------------------------------------------------------------\n");

        // Vergleich von 2 Strings mit '=='.
        if (text3 == text4) {
            System.out.println("Die Variablen 'text3' und 'text4' sind dasselbe Objekt.\n");
        } else {
            System.out.println("Die Variablen 'text3' und 'text4' sind nicht dasselbe Objekt, aber eventuell mit gleichem Inhalt.\n");
        }
        System.out.println("------------------------------------------------------------\n");

        // Vergleich von 2 Strings mit 'equals'.
        if (text3.equals(text4)) {
            System.out.println("Die Variablen 'text3' und 'text4' haben den gleichen Inhalt.\n");
        } else {
            System.out.println("Die Variablen 'text3' und 'text4' haben nicht den gleichen Inhalt.\n");
        }
        System.out.println("------------------------------------------------------------\n");
    }
    /**
     * Die Zeichenkette "Java ist toll" wird nur ein einziges Mal angelegt und
     * verweist deshalb auf das gleiche Objekt (Speicheradresse).
     *
     * Der Vergleichsoperator (==) vergleicht lediglich Speicheradressen: bei
     * Objekten unbrauchbar! Hier werden die beiden Objekte s1 und s2 verglichen
     * und nicht die Zeichenkette selbst
     */
    public static void StringErzeugenErzwingen() {

        // Erzwingen, dass 2 String-Objekte erstellt werden (Erzwungen wird durch "new"):
        text1 = new String("Java ist toll");
        text2 = new String("Java ist toll");

        if (text1 == text2) {
            System.out.println("Bei 'text1' und 'text2' handelt es sich um DASSELBE Objekt");
        } else {
            System.out.println("Bei 'text1' und 'text2' handelt es sich um unterschiedliche Objekte, aber eventuell mit gleichem Inhalt.");
        }

        System.out.println("------------------------------------------------------------\n");
    }

    /** Mit dieser Methode wird überprüft, ob der Inhalt der Variablen "text1" und "text2" identisch sind
     *  Zu diesem Zweck wird die Funktion "equals" verwendet.
     */
    public static void StringInhaltVergleichen() {

        text1 = "Java ist toll";
        text2 = "Java ist toll";
        if (text1.equals(text2)) {

            System.out.println("Variable text1: " + text1);
            System.out.println("Variable text2: " + text2);
            System.out.println("Der Inhalt der Variablen 'text1' und 'text2' sind identisch ");
            System.out.println("------------------------------------------------------------");

            text1 = "Java ist toll";
            text2 = "Hurra - ich lerne Java";

            if (text1.equals(text2)) {

                System.out.println("Variable text1: " + text1);
                System.out.println("Variable text2: " + text2);
                System.out.println("Der Inhalt der Variablen 'text1' und 'text2' sind identisch ");
                System.out.println("------------------------------------------------------------");
            } else {
                System.out.println("Variable text1: " + text1);
                System.out.println("Variable text2: " + text2);
                System.out.println("Der Inhalt der Variablen 'text1' und 'text2' sind NICHT identisch ");
                System.out.println("------------------------------------------------------------");
            }
        }
    }

    /**
     *  Mit dieser Methode wird eine Zeichenkette an einer bestimmten Position getrennt (in diesm Fall beim ',').
     *  Durch die Funktion "substring" ist es möglich, bestimmte Teile aus einer Zeichenkette zu lesen.
     */
    public static void StringTrennen() {

        String textDurchsuchen = "Wenn Fliegen hinter Fliegen fliegen, fliegen Fliegen hinter Fliegen her.";
        String textTrennen;

        // Hier wird die Indexposition des Zeichens ermittelt.
        int i = textDurchsuchen.indexOf(",");

        // Konsolenausgabe.
        System.out.println("Getrennter String:\n");

        /*
         In diesem Fall fangen wir mit dem Indexwert '0' an und gehen bis zum Indexwert 'i' welcher die Position
         des ',' darstellt. Da wir das ',' in die ermittelte Zeichenkett hinzufügen möchten, erhöhen wir den Indexwert 'i' nochmal um +1.
         */
        textTrennen = textDurchsuchen.substring(0, i + 1);
        System.out.println(textTrennen);

        /*
         In diesem Fall fangen wir an der Indexposition 'i' +2 an und gehen bis zum Ende der gesamten Zeichenkette.
         +2 wird verwendet um die Leerzeichen und das Komma zu überspringen
         */
        textTrennen = textDurchsuchen.substring(i + 2);
        System.out.println(textTrennen);

        System.out.println("------------------------------------------------------------\n");
    }

    //Dieser Methode wird beim Aufrufen einen String namens "str" übergeben.
    public static String StringUmdrehen(String str) {

        // Erstellen eines neuen StringBuilder-Objektes.
        StringBuilder umdrehen = new StringBuilder();

        for (int j = str.length() - 1; j >= 0; j--)

            /*
             Die Methode charAt () gibt das Zeichen am angegebenen Index zurück.
             Der Indexwert muss zwischen 0 und String.length () - 1 liegen.
             */
            umdrehen.append(str.charAt(j));

        //Durch return und die Variable "umdrehen" wird der Wert der Variable "umdrehen" gespeichert.
        return "String umdrehen:\n" + umdrehen;
    }

    /**
     * Mit dieser Methode ermitteln wir die enthaltenen Ziffern einer Zeichenkette.
     * @param str wird der Methode eine Zeichenkette übergeben.
     * @return gibt Variable "gefundeneZahl" aus.
     */
    public static String StringAufZiffernPruefen(String str) {

        // Erstellen eines neues 'StringBuilder-Objektes'
        StringBuilder gefundeneZahl = new StringBuilder();

        for (int j = 0 ; j <= str.length() -1 ; j++)

            /*
             Diese If-Anweisung verwendet den "oder" Operator um zu prüfen,
             ob der String an dem angegebenen Index eine Zahl ist.
             */
            if (str.charAt(j) == '1'
                    || str.charAt(j) == '2'
                    || str.charAt(j) == '3'
                    || str.charAt(j) == '4'
                    || str.charAt(j) == '5'
                    || str.charAt(j) == '6'
                    || str.charAt(j) == '7'
                    || str.charAt(j) == '8'
                    || str.charAt(j) == '9'
                    || str.charAt(j) == '0') {

                /*
                 Die Methode charAt() gibt das Zeichen am angegebenen Index zurück.
                 mit 'append' wird dem StringBuilder etwas hinzugefügt.
                 */
                gefundeneZahl.append(str.charAt(j)).append(", ");
            }

        /*
         Bei der Ausgabe des Strings werden die letzen 2 Zeichen des Strings durch 'substring' entfernt.
         In diesem Fall wird das letzte ',' und das letzte Leerzeichen entfernt.
         */
        return "In der Zeichenkette '" + str + "' sind folgende Ziffern entahlten: " + gefundeneZahl.substring(0, gefundeneZahl.length() -2);
    }

    /**
     * Mit dieser Methode zählen wir das Vorkommen eines bestimmten Wortes.
     * @param gesuchtesWort übergibt das gesuchte Wort.
     * @param duchsuchterText übergibt den zu durchsuchenden Text.
     * @return gibt die Variable "result" zurück
     */
    public static int StringZaehlen(String gesuchtesWort, String duchsuchterText) {

        int result = 0;

        // 'lastIndex' erhälz den Wert des Index, indem das gesuchte Wort vorkommt.
        int lastIndex = duchsuchterText.indexOf(gesuchtesWort);

        /*
         Wird durch 'indexOf' kein Suchwort mehr gefunden, wird der Wert -1 ausgegeben.
         Die Schleife wird nur durchlaufen, wenn die Variable einen anderen Wert als -1 besitzt.
         */
        while (lastIndex != -1) {

            // 'result' wird bei jedem Durchlauf um 1 erhöht.
            result++;

            /*
             Erläuterung:
             indexOf (gesuchtesWort, lastIndex + gesuchtesWort.length())

             gesuchtesWort = Gesuchter String
             lastIndex = von welcher Indexposition in dem String 'durchsuchterText' gesucht werden soll +
             die Länge des Strings 'gesuchtesWort'
             */
            lastIndex = duchsuchterText.indexOf(gesuchtesWort, lastIndex + gesuchtesWort.length());
        }

        // Rückgabe.
        return result;
    }
}
