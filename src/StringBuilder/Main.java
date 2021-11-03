package StringBuilder;

public class Main {

    public static void main(String[] args) {

        StringBuilderUebung();

        }

        public static void StringBuilderUebung() {

            // Hier wird ein neues Objekt der Klasse StringBuilder erstellt.
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            /*
             Mit einem StringBuilder kann ein String aus verschiedenen Datentypen erstellt werden.
             Im folgenden Beispiel aus Strings und int.
             */
            sb.append("Hallo ");
            sb.append("da bin ");
            sb.append("ich und ich bin ");
            sb.append(5);
            sb.append(" Jahre alt");

            System.out.println("Ausgabe StringBuilder 'sb':");
            System.out.println(sb);
            System.out.println("-------------------------------------------------\n");

            /*
             Hier durchlaufen wir eine For-Schleife von 0 - 20.
             Bei jedem Durchgang wird der Wert von "i" und ein Leerzeichen durch die Funktion "append" dem String angehängt.
             Zum Schluss wird der gesamte String auf der Konsole ausgegeben.
             */

            for (int i = 0; i <= 20; i++){

                sb2.append(i).append(" ");
            }

            System.out.println("Ausgabe StringBuilder 'sb2':");
            System.out.println(sb2);
            System.out.println("-------------------------------------------------\n");


            /*
             Mit der Funktion "delete" wird ein String in dem StringBuilder-Objekt gelöscht.
             In diesem Fall fangen wir am Anfang des Strings an und löschen den gesamten String bis zum Ende.
             Die "0" gibt den Index an, von dem an gelöscht werden soll. "Length" bezieht sich hierbei auf die gesamte
             Länge des Strings. Es können auch nur Teile aus dem String durch Angabe des "Start-Index" und "End-Index"
             entfernt werden.
             */
            sb.delete(0, sb.length());

            // String im StringBuilder erzeugen
            sb.append("Ich werde dem StringBuilder hinzugefügt.");

            /*
             Teilentfernung in einem StringBuilder.
             In diesem Fall wird von Indexposition 5 bis 10 aus dem String (Zeichenkette) gelöscht.
             */
            sb.delete(5, 10);

            // Ausgabe des StringBuilders nach der Entfernung.
            System.out.println("Inhalt von sb: " + sb);
    }
}
