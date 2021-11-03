package Threads;

public class UebungAmpel implements Runnable{

    private BenachrichtigungsObjekt bo;

    public UebungAmpel(BenachrichtigungsObjekt bo) {

        this.bo = bo;
    }

    @Override
    public void run() {
        System.out.println("Autos fahren auf die Ampel zu ...");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Autos stehen vor der Amepl ... Ampel ist rot");
        bo.weiter();

        System.out.println("Autos warten auf grün ...");


        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Es ist grün ... Autos dürfen fahren ...");
    }
    }
