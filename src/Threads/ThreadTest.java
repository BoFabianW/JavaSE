package Threads;

public class ThreadTest implements Runnable {

    @Override
    public void run() {

        System.out.println("Thread gestartet ...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread beendet!");
    }
}

