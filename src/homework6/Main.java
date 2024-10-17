package homework6;

public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon();
        bossWeapon.setType(WeaponType.SWORD);
        bossWeapon.setName("Boss Sword");

        Weapon skeletonWeapon = new Weapon();
        skeletonWeapon.setType(WeaponType.BOW);
        skeletonWeapon.setName("Boss Bow");

        Boss boss = new Boss(1500, 90, bossWeapon);
        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton(800, 70, skeletonWeapon, 30);
        Skeleton skeleton2 = new Skeleton(750, 85, skeletonWeapon, 26);

        System.out.println("\nSkeleton 1: " + skeleton1.printInfo());
        System.out.println("\nSkeleton 2: " + skeleton2.printInfo());
    }
}
