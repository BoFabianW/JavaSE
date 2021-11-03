package Schleifen;

public class WhileSchleifeAlphabet {

    public static void AlphabetDurchlaufen() {

        System.out.println("Hier wird das Alphabet angezeigt.\n");
        //Hier werden 2 Variablen des Datentyps "Charakter" deklariert und mit dem Wert "a" und "z" initialisiert.
        //Eine Char-Variable kann in einer Schleife genau so durchlaufen werden wie z.B. eine Int-Variable.
        //Anstatt von 0 bis z.B. 10 wird beim Hochrechnen immer eine Buchstabe hoch- oder runtergezählt.
        char anfang = 'a';
        char ende = 'z';

        //Eine While-Schleife wurd NUR durchlaufen wenn die Bedingung zutriffft!
        while (anfang <= ende) {

            System.out.println(anfang++);
        }

        System.out.println("\n----------------------------------------\n");
    }

    public static void AlphabetDurchlaufen2() {
        char anfang = 'a';
        char ende = 'z';

        System.out.println("Es werden nur Vokale aufgelistet. Die Schleife durchlaeuft trotzdem das gesamte Alphabet\n");
        while (anfang <= ende) {

            //In der If-Anweisung wird mit dem Operator "|| Oder" der Inhalt der Variable bei jedem Durchlauf
            // auf den entsprechenden Vokal geprueft.
            if (anfang == 'a' || anfang == 'e' || anfang == 'i' || anfang == 'o' || anfang == 'u') {
                System.out.println(anfang);
            }
            anfang++;
        }

        System.out.println("\n----------------------------------------\n");
    }
}
