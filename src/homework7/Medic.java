package homework7;

public class Medic extends Hero {

    private int healPoints;

    @Override
    public String applySuperAbility() {
        return "Magic применил способность Healing";
    }

    public int increaseExperience() {
        healPoints = healPoints + (int) (healPoints * 0.1);
        return healPoints;
    }
}
