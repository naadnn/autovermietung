import java.util.Scanner;

public class Mieter {
    private boolean Fuehrerschein;
    private String Name;
    private int Alter;

    private int Budget;

    public boolean isFuehrerschein() {
        return Fuehrerschein;
    }

    public String getName() {
        return Name;
    }

    public int getAlter() {
        return Alter;
    }

    public int getBudget() {
        return Budget;
    }

    public Mieter(boolean fuehrerschein, String name, int alter, int budget) {
        Fuehrerschein = fuehrerschein;
        Name = name;
        Alter = alter;
        Budget = budget;
    }
    }


