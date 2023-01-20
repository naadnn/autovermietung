import java.util.ArrayList;

public class Garage {



    private ArrayList<Auto> autos = new ArrayList<>();


    public ArrayList<Auto> getAutos() {
        return autos;
    }
    public void Autoanbieten(int budget) {

        for (int i = 0; i < autos.size(); i++) {
            if (autos.get(i).getPreis() <= budget){
                System.out.println("Günther: Den " + autos.get(i).getAutoname() + " von dem Modell: " + autos.get(i).getModell() + ".");
                System.out.println("         Dieser würde sie " + autos.get(i).getPreis() + "€ pro Tag kosten");
            }}
    }

    public void Automieten(String Autoname){
        int index = -1;
        System.out.println(autos.get(0).getAutoname()+" " + Autoname);
        for (int i = 0; i<autos.size();i++)
            if (autos.get(i).getAutoname().equals(Autoname)) {
                index = i;
                break;
            }

        // autos.indexOf(Autoname);
        System.out.println(autos.get(index).getAutoname());
    }
    public void AutohinzufuegnAutomatisch(){

    }
    public void StandartGarage(){
        autos.add(new Auto("Vw Golf", "Mittel", 69, false, false, 1444, 20, 80));
        autos.add(new Auto("MINI Cooper", "Klein", 70, false, false, 892900, 32, 40));
        autos.add(new Auto("Fiat 500", "Klein", 55, false, false, 228209, 17, 35));
        autos.add(new Auto("Fiat 500", "Klein", 55, false, false, 20478, 27, 35));
        autos.add(new Auto("MINI Cooper", "Klein", 70, true, false, 78220, 30, 40));
        autos.add(new Auto("Vw Golf", "Mittel", 69, false, false, 16899, 28, 80));
        autos.add(new Auto("Vw Golf", "Mittel", 69, false, false, 20938, 21, 80));
        autos.add(new Auto("Renault Twingo", "Klein", 49, false, false, 58970, 32, 35));
    }
}
