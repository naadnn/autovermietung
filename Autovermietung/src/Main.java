import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String Gespraech; int gespraech;
        Scanner sc = new Scanner(System.in);
        Garage Garage = new Garage();
        Garage.StandartGarage();

        boolean Fuehrerschein = false;

        String Ich = "Innere Stimme";
        System.out.print(Ich + ": Bitte trage deinen Namen ein: ");
        String Name = sc.nextLine();

        System.out.println("Günther: Hallo und Herzlich Willkommen bei der Autovermietung ...");
        System.out.println("Günther: Als erstes möchte ich wissen wie Alt bist du?");
        System.out.print(Name+ ": ");
        gespraech = sc.nextInt();
        if(gespraech < 18){
            System.out.println("Günther: Du bist zu Jung ");
            System.out.println("Tschüss");
            return;
        }
        int Alter = gespraech;
        System.out.println("Günther: Kannst du mir deinen Führerschein bitte vorzeigen!");
        System.out.print(Ich+ " : Hast du einen Führerschein?: ");
        Gespraech = sc.next();
        if (Gespraech.equals("Ja")||Gespraech.equals("ja")||Gespraech.equals("True")||Gespraech.equals("true")) Fuehrerschein = true;
        System.out.print(Name+ ": ");
        if (Fuehrerschein) System.out.println(" hier bitte."); else {
            System.out.println(" Leider nein");
            System.out.println("Günther: Ohne Führerschein kann ich dir kein Auto geben!");
            return;}
        System.out.println("Günther: Für wie viele Tage möchtest du ein Auto mieten");
        System.out.print(Name + ": ");
        int tage = sc.nextInt();
        System.out.println("Günther: Wie viel Budget hast du zur Verfügung");
        System.out.print(Name + ": ");
        int budget = sc.nextInt();
        Mieter Mieter = new Mieter(Fuehrerschein,Name,Alter,budget);
        int Kaufmoeglichkeit = budget/tage;
        System.out.println(Ich+ " : Was möchste ich " + Name +" machen/wissen?");
        System.out.println("1. Budget wissen");
        System.out.println("2. Auto mieten");
        gespraech = sc.nextInt();
        if (gespraech==1)System.out.println(Ich + " : Mein derzeitiges Budget ist: " + Mieter.getBudget());
        if (gespraech==2){
            System.out.println(Name + " : Ich möchte ein Auto bei ihnen mieten.");
            System.out.println("Günther: ich kann Ihnen folgende Autos anhand ihres Budgets anbieten.");
            Garage.Autoanbieten(Kaufmoeglichkeit);
            System.out.println("Günther: Welches davon möchtest du?");
            System.out.print(Ich + " : Was möchte ich für eins?");
            Gespraech = sc.next();
            Garage.Automieten(Gespraech);

        }

    }
}