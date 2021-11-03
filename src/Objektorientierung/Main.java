package Objektorientierung;

import javax.management.ObjectName;
import java.util.Objects;

/**
 *  Durch das Erstellen von Objekten, können die Eigenschaften und Methoden, aus der Klasse, aus der das Objekt
 *  erstellt wurde, genutzt werden.
 *
 *  Es können beliebig viele Objekte einer Klasse erstellt werden.
 */

public class Main {


    public static void main(String[] args) {

        // Hier werden 2 neue Objekte der Klasse "Haus" erstellt.
        // Bei der Erstellung neuer Objekte kann jedes erstellet Objekt auf die Eigenschaften zugreifen.
        // Werteänderungen der Eigenschaften haben in diesem Fall nur Einfluss auf das jeweilige Objekt.
        // Beim erstellen eines neuen Objektes können Parameter übergeben werden (Solange der Konstruktor der
        // Klasse aus der das Objekt erstellt, es zulässt)

        Haus fabian = new Haus("Tyler", 1800, 55000, "braun");
        Haus daniel = new Haus("Cijay" ,1850, 58600, "rot");

        System.out.println("Daten Objekt fabian:");
        System.out.println("------------------------------");
        System.out.println(fabian.besitzer);
        System.out.println(fabian.baujahr);
        System.out.println(fabian.verkaufspreis);
        System.out.println(fabian.hausfarbe);

        System.out.println("\nDaten Objekt daniel:");
        System.out.println("------------------------------");
        System.out.println(daniel.besitzer);
        System.out.println(daniel.baujahr);
        System.out.println(daniel.verkaufspreis);
        System.out.println(daniel.hausfarbe);

        System.out.println("\n-----------------------------");

        // Mit dieser Anweisung wird der zurückgegebene Wert der Variable "TestVariable" aus der Klasse "Haus"
        // auf der Konsole ausgegeben. Ein direkter Zugriff auf diese Variable ist durch die Deklarierung mit "private"
        // nicht möglich und kann nur durch eine Getter-Methode erfolgen.
        System.out.println(fabian.getTestVariable());

        // Mit dieser Anweisung wird der übergebene Wert ( in diesem Fall 'Josephine' ) der Variable "TestVariable"
        // aus der Klasse "Haus" übergeben. Da diese Variable mit "private" deklariert wurde, ist ein direkter Zugriff
        // oder Änderung nicht möglich und wird nur durch eine Setter-Methode ermöglicht.
        System.out.println(fabian.setTestVariable("Josephine"));

    }

}


