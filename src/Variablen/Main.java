package Variablen;

/*
 Standardwerte:

 boolean    = false
 char       = \u0000
 byte       = 0
 short      = 0
 int        = 0
 long       = 0
 float      = 0.0
 double     = 0.0
 */

public class Main {

    public static String stringVariable;

    /*
     Hier werden Variablen mit einem Datentyp deklariert.
     Datentypen sind int, double, long, byte, short, float, char oder boolean-Variablen
     werden immer am Anfang kleine geschrieben
     */
    public static int intVariable;
    public static double doubleVariable;
    public static long longVariable;
    public static byte byteVariable;
    public static short shortVariable;
    public static float floatVariable;
    public static char charVariable;
    public static boolean booleanVariable;

    public static void main(String[] args) {

        // Eine String-Variable kann Buchstaben, Zahlen und Zeichen entahlten.
        stringVariable = "\nDiese Konsolenausgabe stammt aus einem String.";
        System.out.println(stringVariable);

        System.out.println("-----------------------------------------------------------------\n");

        // Eine Byte-Variable enthält nur Ganzzahlen (8 Bit)
        System.out.println("Geltungsbereicht der Byte-Variable: " + (Byte.MAX_VALUE) + " bis " + (Byte.MIN_VALUE));
        System.out.println("-----------------------------------------------------------------\n");

        // Eine Short-Variable enthält nur Ganzzahlen (16 Bit)
        System.out.println("Geltungsbereicht der Short-Variable: " + (Short.MAX_VALUE) + " bis " + (Short.MIN_VALUE));
        System.out.println("-----------------------------------------------------------------\n");

        // Eine Int-Variable enthält nur Ganzzahlen (32 Bit)
        System.out.println("Geltungsbereicht der Int-Variable: " + (Integer.MAX_VALUE) + " bis " + (Integer.MIN_VALUE));
        System.out.println("-----------------------------------------------------------------\n");

        // Eine Long-Variable enthält nur Ganzzahlen (64 Bit)
        System.out.println("Geltungsbereicht der Long-Variable: " + (Long.MAX_VALUE) + " bis " + (Long.MIN_VALUE));
        System.out.println("-----------------------------------------------------------------\n");

        // Eine Double-Variable enthält Fließkommazahlen (64 Bit)
        System.out.println("Geltungsbereicht der Double-Variable: " + (Double.MAX_VALUE) + " bis " + (Double.MIN_VALUE));
        System.out.println("-----------------------------------------------------------------\n");

        // Eine Float-Variable enthält Fließkommazahlen (32 Bit)
        System.out.println("Geltungsbereicht der Float-Variable: " + (Float.MAX_VALUE) + " bis " + (Float.MIN_VALUE));
        System.out.println("-----------------------------------------------------------------\n");

        // Eine Char-Variable enthält immer einen Buchstaben (16 Bit)
        System.out.println("Die Char-Variable enthaelt immer nur EINEN Buchstaben, Zahl oder Zeichen. - z.B. " + (charVariable = 'a'));
        System.out.println("-----------------------------------------------------------------\n");

        /*
         Eine Boolean-Variable enthält immer ein "true" oder "false" (1 Bit)
         */
        System.out.println("Die boolean-Variable enthaelt immer ein true oder false - z.B. " + booleanVariable);
        System.out.println("-----------------------------------------------------------------\n");
    }
}
