/**
 * Created by Jacek on 11.02.2017.
 */
public class Fist implements Weapons {

    @Override
    public void attack() {
        System.out.println("Fist: 1 dmg.");
    }

    @Override
    public int getDmg() {
        return 1;
    }
}
