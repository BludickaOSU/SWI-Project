public class Character {
    private String name;
    private int level;
    private int health;
    private Weapon weapon;
    private Armor armor;

    public Character(String name, int level, int health, Weapon weapon, Armor armor) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.weapon = weapon;
        this.armor = armor;
    }

    public int actualDamage(int actualDamage)
    {
        return weapon.getDamage()-armor.getArmor();
    }

    public int getAttacked(Character character){
        return health - character.actualDamage();
    }






    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                ", weapon=" + weapon +
                ", armor=" + armor +
                '}';
    }
}
