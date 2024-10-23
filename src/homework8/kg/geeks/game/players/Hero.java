package homework8.kg.geeks.game.players;

public abstract class Hero extends GameEntity implements HavingSuperAbility {
    private SuperAbility ability;

    public Hero(String name, int health, int damage, SuperAbility ability) {
        super(name, health, damage);
        this.ability = ability;
    }

    public SuperAbility getAbility() {
        return ability;
    }

    public void attack(Boss boss) {

        if (this.ability == SuperAbility.DRACULA){
            this.setHealth((int) (this.getHealth() + this.getDamage() * 0.35));
            boss.setHealth(boss.getHealth() - this.getDamage());
        }
        boss.setHealth(boss.getHealth() - this.getDamage());
    }
}
