package parlament;

import java.util.List;

/**
 * Created by Home on 01.07.2017.
 */
public class Deputy extends Human {

    private String lastName;
    private int age;
    private boolean grafter;
    private int graft;
    private List<Deputy> deputies;

    public Deputy() {
        super();
    }


    public Deputy(String lastName, int age, boolean grafter, int graft) {
        super();
        this.lastName = lastName;
        this.age = age;
        this.grafter = grafter;
        this.graft = graft;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGrafter() {
        return grafter;
    }

    public void setGrafter(boolean grafter) {
        this.grafter = grafter;
    }

    public int getGraft() {
        return graft;
    }

    public void setGraft(int graft) {
        this.graft = graft;
    }


    @Override
    public String toString() {
        return "Deputy{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", grafter=" + grafter +
                ", graft=" + graft +
                '}';
    }

//    public void giveAGraft(){
//
//        if (grafter==false){
//            System.out.println("Цей депутат не бере хабяра");
//        }else {
//            if (graft>=500){
//                System.out.println("Поліція увязнила цього депутата");
//            }
//        }
//
//    }




}
