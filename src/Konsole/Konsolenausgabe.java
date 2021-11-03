package Konsole;

public class Konsolenausgabe {

    public static void AusgabeText() {

        // Gibt einen Text auf der KOnsole aus.
        System.out.println("Dieser Text wird auf der Konsole ausgegeben!");
    }

    public static void AusgabeTextMitParameter(String AusgabeText) {

        // Gibt den übergebenen String auf der Konsole aus.
        System.out.println(AusgabeText);
    }

    public static void AusgabeMitTextumbruch() {

        //Hier werden 3 Textzeilen auf der Konsole ausgegeben.
        System.out.println("Hier faengt der Text an");
        System.out.println("-----------------------\n");
        System.out.println("hier geht der Text weiter");
    }

    public static void AusgabeMitZweiParametern(String Ausgabe1, String Ausgabe2){

        System.out.println(Ausgabe1 + " " + Ausgabe2);
    }

    public static void AusgabeMitZahlen(){

        int zahl1 = 10;
        int zahl2 = 15;

        // Variable 'zahl1' und 'zahl2' werden addiert und in der Variable 'ergebnis' gespeichert.
        int ergebnis = zahl1 + zahl2;

        // Auf der Konsole wird ein String + der Wert der Variable 'ergebnis' ausgegeben.
        System.out.println("Die Variable zahl1(10) und die Variable zahl2(15) ergeben addiert:  " + ergebnis);
    }
}
