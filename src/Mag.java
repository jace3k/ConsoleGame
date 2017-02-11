/**
 * Created by Jacek on 11.02.2017.
 */
public class Mag extends Character {
    public Mag() {
        name = "Mag";
        hp = 100;
        setWeapon(new Fist());
        dmg = weapon.getDmg()+10;
    }


}
