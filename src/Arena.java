/**
 * Created by Jacek on 11.02.2017.
 */
public class Arena {
    private Character position1;
    private Character position2;
    private boolean isPos1Set = false;
    private boolean isPos2Set = false;

    public boolean isReady() {
        if(isPos1Set && isPos2Set) return true;
        else return false;
    }

    public void setPosition1(Character position1) {
        this.position1 = position1;
        isPos1Set = true;
    }

    public void setPosition2(Character position2) {
        this.position2 = position2;
        isPos2Set = true;
    }

    public Character getPosition1() {
        if(position1!=null)return position1;
        else return new NoCharacter();
    }

    public Character getPosition2() {
        if(position2!=null) return position2;
        else return new NoCharacter();
    }

    public void fight() {

    }

}
