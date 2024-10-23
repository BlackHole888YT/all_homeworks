package homework8.kg.geeks.game.players;

import homework8.kg.geeks.game.general.RPG_Game;
// Hacker, который будет через раунд забирать у Босса N-ое количество здоровья и переводить его одному из героев.
public class Hacker extends Hero {
    public Hacker(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.STEAL_AND_HEAL);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int heal = (RPG_Game.random.nextInt(8) + 3) * 2; // 6, 8, 10, 12, 14, 16, 18, 20 хп
        int randomHero = RPG_Game.random.nextInt(heroes.length);
// если остаток от деления раунда на 2 не равен нулю, т.е. четное число т.е. через 1 раунд - 0, 2, 4, 6, 8 и т.д. раунды
        if (RPG_Game.roundNumber % 2 != 0){
            boss.setHealth(boss.getHealth() - heal);
            Hero hero = heroes[randomHero];
            hero.setHealth(hero.getHealth() + heal);
            System.out.println("Hacker забрал " + heal + " здоровья у босса и передал его герою " + hero.getName());
        }
    }
}
