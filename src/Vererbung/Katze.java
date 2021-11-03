package Vererbung;

// Durch den Zusatz "extends" findet einer Vererbung mit der Klasse "Tiere" statt.
public class Katze extends Tier {

    // Konstruktor.
    public Katze(int alter, String name, String farbe) {

        // Pbergabe der Parameter an die Elternklasse (Tiere).
        super(alter, name, farbe);
    }

    /*
     * Hier wird die Methode "sprechen" aus der Klasse "Tiere" überschrieben.
     * Da in der Klasse "Tiere" eine Methode mit demselben Namen existiert, wird die Methode aus der Klasse "Tiere"
     * ignoriert und die Methode aus der Klasse "Hund" ausgeführt.
     */
    @Override
    public void sprechen() {

        // Konsolenausgabe.
        System.out.println("Miao, Miao, Miao ....");
    }
}
