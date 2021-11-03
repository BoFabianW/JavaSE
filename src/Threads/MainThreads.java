package Threads;

/*
 * Durch ein Thread können Operationen gleichzeitig ausgeführt werden
 */

public class MainThreads {

    public static void main(String[] args) throws InterruptedException {

        Thread ta = new Thread(new ThreadAddieren());
        Thread ta2 = new Thread(new ThreadAddieren());

        ta.start();
//        // Mit der Funktion 'join' wird die Methode angewiesen auf Beendigung zu warten bevor die nächste Methode startet.
//        // Der Thread startet mit 'start'. der nächste Thread startet erst nachdem der erste beendet wurde,
        ta.join();
        System.out.println("Erster Thread beendet");

        ta2.start();
        ta2.join();

        System.out.println("Zweiter Thread beednet");

//        // Durch das vorangestellte 'join' wird diese Meldung erst ausgegeben nachdem der Thread beendet ist.
        System.out.println("Ich habe " + System.currentTimeMillis() + " ms gewartet!");

       threadWaitAndNotify();

        }

        public static void threadWaitAndNotify() {
            BenachrichtigungsObjekt bo = new BenachrichtigungsObjekt();

            Thread t1 = new Thread(new UebungAmpel(bo));

            t1.start();
    }
}
