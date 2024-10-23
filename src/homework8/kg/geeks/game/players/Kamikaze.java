package homework8.kg.geeks.game.players;
/* Kamikadze  без урона, но хорошее здоровье, его способность  жертвовать собой. Но он должен попасть точно в цель,
 иначе нанесет урон только на 50% из своего остатка жизни.
 */
import homework8.kg.geeks.game.general.RPG_Game;

public class Kamikaze extends Hero {
    public Kamikaze(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.VICTIM);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int victim = RPG_Game.random.nextInt(2) + 1; // 1 или 2
        if (victim == 1){// если попал в цель
            this.setHealth(0);
            boss.setHealth(boss.getHealth() - this.getHealth()); // 100% от своего хп нанесет боссу
        }else{// если не попал
            this.setHealth(0);
            boss.setHealth(boss.getHealth() - this.getHealth()/2); // 50% от своего хп нанесет боссу
        }

    }
}
