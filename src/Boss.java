public class Boss {
    private int health;
    private int damage;
    private String defense;

    public int getHealth () {return health; }
    public int getDamage () {return damage; }
    public String getDefense () {return defense; }

    String defenceTypes[] = {"Physical, Magical, Kinetic"};


    public void setHealth (int health){
        if (health == 0) {
            System.out.println("Health cannot be under 0!");
        }else  {
            this.health = health;
        }
    }
    public void setDamage (int damage){
        if (damage < 0) {
            System.out.println("THe Hero will not win! ");
        }else {
            this.damage = damage;
        }
    }
    public void setDefense(String defense) {
        this.defense = defense;
    }
}
