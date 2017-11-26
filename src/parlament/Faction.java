package parlament;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Home on 01.07.2017.
 */
public class Faction {

    private List<Faction> faction = new ArrayList<>();
    private String nameOfFaction;


    public Faction() {

    }

    public Faction(String nameOfFaction) {
        this.nameOfFaction = nameOfFaction;
    }

    public List<Faction> getFaction() {
        return faction;
    }

    public void setFaction(List<Faction> faction) {
        this.faction = faction;
    }

    public String getNameOfFaction() {
        return nameOfFaction;
    }

    public void setNameOfFaction(String nameOfFaction) {
        this.nameOfFaction = nameOfFaction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Faction faction1 = (Faction) o;

        if (faction != null ? !faction.equals(faction1.faction) : faction1.faction != null) return false;
        return nameOfFaction != null ? nameOfFaction.equals(faction1.nameOfFaction) : faction1.nameOfFaction == null;
    }

    @Override
    public int hashCode() {
        int result = faction != null ? faction.hashCode() : 0;
        result = 31 * result + (nameOfFaction != null ? nameOfFaction.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Faction{" +
                "faction=" + faction +
                ", nameOfFaction='" + nameOfFaction + '\'' +
                '}';
    }
}
