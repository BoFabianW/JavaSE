package Objekte;

/**
 *  Durch das Erstellen von Objekten, können die Eigenschaften aus der Klasse, aus der das Objekt
 *  erstellt wurde, genutzt werden. Es können beliebig viele Instanzen (Objekte) einer Klasse erstellt werden.
 */
public class Main {

    public static void main(String[] args) {

        /*
         Hier werden 2 neue Instanzen (Objekte) der Klasse "Haus" erstellt.
         Nach der Erstellung kann auf die Eigenschaften durch Getter und Setter zugegriffen werden.
         Werteänderungen der Eigenschaften haben in diesem Fall nur Einfluss auf das jeweilige Objekt.
         Ebenfalls kann auf Methoden zugegriffen werden.
         */
        Haus haus1 = new Haus(1980, 200.000, "Max Mustermann");
        Haus haus2 = new Haus(1950, 245.000, "Al Bundy");

        System.out.println("Daten von Objekt 'haus1':");
        System.out.println("---------------------------------");
        System.out.println("Baujahr: " + haus1.getBaujahr());
        System.out.println("Preis: " + haus1.getPreis());
        System.out.println("Besitzer: " + haus1.getBesitzer());
        System.out.println("---------------------------------");

        // Eigenschaften durch Setter ändern.
        haus1.setBaujahr(1999);
        haus1.setPreis(300.000);
        haus1.setBesitzer("Donald Duck");

        System.out.println("Daten von Objekt 'haus1' nach Änderung:");
        System.out.println("---------------------------------");
        System.out.println("Baujahr: " + haus1.getBaujahr());
        System.out.println("Preis: " + haus1.getPreis());
        System.out.println("Besitzer: " + haus1.getBesitzer());
        System.out.println("---------------------------------");

        // Ausgabe der in der Klasse 'Haus' festgelegten 'toString-Methode'
        System.out.println(haus1);
        System.out.println("---------------------------------");

        System.out.println("Daten von Objekt 'haus2':");
        System.out.println("---------------------------------");
        System.out.println("Baujahr: " + haus2.getBaujahr());
        System.out.println("Preis: " + haus2.getPreis());
        System.out.println("Besitzer: " + haus2.getBesitzer());
        System.out.println("---------------------------------");
    }
}


