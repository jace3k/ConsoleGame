/**
 * Created by Jacek on 11.02.2017.
 */
public class Character {
    protected Weapons weapon;
    protected int hp;
    protected int dmg;
    protected String name;
    public Character() {
    }


    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.attack();
    }

    public void attackChamp(Character c) {

    }

    public String getName() {
        return name;
    }
}
