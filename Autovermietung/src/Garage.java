import java.util.ArrayList;

public class Garage {



    private ArrayList<Auto> autos = new ArrayList<>();


    public void AutohinzufuegnManuell(){

    }
    public void AutohinzufuegnAutomatisch(){

    }
    public void StandartGarage(){
        autos.add(new Auto("Vw Golf", "Mittel", 69, false, false, 1444, 20, 80));

    }
}
