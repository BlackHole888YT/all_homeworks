package homework7;

public class Main {
    public static void main(String[] args){
        HavingSuperAbility[] superAbility = {new Medic(),new Magic(),new Warrior()};
        for (HavingSuperAbility superAbilityActivate: superAbility){
            System.out.println(superAbilityActivate.applySuperAbility());
            if (superAbilityActivate instanceof Magic) {
                Medic medic = new Medic();
                medic.increaseExperience();
            }
        }
    }
}
