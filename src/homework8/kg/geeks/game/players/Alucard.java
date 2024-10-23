package homework8.kg.geeks.game.players;
/* Мой личный герой. Отсылка на моего мейна. Играю за него 4 года и занял топ страны (Кыргызстан) 4 раза.
 Не могу не добавить его.
 Описание: Alucard: каждый его удар лечит его на 35% от урона, способностью с 10% шансом он может восстановить себе 50% от
  текущего хп т.е. было 100 стало 100 + 50 = 150
 Т.к. он рыцарь света, то имеет не меньше 293 хп, не меньше 43 урона, всегда носит имя "Alucard" и его способность - "Drakula".
 Если босс блокирует его способность, то Alucard получает + 10 урона до конца игры.
 */
import homework8.kg.geeks.game.general.RPG_Game;

public class Alucard extends Hero {
    public Alucard(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.DRACULA);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (RPG_Game.random.nextInt(100) < 10){
            this.setHealth(this.getHealth() + this.getHealth() / 2);
            System.out.println("Alucard health + 50% !");
        }

    }
}
