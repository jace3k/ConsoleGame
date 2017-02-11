import java.io.IOException;
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

        menu = new MainMenu();
        try {
            characters = (ArrayList<Character>) SerializationUtil.deserialize("characters.xd");
        } catch (IOException | ClassNotFoundException e) {
            characters = new ArrayList<>();
        }
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
        for (Character c : characters) out.println(" [" + i++ + "] " + c.getName() + " [ WINS: " + c.wins + ", LOSES: " + c.loses + " ]");
        out.println("***********************");
    }

    public Arena getArena() {
        return arena;
    }

    public static void main(String[] args) {
        ourInstance.startGame();
    }
}
