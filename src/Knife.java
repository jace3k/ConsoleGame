import java.io.Serializable;

/**
 * Created by Jacek on 11.02.2017.
 */
public class Knife implements Weapons, Serializable {
    @Override
    public void attack() {
        System.out.println("Knife: 5 dmg.");
    }

    @Override
    public int getDmg() {
        return 5;
    }
}
