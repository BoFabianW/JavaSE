package Schleifen;

public class WhileSchleifeAlphabet {

    private static char anfang = 'a';
    private static final char ende = 'z';

    public static void AlphabetDurchlaufen() {

        System.out.println("Hier wird das Alphabet angezeigt.\n");

        //Eine While-Schleife wurd NUR durchlaufen wenn die Bedingung zutriffft!
        while (anfang <= ende) {

            // Anstatt von 0 bis z.B. 10 wird beim Hochrechnen immer eine Buchstabe hoch- oder runtergezählt.
            System.out.print(anfang++ + ", ");
        }

        System.out.println("\n----------------------------------------\n");
    }

    public static void AlphabetDurchlaufen2() {

        System.out.println("Es werden nur Vokale aufgelistet. Die Schleife durchlaeuft trotzdem das gesamte Alphabet\n");
        while (anfang <= ende) {

            /*
             In der If-Anweisung wird mit dem Operator "|| Oder" der Inhalt der Variable bei jedem Durchlauf
             auf den entsprechenden Vokal geprueft.
             */
            if (anfang == 'a' || anfang == 'e' || anfang == 'i' || anfang == 'o' || anfang == 'u') {
                System.out.println(anfang);
            }
            anfang++;
        }

        System.out.println("\n----------------------------------------\n");
    }
}
