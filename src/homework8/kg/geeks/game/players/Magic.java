package homework8.kg.geeks.game.players;

import homework8.kg.geeks.game.general.RPG_Game;

public class Magic extends Hero  {
    public Magic(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int boostDM = RPG_Game.random.nextInt(4) + 1;
        if (RPG_Game.roundNumber <= 4) { // если номер раунда меньше или равен 4, то применять способность
            for (Hero hero : heroes) {
                hero.setDamage(hero.getDamage() + boostDM);
            }
            System.out.println("Magic " + this.getName() + " boosting damage on " + boostDM + " to all heroes");
        }
    }
}
