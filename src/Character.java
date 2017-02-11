import java.io.Serializable;

/**
 * Created by Jacek on 11.02.2017.
 */
public abstract class Character implements Serializable {
    protected Weapons weapon;
    protected int hp;
    protected int dmg;
    protected String name;
    protected int wins;
    protected int loses;
    public Character() {
        wins = 0;
        loses = 0;
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
