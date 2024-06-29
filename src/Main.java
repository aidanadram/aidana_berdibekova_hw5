public class Main {
    public static void main(String[] args) {
        Hero myHero = new Hero(1200, 800, "Telepatic");
        System.out.println("Hero's health is " + myHero.health + "; hero's damage is "
                + myHero.damage + " ; hero's superpower is " + myHero.superpower);

        Hero anotherHero = new Hero(3200, 1700);
        System.out.println("Hero's health is " + anotherHero.health +
                " ; hero;s damage is " + anotherHero.damage);

        Boss boss = new Boss();
        boss.setHealth(5500);
        boss.setDamage(2100);
        boss.setDefense("Teleportation");


        System.out.println("Boss Information:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefense());


        Hero[] heroes = createHeroes();
        System.out.println("\nHeroes Info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() + ", Damage: " + hero.getDamage()
                    + ", Super Power: " + hero.getSuperpower() );
        }
    }


    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(200, 30, "Fireball");
        Hero hero2 = new Hero(150, 25);
        Hero hero3 = new Hero(180, 20, "Invisibility");

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}



