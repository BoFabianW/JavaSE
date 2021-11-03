package Vererbung;

/**
 *  Durch die Vererbung von Klassen können die Variablen und Methoden(Funktionen) der vererbten Klasse genutzt werden.
 *  In diesem Beispiel wird die Klasse "Tiere" den Klassen "Hund" und "Katze" vererbt. Diese Klassen können dann
 *  die gesamte Klasse "Tiere" mit verwenden.
 */
public class Main {

    public static void main(String[] args) {

        /*
         Hier wird von den Klassen "Hund" und "Katze" ein Objekt(Instanz) erstellt.
         Durch die Vererbung können die Objekte nun auf die Eigenschaften und Methoden der eigenen, wie auch der Klasse
         'Tiere' zugreifen.
         */
        Hund dog = new Hund(5, "Nala", "Braun");
        Katze cat = new Katze(3, "Mimi", "Schwarz");

        System.out.println("Eigenschaften des Hundes:\n");
        System.out.println("Der Hund ist " + dog.getAlter() + " Jahre alt.");
        System.out.println("Der Hund heißt " + dog.getName());
        System.out.println("Der Hund ist " + dog.getFarbe());

        dog.trinken();
        dog.sprechen();

        System.out.println("----------------------------------------------------------\n");

        System.out.println("Eigenschaften der Katze:\n");
        System.out.println("Die Katze ist " + cat.getAlter() + " Jahre alt.");
        System.out.println("Die Katze heißt " + cat.getName());
        System.out.println("Die Katze ist " + cat.getFarbe());

        cat.trinken();
        cat.sprechen();

        System.out.println("----------------------------------------------------------\n");
    }
}
