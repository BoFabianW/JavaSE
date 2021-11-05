package Threads;

public class BenachrichtigungsObjekt {

    private boolean stop;

    public BenachrichtigungsObjekt() {
        stop = true;
    }

    public synchronized void weiter() {
        stop = false;
    }
}
