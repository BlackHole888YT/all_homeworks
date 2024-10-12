package homework5.main;

import homework5.parameters.Boss;
import homework5.parameters.Hero;

public class Main {
    public static void main(String[] args) {
        Boss newBoss = new Boss();
        newBoss.setDamage(75);
        newBoss.setHealth(800);
        newBoss.setDefenceType("Magic");
        System.out.println("-----Boss-----" + "\n" + newBoss.getDefenceType() + " defence" +   "\n" + newBoss.getHealth() + " HP" + "\n" + newBoss.getDamage() + " DM");
        System.out.println("----Heroes----");
        for (Hero hero: createHeroes()){
            System.out.println("HP: " + hero.getHealth() + "\tDM: " + hero.getDamage() + "\tAbility: " + hero.getSuperAbility());
        }
    }

     public static Hero[] createHeroes(){
        Hero newHeroAlex = new Hero(370, 25);
        Hero newHeroFredrin = new Hero(500, 70, "Meteor");
        Hero newHeroAlexey = new Hero(430, 58, "Invisibility");

        Hero[] heroList = {newHeroFredrin, newHeroAlexey, newHeroAlex};
        return heroList;
     }
}
