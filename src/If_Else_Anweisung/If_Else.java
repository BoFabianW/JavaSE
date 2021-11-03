package If_Else_Anweisung;

public class If_Else {

    public static void beispielIfAnweisung(int eingabeZahl1) {

        // Hier möchten wir prüfen ob der Wert der Variable "eingabeZahl1" größer oder kleiner als 50 ist.
        System.out.println("In dieser Anweisung wird geprüft, ob die übergebene Zahl größer, kleiner oder gleich 50 ist.\n");

        if (eingabeZahl1 < 50) {

            System.out.println("Die übergebene Zahl ist kleiner als 50");
        }

        else if ( eingabeZahl1 > 50) {

            System.out.println("Die übergebene Zahl ist größer als 50");
        }

        else {
            System.out.println("Die übergebene Zahl ist 50");
        }
    }

    public static void IfAnweisungVerschachtelt(int Zahl1, int Zahl2){

        /*
         Hierbei handelt es sich um eine verzweigte If-Anweisung.
         Als Erstes wird geprüft, ob der Wert der übergebenen Variabel "Zahl1" größer ist als 50.
         Nur wenn die Variable größer als 50 ist, wird eine Ausgabe getätigt und mit der zweiten
         If-Anweisung geprüft, ob der Wert der Variable "Zahl2" größer als 50 ist.
         */

        if (Zahl1 >= 50) {

            System.out.println("Die erste Zahl ist größer als 50");

            if (Zahl2 >= 50) {

                System.out.println("Die zweite Zahl ist größer oder gleich 50");

            }
            else {
                System.out.println("Die zweite Zahl ist kleiner als 50");
            }
        }
    }
}
