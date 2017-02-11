import java.util.Random;

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
        if(isReady()) {
            try {
                System.out.println("Fighting...");
                Thread.sleep(2000);
                // Obiekt Fight ---> Character winner = new Fight().fight(fighter1, fighter2); [winner.getName() win!]
                Random r = new Random();
                if (r.nextInt(3) <= 1) {
                    System.out.println(position1.getName() + " win!");
                    position1.wins++;
                    position2.loses++;
                } else {
                    System.out.println(position2.getName() + " win!");
                    position2.wins++;
                    position1.loses++;
                }
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Failed to fight.");
            }
        } else {
            System.out.println("We cant start fight without champions!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
