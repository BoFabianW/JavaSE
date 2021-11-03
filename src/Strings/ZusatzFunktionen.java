package Strings;

public class ZusatzFunktionen {

    // Mit der Funktion "toLowerCase" wird der übergebene String in Kleinbuchstaben ausgegeben.
    public static void kleinschreiben(String text){

        System.out.println("Textausgabe mit 'toLowerCase':");
        System.out.println(text.toLowerCase());
        System.out.println("------------------------------------------\n");
    }

    // Mit der Funktion "toUpperCase" wird der übergebene String in Großbuchstaben ausgegeben.
    public static void grossschreiben (String text) {

        System.out.println("Textausgabe mit 'toUpperCase':");
        System.out.println(text.toUpperCase());
        System.out.println("------------------------------------------\n");
    }

    /** Mit dieser Methode wird das erste Vorkommen eines Strings oder Zeichens ermittelt.
     *  In diesem Beispiel wird aus dem übergebenen String "text" das Vorkommen des übergebenen Strings 'suchen' ermittelt.
     */
    public static void stringAufInhaltPruefen(String text, String suchen){

        // Mit 'Contains' kann ueberprueft werden, ob in einer Zeichenkette bestimmte Zeichen enthalten sind.
        if (text.contains(suchen)) {

            System.out.println("Gescuhte Zeichenkette vorhanden!\n");

        }else {
            System.out.println("Gesuchte Zeichenkette NICHT vorhanden!\n");
        }
    }
}
