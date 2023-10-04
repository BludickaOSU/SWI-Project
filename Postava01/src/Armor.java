public class Armor {
    private int armor;
    private int durability;

    public Armor(int armor, int durability) {
        this.armor = armor;
        this.durability = durability;
    }

    public int getArmor() {
        return armor;
    }

    public int getDurability() {
        return durability;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "armor=" + armor +
                ", durability=" + durability +
                '}';
    }
}
