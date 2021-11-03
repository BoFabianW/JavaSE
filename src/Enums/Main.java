package Enums;

/*
 * Mit enums (kurz für enumeration, zu deutsch: Aufzählung) bietet Java dem Programmierer die Möglichkeit,
 * vordefinierte Konstanten für Variablen festzulegen. Dies ist besonders dann sinnvoll, wenn eine Variable
 * nur eine kleine Anzahl von benennbaren Zuständen hat. Dabei kann es sich zum Beispiel um Spielkarten
 * (Kreuz, Pik, Herz, Karo) handeln oder auch um den Namen des Wochentags.
 */

public class Main {

    public static void main(String[] args) {

        // Variable vom Typ 'Muenze'
        Muenze muenze = Muenze.einEuro;

        System.out.println(muenze + " " + muenze.getWert());

        // Aufruf der Methode 'wechselgeld' aus der Klasse 'Muenze' mit Übergabe des Wechselgeldes als 'int'.
        Muenze.wechselgeld(1452);

       }
    }

