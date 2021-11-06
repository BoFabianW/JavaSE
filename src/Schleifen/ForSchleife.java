package Schleifen;

public class ForSchleife {

    // Diese For-Schleife wird durlaufen solange die Variable "zahl1" kleiner als 21 ist
    public static void einfacheForSchleife() {

        System.out.println("AUSGABE EINFACHE FOR-SCHLEIFE --- AUSGABE BIS 20");
        for (int i = 0; i < 21; i++) {
            System.out.print(i + ", ");
            }

        System.out.println("\nAUSGABE EINFACHE FOR-SCHLEIFE --- R e g e n b o g e n");

        String text = "Regenbogen";

        // Mit dieser For-Schleife wird bei jedem Durchgang ein Zeichen aus dem String 'text' ausgegeben.
        for (int i = 0; i <= text.length() -1; i++) {
            System.out.print(text.charAt(i) + " ");
        }
    }

    /*
     Dies ist eine endlose For-Schleife. Sie wird erst beendet, wenn der Wert der Variable "zahl4" größer als 50 ist.
     Durch die Anweisung "break" wird die Schleife beendet.
     */
    public static void einfacheForSchleife2(){

        System.out.println("\nAUSGABE EINFACHE FOR-SCHLEIFE --- AUSGABE BIS 30");

        for (int i = 0; i > -1 ; i++){

            System.out.print(i+ ", ");

            // Sobald i den Wert 30 erreicht hat, wird die Schleife beendet.
            if (i == 30) break;
        }
    }

    public static void ForEachSchleife(){

        int[] meinArray = new int[10];

        // Normale For-Schleife zum befüllen des Arrays.
        for (int i = 0 ; i <= meinArray.length -1 ; i++) {
            meinArray[i] = i + 1;
        }

        System.out.println("\nAUSGABE ARRAY MIT FOR-EACH-SCHLEIFE");

                /*
                 Mit der erweiterten For-Schleife (For-Each) ist es möglich, ohne Angabe der Länge bei einem Array, ArrayList usw.
                 die Werte auszulesen. Eine For-Each-Schleife erkennt die Länge von selbst.
                 */
                for (int eintrag : meinArray){
                    System.out.print(eintrag + " ");
                }
            }
}







