package Objektorientierung;
import java.util.Objects;
public class Haus {


    // Es handelt sich bei den folgenden Variablen um Variablen, die nicht der Klasse gehören sondern
    // einem von der Klasse erzeugten Objekt.
    // Mit der codierung "static" würde man die Variablen in den Besitz der Klasse "Haus" geben.
    public int baujahr;
    public int verkaufspreis;
    public String hausfarbe;
    public String besitzer;

    // Hier wird eine verkapselte String-Variable erstellt
    // Diese Variable ist nur innerhalb der eigenen Klasse sichtbar
    private String TestVariable;

    // Hier wird ein Kontruktor erstellt in dem die Variablen initilisiert werden.
    // Ein Konstruktor wird bei dem Aufruf der Klasse automatisch ausgeführt.
    // Dem Konstruktor können Parameter übergeben werden, die dann bei der Initialisierung übernommen werden
    // In eine Konstruktor werden nur Instanzvariablen initialisiert.
    public Haus(String neuerBesitzer, int neuesBaujahr, int neuerVerkaufspreis, String neueHaarfarbe) {

        baujahr = neuesBaujahr;
        verkaufspreis = neuerVerkaufspreis;
        hausfarbe = neueHaarfarbe;
        besitzer = neuerBesitzer;

        TestVariable = "Test";
    }


    // Diese Methode ist ein Getter. Der Name einer Getter-Methode beginnt immer mit "get".
    // Mit dieser Deklaration ist sofort klar das es sich um eine Getter-Methode handelt
    // In diesem Fall wird der Wert der Variable "TestVariable" zurückgegeben.
    public String getTestVariable() {

        return TestVariable;
    }

    // Diese Methode ist ein Setter. Der Name einer Setter-Methode beginnt immer mit "set".
    // Durch eine Setter-Methode ist es möglich, den Wert einer mit "private" deklarierte Variable
    // aus einer anderen Klasse zu verändern.
    public String setTestVariable(String neuerWert) {

    return TestVariable = neuerWert;

    }

}