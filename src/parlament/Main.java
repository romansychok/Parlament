package parlament;

import com.sun.javafx.css.CalculatedValue;

import java.util.Scanner;

/**
 * Created by Home on 06.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parlament parlament = new Parlament();


        boolean work = true;

        while (work){
            menu();
            switch (sc.nextInt()){

                case 1:
                    parlament.addFactionIntoParlament();
                    break;
                case 2:
                    parlament.removeFactionFromParlament();
                    break;
                case 3:
                    parlament.showAllFaction();
                    break;
                case 4:
                    parlament.showSomeFaction();
                    break;
                case 5:
                    parlament.clearFaction();
                    break;
                case 6:
                    parlament.addDeputyIntoFaction();
                    break;
                case 7:
                    parlament.removeDeputyFromFaction();
                    break;
                case 8:
                    parlament.showAllGrafters();
                    break;
                case 9:
                    parlament.showTheBiggestGrafter();
                    break;
                case 10:
                    parlament.giveAGraft();
                    break;
                case 11:
                    parlament.allDeputyInFaction();
                    break;

            }
        }

    }

    public static void menu(){
        System.out.println("Enter 1 to add faction into parlament");
        System.out.println("Enter 2 to remove faction from parlament");
        System.out.println("Enter 3 to see all factions");
        System.out.println("Enter 4 to see current faction");
        System.out.println("Enter 5 to clear faction");
        System.out.println("Enter 6 to add deputy into faction");
        System.out.println("Enter 7 to remove deputy from faction");
        System.out.println("Enter 8 to see all grafters");
        System.out.println("Enter 9 to see the biggest grafter in faction");
        System.out.println("Enter 10 to give deputy a graft");
        System.out.println("Enter 11 to see all deputy into faction");
    }


}
