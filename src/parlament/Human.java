package parlament;

/**
 * Created by Home on 01.07.2017.
 */
public class Human {

    private int height;
    private int weight;

    public Human() {
    }

    public Human(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}



//    public void deleteFactionFromParlament(){
//        Scanner sc = new Scanner(System.in);
//        boolean work = true;
//        System.out.println("Which faction you want to delete?");
//        String factionName = sc.next();
//        Iterator<Map.Entry<Faction,List<Deputy>>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<Faction,List<Deputy>> entry = iterator.next();
//            if (entry.getKey().getNameOfFaction().equals(factionName)){
//                iterator.remove();
//            }
//        }
//    }
//
//
//
//    public void showAllFactions(){
//        for (Faction factions : map.keySet()) {
//            System.out.println(factions);
//        }
//    }
//
//    public void showSomeFaction(){
//        Scanner sc = new Scanner(System.in);
//        boolean work = true;
//        String factionName = sc.next();
//        Iterator<Map.Entry<Faction,List<Deputy>>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<Faction, List<Deputy>> map = iterator.next();
//            if (map.getKey().getFaction().equals(factionName)){
//                System.out.println(map);
//            }
//        }
//    }
//
//    public void addDeputyIntoFaction(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the name of faction");
//        boolean work = true;
//        String factionName = sc.next();
//        Iterator<Map.Entry<Faction,List<Deputy>>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<Faction,List<Deputy>> map = iterator.next();
//            if (map.getKey().getFaction().equals(factionName)){
//                System.out.println("Enter lastName of deputy");
//                String lastName = sc.next();
//                System.out.println("Enter age of deputy");
//                int age = sc.nextInt();
//                System.out.println("Doesnt deputy is a grafter?");
//                boolean grafter = sc.nextBoolean();
//                System.out.println("How much you want give a graft to deputy?");
//                int graft = sc.nextInt();
//                map.getValue().add(new Deputy(lastName,age,grafter,graft));
//                work=false;
//            }
//        }
//    }
//
//
//    public void removeDeputyFromFaction(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the name of faction");
//        boolean work = true;
//        String factionName = sc.next();
//        Iterator<Map.Entry<Faction,List<Deputy>>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<Faction,List<Deputy>> map = iterator.next();
//            if (map.getKey().getFaction().equals(factionName)){
//                System.out.println("Enter name of deputy");
//                String lastName = sc.next();
//                List<Deputy> deputies = map.getValue();
//                Iterator<Deputy> iterator2 = deputies.iterator();
//                while (iterator2.hasNext()){
//                    Deputy deputy = iterator2.next();
//                    if (deputy.getLastName().equals(lastName)){
//                        iterator2.remove();
//                    }
//                }
//
//            }
//        }
//
//    }
//
//    public void showAllGraftersInFactions(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the name of faction to see all grafters");
//        boolean work = true;
//        String factionName = sc.next();
//        Iterator<Map.Entry<Faction,List<Deputy>>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<Faction,List<Deputy>> entry = iterator.next();
//            if (entry.getKey().getFaction().equals(factionName)){
//                List<Deputy> deputies = entry.getValue();
//                Iterator<Deputy> deputyIterator = deputies.iterator();
//                while (deputyIterator.hasNext()){
//                    Deputy deputy = deputyIterator.next();
//                    if (deputy.isGrafter()==true){
//                        System.out.println(deputy.getLastName() + " Bye-Bye");
//                    }
//                }
//            }
//        }
//    }
//
//    public void showMaxBriberInFaction(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the name of faction");
//        boolean work = true;
//        String factionName = sc.next();
//        Iterator<Map.Entry<Faction,List<Deputy>>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<Faction,List<Deputy>> entry = iterator.next();
//            if (entry.getKey().getFaction().equals(factionName)){
//                int maxGraft = 0;
//                List<Deputy> deputies = entry.getValue();
//                Iterator<Deputy> deputyIterator = deputies.iterator();
//                while (deputyIterator.hasNext()){
//                    Deputy deputy1 = deputyIterator.next();
//                    if (deputy1.getGraft()> maxGraft){
//
//                    }
//                }
//            }
//        }
//
//    }