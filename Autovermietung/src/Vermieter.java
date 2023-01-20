public class Vermieter {

    private int vermieterbudget = 1000;

    public void geldannehmen (int kosten, int tage){
        vermieterbudget = vermieterbudget + (kosten*tage);
    }

    public boolean autoreparieren(boolean rep) {
        vermieterbudget = vermieterbudget - 50;
        boolean repariert = true;
        return repariert;
    }

    public boolean autoputzen(boolean put) {
        vermieterbudget = vermieterbudget - 20;
        boolean putzen = true;
        return putzen;
    }



}
