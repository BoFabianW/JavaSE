package Arrays;
import java.util.Arrays;

/** Die Verwendung von Arrays bietet sich speziell dann an, wenn die
  * Reihenfolge der Daten eine wichtige Rolle spielt - wenn man über den
  * Index ein Element ansprechen können soll.
  *
  * Arrays sind Objekte und müssen instanziert werden. Die Arraygröße wird
  * in eckige Klammern [] geschrieben. Gültige Werte für die Größe eines
  * Arrays sind positive, Ganzzahlen. Der Arrayindex beginnt mit 0.
  * Ist die Größe eines Arrays einmal festgelegt, ist sie nicht mehr änderbar!
**/

public class EindimensionaleArrays {

    public static void eindimensionaleArrays() {

        /*
         Deklaration und Instanziierung (d.h. Einrichten eines leeren Arrays) der Grösse 6.
         int-Array 'lotto'. Standardwert vor der Initialisierung ist 0.
         */
        int[] lotto = new int[6];

        // Konsolenausgabe.
        System.out.println("Auslesen des gesamten Arrays 'lotto' vor der Initialisierung:");

        // Hier wird das Array in einer Schleife durchlaufen und die 6 Werte des Arrays auf der Konsole ausgegeben.
        for (int i : lotto) {
            System.out.print(i + " ");
        }

        // Zuweisung (expliziten Initialisierung)
        lotto[0] = 2;
        lotto[1] = 5;
        lotto[2] = 18;
        lotto[3] = 25;
        lotto[4] = 32;
        lotto[5] = 42;

        // Konsolenausgabe.
        System.out.println("\nAuslesen des gesamten Arrays 'lotto' nach der Initialisierung:");

        // Hier wird das Array in einer Schleife durchlaufen und die 6 Werte des Arrays auf der Konsole ausgegeben.
        for (int i : lotto) {
            System.out.print(i + " ");
        }

        // Konsolenausgabe.
        System.out.println("\nAlternative Ausgabe mit dem Object 'Arrays' und toString");

        /*
         Alernative zur Konsolenausgabe des gesamten Arrys.
         In diesem Fall wird der gesamte Array in [ eckigen Klammern ] ausgegeben.
         */
        System.out.println(Arrays.toString(lotto));

        // Konsolenausgabe.
        System.out.println("---------------------------------------------------------------");


//        Bei der Deklaration eines Arrays wird der eigentliche Container
//        erzeugt. Bei der Initialisierung wird die exakte Größe festgelegt.
//        Das bedeutet, dass das Array zunächst exakt in seiner Größe
//        und Typ bestimmt wird. Möglich ist die Verwendung aller elementaren und
//        benutzerdefinierten Datentypen. Die Deklaration wird mit dem Datentyp
//        eingeleitet, gefolgt vom Namen des Arrays. Wichtig ist die
//        Kennzeichnung des Arrays mit den eckigen Klammeroperatoren, welche eine
//        Array - Variable ausweisen. Dabei spielt es keine Rolle, ob diese nach
//        dem Typ oder dem Namen erscheinen. Zum Abschluss wird das Array noch mit
//        dem new - Operator auf dem Speicher instanziiert, da es sich um eine
//        Objektinstanz handelt.

        /*
         Hier wird ein Feld (Array - Eindimensional) 'lotto2' erstellt.
         In diesem Fall erhält der Array die Länge 6.
         */
        int[] lotto2 = {3, 9, 19, 31, 33, 45};

        // Konsolenausgabe.
        System.out.println("\nAuslesen des gesamten Arrays 'lotto2' nach der Initialisierung:");

        // Durchlaufen des Arrays mit einer 'forEach-Schleife'.
        for (int i : lotto2) {
            System.out.print(i + " ");
        }

        // Konsolenausgabe.
        System.out.println("\n---------------------------------------------------------------\n");

        /*
         oder in ausführlicher Schreibweise ohne Längenangabe.
         Die Länge kann hier beliebig erweitert werden.
         In diesem Fall erhält der Array die Länge 9.
         */
        int[] lotto3 = new int[]{7, 17, 27, 37, 47, 48, 50, 60, 70};

        // Konsolenausgabe.
        System.out.println("Größe des Arrays 'lotto3':");

        //Hier wird die Länge des Arrays 'lotto3' auf der Konsole ausgegeben.
        System.out.println(lotto3.length);

        // Konsolenausgabe.
        System.out.println("---------------------------------------------------------------\n");

        // Hier wird ein String-Array mit der Länge 3 erstellt.
        String[] StringText = new String[3];

        // Zuweisung (expliziten Initialisierung)
        StringText[0] = "Hallo";
        StringText[1] = "Max";
        StringText[2] = "Mustermann";

        // Oder diese Variante
        String[] StringText2 = new String[]{"Hallo", "Max", "Mustermann"};

        // Konsolenausgabe.
        System.out.println("Auslesen des gesamten Arrays 'StringText:");

        // Durchlaufen des Arrays mit einer 'forEach-Schleife' und Ausgabe auf der Konsole.
        for (String inhalt : StringText) {
            System.out.print(inhalt + " ");
        }

        // Konsolenausgabe.
        System.out.println("\n---------------------------------------------------------------\n");

        // Hier wird ein Array vom Typ 'short' mit der Länge 256 erstellt.
        short[] zahlen = new short[20];

        // Hier wird die gesamte Länge der Short-Variable mit der Ziffer 7 Initialisiert.
        Arrays.fill(zahlen, (short) 7);

        // Konsolenausgabe.
        System.out.println("Auslesen des gesamten Arrays 'zahlen':\n");

        // Durchlaufen des Arrays mit einer 'forEach-Schleife' und Ausgabe auf der Konsole.
        for (short zahl : zahlen) {
            System.out.print(zahl + ", ");
        }

        // Konsolenausgabe.
        System.out.println("\n---------------------------------------------------------------\n");

        // Konsolenausgabe.
        System.out.println("Ausgabe des Wertes auf Indexposition 5 im Array 'zahlen':");

        // Hier wird der Index 5 der Short-Variable auf der Konsole ausgegeben
        System.out.println(zahlen[5]);

        // Konsolenausgabe:
        System.out.println("\n---------------------------------------------------------------");
    }
}