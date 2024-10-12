package homework5.parameters;

public class Boss {
    private int health = 1000;
    private int damage = 20;
    private String defenceType = "Magic";

    //---------------get-----------------------
    public int getHealth() {
        return this.health;
    }

    public int getDamage() {
        return this.damage;
    }

    public String getDefenceType() {
        return this.defenceType;
    }
    //---------------set-----------------------
    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefenceType(String defenceType) {
        this.defenceType = defenceType;
    }
}
