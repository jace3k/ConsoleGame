/**
 * Created by Jacek on 11.02.2017.
 */
public class Warrior extends Character {
    public Warrior() {
        name = "Warrior";
        hp = 150;
        setWeapon(new Fist());
        dmg = weapon.getDmg()+5;
    }
}
