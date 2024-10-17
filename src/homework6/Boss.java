package homework6;

public class Boss extends GameEntity {
    private Weapon bossWeapon;

    public Boss(int health, int damage, Weapon bossWeapon) {
        super(health, damage);
        this.bossWeapon = bossWeapon;
    }

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    public String printInfo() {
        return "Health: " + getHealth() + "\nDamage: " + getDamage() +
                "\nWeapon: " + bossWeapon.getName() + " (" + bossWeapon.getType() + ")";
    }
}
