import java.util.Random;

/**
 * Created by Jacek on 11.02.2017.
 */
public class FightMenu implements MenuInterface {
    private Character fighter1;
    private Character fighter2;

    public FightMenu(Character position1, Character position2) {
        fighter1 = position1;
        fighter2 = position2;
    }

    @Override
    public MenuInterface showMenu() {
        System.out.println("Fighting...");
        try {
            Thread.sleep(2000);
            // Obiekt Fight ---> Character winner = new Fight().fight(fighter1, fighter2); [winner.getName() win!]
            Random r = new Random();
            if(r.nextInt(1) == 0 ) {
                System.out.println(fighter1.getName() + " win!");
            } else {
                System.out.println(fighter2.getName() + " win!");
            }
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Failed to wait.");
        }




        return new ArenaMenu();
    }
}
