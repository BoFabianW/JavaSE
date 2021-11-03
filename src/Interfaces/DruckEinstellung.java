package Interfaces;

/**
 *  Hierbei handelt es sich um ein Interface. Interfaces sind im Grunde Klassen mit Einschränkungen.
 *  In einem Interface werden automatisch alle Variablen und Methoden mit "public" und "abstract" deklariert
 *  Die Variablen sind implizit 'public', 'final' und 'static'.
 *  Die Variablen in einem Interface können durch die Deklaration 'final' in ihren Eigenschaften nicht mehr verändert werden
 */

public interface DruckEinstellung {

    int zahl = 50;

    void einstellung();

    void testVerbindung();

    void testDruck();

    // Das public-Schlüsselwort kann auch weggelassen werden, da alle Methoden in einem
    // Interface IMMER public sind public
    default void print() {
        System.out.println("Drucken - Interface-DruckEinstellung");
    }
}