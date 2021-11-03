package Klassen;

public class Main {

    // Hiermit wird ein Objekt der Klasse 'BeispielInnereKlassen' erstellt.
    public static BeispielInnereKlassen bik = new BeispielInnereKlassen();

    /*
     Hiermit wird ein Objekt der inneren Klasse 'InnereKlasse' der Klasse 'BeispielInnereKlassen' erstellt.
     Um ein Objekt einer inneren Klasse zu erstellen, muss zuerst ein Objekt der äußeren Klasse erstellt werden.
     */
    public static BeispielInnereKlassen.InnereKlasse ik = new BeispielInnereKlassen.InnereKlasse();

    public static void main(String[] args) {

        System.out.println("Variablenausgabe von 'name' und 'nachname' des Objekt 'bik'");
        System.out.println(bik.getName() + " " + bik.getNachname());
        System.out.println("-----------------------------------------------------------");

        System.out.println("Variablenausgabe von 'name' und 'nachname' des Objekt 'ik'");
        System.out.println(ik.getName2() + " " + ik.getNachname2());
        System.out.println("-----------------------------------------------------------");
    }
}