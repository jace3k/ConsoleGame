import java.util.ArrayList;
import static java.lang.System.out;

/**
 * Created by Jacek on 11.02.2017.
 */
public class Game {
    private MenuInterface menu;
    private Arena arena;
    public ArrayList<Character> characters;
    private static Game ourInstance = new Game();

    private Game() {
        arena = new Arena();
        characters = new ArrayList<>();
        menu = new MainMenu();
    }

    public static Game getInstance() {
        return ourInstance;
    }

    public static void clean() {
        for(int i=0;i<200;i++) {
            out.println();
        }
    }

    private void startGame() {
        while (true) {
            Game.clean();
            showChampions();
            menu = menu.showMenu();
        }
    }

    public void showChampions() {
        int i = 1;
        out.println("***********************");
        if (characters.isEmpty()) out.println("No champions.");
        for (Character c : characters) out.println(" [" + i++ + "] " + c.getName());
        out.println("***********************");
    }

    public Arena getArena() {
        return arena;
    }

    public static void main(String[] args) {
        ourInstance.startGame();
    }
}
