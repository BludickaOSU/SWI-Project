public class Main {
    public static void main(String[] args) {

        Weapon weapon1 = new Weapon(25,20);
        Armor armor1 = new Armor(10,20);
        Character archer = new Character("YamatoCannon",99,250,weapon1,armor1);

        Weapon weapon2 = new Weapon(15,20);
        Armor armor2 = new Armor(20,20);
        Character warrior = new Character("XiaoWeiXiao",99,300,weapon2,armor2);

        System.out.println(archer.getAttacked(warrior));
        System.out.println(warrior);

    }
}