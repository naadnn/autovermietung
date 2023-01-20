import java.util.Random;

public class Auto {
    private String Autoname;
    private String Modell;
    private int Preis;
    private boolean dreckig;
    private boolean kaputt;
    private int KmStand;
    private int Tank;
    private int TankMax;

    public Auto(String autoname, String modell, int preis, boolean dreckig, boolean kaputt, int kmStand, int tank, int tankMax) {
        Autoname = autoname;
        Modell = modell;
        Preis = preis;
        this.dreckig = dreckig;
        this.kaputt = kaputt;
        KmStand = kmStand;
        Tank = tank;
        TankMax = tankMax;
    }

    public String getAutoname() {
        return Autoname;
    }

    public String getModell() {
        return Modell;
    }

    public int getPreis() {
        return Preis;
    }

    public boolean isDreckig() {
        return dreckig;
    }

    public boolean isKaputt() {
        return kaputt;
    }

    public int getKmStand() {
        return KmStand;
    }

    public int getTank() {
        return Tank;
    }

    public int getTankMax() {
        return TankMax;
    }

    public void dreckigwerden(){
    Random Random = new Random();
    int x = Random.nextInt(1,10);
    if (x<8) dreckig=true;
    }
    public void kaputtgehen(){
        Random Random = new Random();
        int x = Random.nextInt(1,10);
        if (x<1) kaputt=true;
    }
    public void getanktwerden(int auffuellen){
        if (Tank + auffuellen > TankMax) System.out.println("Das überschreitet das Maximum");
        else Tank = Tank + auffuellen;
    }
    public void fahren(int Kmfahren){
        KmStand = KmStand + Kmfahren;
    }
}
