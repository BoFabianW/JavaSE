package methodenWertrueckgabe;

public class Main {

    public static void main(String[] args) {

        // Aufruf der Methode
        rueckgabeEntgegennehemn();

        // Hier wird die Methode "TextRueckgabeMitParameter" aufgerufen und ihr der Parameter "Sehr gut" übergeben.
        methodenWertrueckgabe.TextRueckgabeMitParameter("Sehr gut");
    }

    /** Mit dieser Methode wird die Methode "TextRueckgabe" aus der Klasse "methodenWertrueckgabe" aufgerufen
      * und der zurückgegebene Wert/Text aus der Methode "TextRueckgabe" in einer Konsole ausgegeben.
     **/

    public static void rueckgabeEntgegennehemn() {

        //Hier wird in der Variable "rueckgabe" der zurückgegebene Wert aus der Methode "TextRueckgabe"
        //aus der Klasse "methodenWertrueckgabe" gespeichert

        String rueckgabe = methodenWertrueckgabe.TextRueckgabe();

        //Ausgabe der Variable auf einer Konsole
        System.out.println(rueckgabe);
    }
}