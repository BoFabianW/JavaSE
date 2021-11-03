package Operatoren;

public class InkrementOperatoren {

    /*
     * Inkrement- und Dekrement-Operatoren (unäre Operatoren)
     * sowohl in Postfix- als auch in Präfix-Notation.
     *
     *		(a) Inkrement: ++ (erhöht den Wert einer Variablen um 1)  .
     *		(b) Dekrement: -- (verringert den Wert einer Variablen um 1).
     *
     * Wenn die Präfix-Notation gewählt wird, so erfolgt das Inkrementieren
     * bzw. Dekrementieren vor allen anderen Operationen innerhalb einer
     * geschachtelten Anweisung, ansonsten danach.
     *
     */

    public static void notation(){

        int i = 0;
        // Postfix-Notation
        System.out.println(i);      // Ausgabe: 0       i ist danach: 0
        System.out.println(i++);    // Ausgabe: 0       i ist danach: 1
        System.out.println(i);      // Ausgabe: 1       i ist danach: 1
        System.out.println(i--);    // Ausgabe: 1       i ist danach: 0
        System.out.println(i);      // Ausgabe: 0       i ist danach: 0

        System.out.println("--------------");

        i = 0;
        // Präfix-Notation
        System.out.println(i);      // Ausgabe: 0       i ist danach: 0
        System.out.println(++i);    // Ausgabe: 1       i ist danach: 1
        System.out.println(i);      // Ausgabe: 1       i ist danach: 1
        System.out.println(--i);    // Ausgabe: 0       i ist danach: 0
        System.out.println(i);      // Ausgabe: 0       i ist danach: 0

        System.out.println("--------------");
    }
}

