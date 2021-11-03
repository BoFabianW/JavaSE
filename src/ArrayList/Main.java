package ArrayList;
import java.util.ArrayList;

/*
 * ArrayList speichert Elemente in einem internen Array.
 * Dadurch wird der Zugriff auf ein einzelnes Element über die Position in der
 * Liste sehr schnell. Es bedeuted jedoch viel Arbeit für ein Array, wenn Elemente
 * eingefügt oder gelöscht werden.
 * Ausserdem kann die Größe des internen Feldes zu klein werden. Dann bleibt der
 * Laufzeitumgebung nichts anderes übrig, als ein neues größeres Objekt anzulegen
 * und alle Elemente zu kopieren.
 *
 */

public class Main {

    public static void main(String[] args) {

        /*
         Hier wird eine ArrayList für z.B. Objekte erstellt.
         In dieser Liste können dann verschiedene Datentypen eingetragen werden.
         */
        ArrayList<Object> liste = new ArrayList<>();

        // Hier werden der Arraylist Werte von verschiedenen Datentypen hinzugefügt
        liste.add("Java ist toll");
        liste.add(13);
        liste.add(13L);
        liste.add('A');
        liste.add(true);
        liste.add(3.14);
        liste.add("Java ist toll");

        // Konsolenausgabe.
        System.out.println("Inhalt der ArrayList: \n");

        /*
         Durchlaufen der ArrayList mit einer 'forEach-Schleife'.
         Da es sich in der ArrayList um verschiedene Datentypen handelt, behandelt man die Einträge als undefiniertes
         Objekt und gibt die Werte als 'Value' zurück.
         */
        for (Object value : liste) {
            System.out.println(value);
        }

        /*
         Alternative Schleife zum Durchlaufen einer ArrayList.
         Bevorzugt wird allerdings die 'forEach-Schleife'.
         */
        for(int i = 0 ; i < liste.size() ; i++) {
            System.out.println(liste.get(i));
        }

        // Konsolenausgabe.
        System.out.println("\nInhalt der ArrayList nach der Änderung:\n");

        /*
         Mit der Funktion 'remove' wird hier ein Objekt aus der ArrayList gelöscht.
         Sollte ein Objekt mehrmals in der Arraylist vorkommen, wird immer nur das erste Objekt aus der Liste
         gelöscht.
         */
        liste.remove("Java ist toll");

        // Durchlaufen der ArrayList mit einer 'forEach-Schleife'.
        for (Object value : liste) {
            System.out.println(value);
        }

        // Konsolenausgabe.
        System.out.println("\nAusgabe eines bestimmten Elementes aus der ArrayList:\n");

         /*
         Ausgegeben wird 'true', da in der ArrayList auf Indexposition 3 ein Boolean mit dem Wert 'true' steht.
         Listen beginnen immer mit dem Index 0.
         */
        System.out.println(liste.get(3));

        // Hier wird eine ArrayList für Integer erstellt.
        ArrayList<Integer> intListe = new ArrayList<>();

        intListe.add(13);
        intListe.add(134);
        intListe.add(205);
        intListe.add(874);
        intListe.add(6958);

        // Konsolenausgabe.
        System.out.println("\nInhalt der ArrayList für Integer:\n");

        // ArrayList mit einer For-Each-Schleife durchlaufen.
        for (Integer i : intListe) {
            System.out.print(i + " ");
        }

        /*
         Mit dieser Anweisung wird ein neuer Wert an einer bestimmten Position gesetzt.
         */
        intListe.add(3, 500);

        // Mit dieser Anweisung wird ein Wert an einer bestimmten Position verändert.
        intListe.set(4, 600);

        // Suchen und ersetzen eines Elements
        intListe.set(intListe.indexOf(134), 138);

        // Konsolenausgabe.
        System.out.println("\n\nInhalt der ArrayList für Integer nach der Änderung:\n");

        // ArrayList mit einer For-Each-Schleife durchlaufen
        for (Integer i : intListe) {
            System.out.print(i + " ");
        }
        // Konsolenausgabe.
        System.out.println("\n\nInhalt der ArrayList für Integer nach dem Löschen:\n");

        /*
         Mit der Funktion "remove" können Einträge an der angegebenen Indexpostion aus der ArrayList
         gelöscht werden. Im folgenden Beispiel wird an Indexposition 3 der Key '500' gelöscht.
         */
        intListe.remove(3);

        for (Integer i : intListe) {
            System.out.print(i + " ");
        }
    }
}