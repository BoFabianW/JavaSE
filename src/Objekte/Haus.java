package Objekte;

/*
 Diese Klasse soll ein Objekt 'Haus' darstellen.
 */
public class Haus {

    // Eigenschaften des Objektes
    private int baujahr;
    private double preis;
    private String besitzer;

    /*
     Konstruktor.
     In diesem Fall werden beim Erstellen einer neuen Instanz (Objekt) Parameter übergeben.
     */
    public Haus(int baujahr, double preis, String besitzer) {
        this.baujahr = baujahr;
        this.preis = preis;
        this.besitzer = besitzer;
    }

    // Durch das Überschreiben dieser Methode wird explizit festgelegt, wie die Ausgabe auszusehen hat.
    @Override
    public String toString() {
        return "Baujahr: " + baujahr + ", Preis: " + preis + ", Besitzer: " + besitzer;
    }

    // =============== GETTER UND SETTER ==================
    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(String besitzer) {
        this.besitzer = besitzer;
    }
}