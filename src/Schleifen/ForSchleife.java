package Schleifen;

public class ForSchleife {

    // Diese For-Schleife wird durlaufen solange die Variable "zahl1" kleiner als 21 ist
    public static void einfacheForSchleife() {

        int zahl1;
        for (zahl1 = 0; zahl1 < 21; zahl1++) {
            System.out.println(zahl1);
            }
        }

    /*
     Dies ist eine endlose For-Schleife. Sie wird erst beendet, wenn der Wert der Variable "zahl4" größer als 50 ist.
     Durch die Anweisung "break" wird die Schleife beendet.
     */
    public static void einfacheForSchleifeAZ(){

        for (int zahl4 = 0;; zahl4++){

            if (zahl4 > 50){
                break;
            }
            System.out.println(zahl4);
        }
    }

    public static void ForEachSchleife(){

        int[] meinArray = new int[10];

                meinArray[0] = 1;
                meinArray[1] = 2;
                meinArray[2] = 3;
                meinArray[3] = 4;
                meinArray[4] = 5;
                meinArray[5] = 6;
                meinArray[6] = 7;
                meinArray[7] = 8;
                meinArray[8] = 9;
                meinArray[9] = 10;

        System.out.println("Ausgabe Array:");

                /*
                 Mit der erweiterten For-Schleife (For Each) ist es möglich ohne Angabe der Länge bei einem Array
                 die Werte auszulesen. Eine For-Each-Schleife erkennt die Länge von selbst.
                 */
                for (int eintrag : meinArray){

                    System.out.print(eintrag + " ");
                }
            }
}







