package Operatoren;

public class ArithmetischeOperatoren {

    public static void arithmetischeOperatoren1() {

        int ganzZahl1 = 26;
        int ganzZahl2 = 47;
        double gleitkommaZahl1 = 1.50;
        double gleitkommaZahl2 = 36.4;
        //Bei einer Konsolenausgabe muss eine mathematische Operation in Klammern stehen!
        System.out.println("Addition: " + (ganzZahl1 + ganzZahl2));
        System.out.println("Subtraktion: " + (ganzZahl1 - ganzZahl2));
        System.out.println("Multiplikation: " + (ganzZahl1 * ganzZahl2));
        System.out.println("Division: " + (gleitkommaZahl1 / gleitkommaZahl2));

        /*
         Division Ganzzahlen
         Werden 2 Ganzzahl-Datentypen miteinander durch einen Operator verbunden,
         kommt immer ein Ganzzahldatentyp heraus!!!
         */
        System.out.println("Division: " + (ganzZahl1 / ganzZahl2));

        //Hier werden die "Werte" der "int-Variablen" mit ein Typecast in "double" umgewandelt
        System.out.println("Division: " + ((double)ganzZahl1 / (double)ganzZahl2));
    }
}
