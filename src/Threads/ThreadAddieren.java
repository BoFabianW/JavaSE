package Threads;

public class ThreadAddieren implements Runnable {

    int zahl = 0;
    int i = 0;
    int zwischenstand;

    @Override
    public void run() {

        for (i = 0; i < Integer.MAX_VALUE; i++) {

            zahl = zahl + i;
            zwischenstand = zwischenstand + 1;

            if (zwischenstand == 250000000) {
                System.out.println(zahl);
                zwischenstand = 0;
            }
        }
        zahl = 0;
        zwischenstand = 0;
        i = 0;
    }
}


