/**
 * Created by Jacek on 11.02.2017.
 */
public class Tank extends Character {
    public Tank() {
        name = "Tank";
        hp = 200;
        setWeapon(new Fist());
        dmg = weapon.getDmg()+1;
    }
}
