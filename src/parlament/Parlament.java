package parlament;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Home on 01.07.2017.
 */
public class Parlament {

    Map<Faction,List<Deputy>> map = new ConcurrentHashMap<>();
    Deputy deputy = new Deputy();
    Faction faction = new Faction();


    public  void addFactionIntoParlament() {
        Scanner sc = new Scanner(System.in);
        boolean work = true;
        System.out.println("Enter name of faction");
        String factionName = sc.next();
        if (map.isEmpty() && work) {
            map.put(new Faction(factionName), new ArrayList<Deputy>());
            work = false;
        } else if (work) {
            for (Faction faction : map.keySet()) {
                if (faction.getNameOfFaction().equals(factionName) && work) {
                    System.out.println("this faction is already exist");
                }
            }

        }
    }

    public void removeFactionFromParlament(){
        Scanner sc = new Scanner(System.in);
        boolean work = true;
        System.out.println("What faction you want to remove?");
        String factionName = sc.next();
        Iterator<Map.Entry<Faction, List<Deputy>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Faction, List<Deputy>> mapRemove = iterator.next();
            if (mapRemove.getKey().getNameOfFaction().equals(factionName)){
                iterator.remove();
            }
        }

    }

    public void clearFaction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter faction name to clean it");
        String factionName = sc.next();
        Iterator<Map.Entry<Faction,List<Deputy>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Faction, List<Deputy>> entry = iterator.next();
            if (entry.getKey().getNameOfFaction().equals(factionName)){
              List<Deputy> deputyList = entry.getValue();
              Iterator<Deputy> deputyIterator = deputyList.iterator();
              while (deputyIterator.hasNext()){
                Deputy deputy = deputyIterator.next();
                if (!deputyList.isEmpty()){
                    deputyIterator.remove();
                }
              }

            }
        }
    }


    public void showAllFaction(){
        for (Faction faction : map.keySet()) {
            System.out.println(faction.getNameOfFaction());
        }
    }

    public void showSomeFaction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter faction name ");
        String factionName = sc.next();
        Iterator<Map.Entry<Faction,List<Deputy>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Faction,List<Deputy>> showFaction = iterator.next();
            if (showFaction.getKey().getNameOfFaction().equals(factionName)){
                System.out.println(showFaction);
            }
        }
    }

    public void addDeputyIntoFaction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter faction name");
        String factionName = sc.next();
        Iterator<Map.Entry<Faction,List<Deputy>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Faction,List<Deputy>> addDeputy = iterator.next();
            if (addDeputy.getKey().getNameOfFaction().equals(factionName)){
                System.out.println("Enter deputy lastName");
                String lastName = sc.next();
                System.out.println("Enter deputy age");
                int age = sc.nextInt();
                System.out.println("Is grafter?");
                boolean grafter = sc.nextBoolean();
                System.out.println("size of graft");
                int graft = sc.nextInt();
                addDeputy.getValue().add(new Deputy(lastName,age,grafter,graft));

            }
        }
    }

    public void removeDeputyFromFaction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter faction name");
        String factionName = sc.next();
        Iterator<Map.Entry<Faction,List<Deputy>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Faction,List<Deputy>> removeDeputy = iterator.next();
            if (removeDeputy.getKey().getNameOfFaction().equals(factionName)){
                System.out.println("Enter deputy name");
                String lastName = sc.next();
                List<Deputy> deputyList = removeDeputy.getValue();
                Iterator<Deputy> deputyIterator = deputyList.iterator();
                while (deputyIterator.hasNext()){
                    Deputy deputyRemove = deputyIterator.next();
                    if (deputyRemove.getLastName().equals(lastName)){
                        deputyIterator.remove();
                    }
                }
            }
        }
    }

    public void showAllGrafters(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter faction name");
        String factionName = sc.next();
        Iterator<Map.Entry<Faction,List<Deputy>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Faction,List<Deputy>> mapS = iterator.next();
            if (mapS.getKey().getNameOfFaction().equals(factionName)) {
                List<Deputy> deputyList = mapS.getValue();
                Iterator<Deputy> deputyIterator = deputyList.iterator();
                while (deputyIterator.hasNext()){
                    Deputy deputy = deputyIterator.next();
                    if (deputy.isGrafter()==true){
                        System.out.println(deputy);
                    }
                }
            }
        }
    }

   public void showTheBiggestGrafter(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter faction name");
       String factionName = sc.next();
       Iterator<Map.Entry<Faction,List<Deputy>>> iterator = map.entrySet().iterator();
       while (iterator.hasNext()){
           Map.Entry<Faction,List<Deputy>> deputyEntry = iterator.next();
           if (deputyEntry.getKey().getNameOfFaction().equals(factionName)){
             List<Deputy> deputyList = deputyEntry.getValue();
               int graft = 0;
               for (int i = 0; i < deputyList.size(); i++) {
                   if (deputyList.get(i).getGraft()>graft){
                       graft = deputyList.iterator().next().getGraft();
                       System.out.println(graft);
                   }
               }
           }
       }
   }


    public void giveAGraft(){

        int sizeOfGraft = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter faction name");
        String factionName = sc.next();
        Iterator<Map.Entry<Faction,List<Deputy>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Faction,List<Deputy>> entry = iterator.next();
            if (entry.getKey().getNameOfFaction().equals(factionName)){
                System.out.println("Enter deputy lastName");
                String lastName = sc.next();
                List<Deputy> deputyList = entry.getValue();
                for (Deputy deputy : deputyList) {
                    if (deputy.getLastName().equals(lastName)){
                        if (deputy.isGrafter()==false){
                            System.out.println("This deputy dont take a graft");
                        }
                        else {
                            System.out.println("How much money you want give ");
                            int money = sc.nextInt();
                            if (money > 5000){
                                System.out.println("Police take this deputy");
                            }
                            else {
                                sizeOfGraft+=money;
                                entry.getValue().iterator().next().setGraft(sizeOfGraft);
                            }
                        }
                }
                else {
                        System.out.println("No deputy");
                    }
                }
            }
        }
    }


        public void allDeputyInFaction(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name of faction");
            String factioName = sc.next();
            Iterator<Map.Entry<Faction,List<Deputy>>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<Faction,List<Deputy>> entry = iterator.next();
                if (entry.getKey().getNameOfFaction().equals(factioName)){
                    List<Deputy> deputyList = entry.getValue();
                    for (Deputy deputy : deputyList) {
                        System.out.println(deputy);
                    }
                }
            }
        }



    public void biggest(){
        Scanner sc = new Scanner(System.in);
        String faction = sc.next();
        System.out.println("Enter faction");
        boolean work = true;
        Iterator<Map.Entry<Faction,List<Deputy>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Faction,List<Deputy>> entry = iterator.next();
            if (entry.getKey().getNameOfFaction().equals(faction)){
               List<Deputy> deputyList = entry.getValue();
                int graft = 0;
                for (int i = 0; i < deputyList.size(); i++) {
                    if (deputyList.get(i).getGraft()>graft){
                       graft = deputyList.iterator().next().getGraft();
                        System.out.println(graft);
                    }
                }


            }
        }
    }





}
