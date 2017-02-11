/**
 * Created by Jacek on 11.02.2017.
 */
public class AK47 implements Weapons {
    @Override
    public void attack() {
        System.out.println("AK47: 10 dmg.");
    }

    @Override
    public int getDmg() {
        return 10;
    }
}
