package homework6;

public class Skeleton extends Boss {
    private int arrowsCount;

    // Конструктор
    public Skeleton(int health, int damage, Weapon bossWeapon, int arrowsCount) {
        super(health, damage, bossWeapon);  // Вызов конструктора суперкласса
        this.arrowsCount = arrowsCount;
    }

    // Геттеры и сеттеры
    public int getArrowsCount() {
        return arrowsCount;
    }

    public void setArrowsCount(int arrowsCount) {
        this.arrowsCount = arrowsCount;
    }

    // Переопределение метода printInfo
    @Override
    public String printInfo() {
        return super.printInfo() + "\nArrows count: " + arrowsCount;
    }
}
