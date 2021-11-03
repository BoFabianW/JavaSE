package Konsole;

import java.util.Scanner;

public class Konsoleneingabe {

    /*
     Erstellen eines neues Scanner-Objektes.
     Dem Kontriktor des Scanners wird der Eingabestrom 'System.in' übergeben.
     */
    public static Scanner EingabeScanner = new Scanner(System.in);

    /**
     In dieser Methode wird die Konsoleneingabe durch den Benutzer dempnstriert.
     */
    public static void Eingabe() {

        System.out.print("Bitte hier den Text eingeben:  ");

        /*
        Hier wird der eingegebene Text der aktuellen Zeile in der Variable "eingabeText" gespeichert.
        Es wird auf eine Eingabe gewartet.
         */
        String eingabeText = EingabeScanner.nextLine();

        System.out.print("Es wurde folgender Text eingegeben:  ");

        // Hier wird der Text aus der Variable "eingabeText" auf der Konsole ausgegeben.
        System.out.println(eingabeText);

        // Hier wird der Scanner geschlossen.
        EingabeScanner.close();
    }

    /**
     In dieser Methode wird die Konsoleneingabe durch den Benutzer dempnstriert.
     Benutzer soll eine Zahl eingeben.
    */
    public static void EingabeAufZahlenPruefen(){

        System.out.print("Bitte eine Zahl eingeben:  ");

        if (EingabeScanner.hasNextDouble()) {
            double eingabeZahl = EingabeScanner.nextDouble();

            System.out.println("Es wurde die Zahl " + eingabeZahl + " eingegeben.");
        }
        else {

            System.out.println("Es wurde keine gueltige Zahl eingegeben.");
        }
    }

    public static void zahlenInParameternUebergeben(Integer zahl1, Integer zahl2) {

        //Hier werden die beiden uebergebenen Parameter aus der Methode auf der Konsole ausgegeben
        System.out.println("Dies ist die erste Zahl aus den Parametern:  " + zahl1);
        System.out.println("Dies ist die zweite Zahl aus den Parametern:  " + zahl2);

        // Der Int-Variable "ergebnis" erhält Ergebnis der Addition von "zahl1" und "zahl2".
        int ergebnis = zahl1 + zahl2;
        System.out.println("Biede Werte der Parameter addiert ergeben:  " + ergebnis);
    }

    }

