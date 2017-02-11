import static java.lang.System.out;

/**
 * Created by Jacek on 11.02.2017.
 */
public class MainMenu implements MenuInterface {
    @Override
    public MenuInterface showMenu() {
        out.println("<<<<<Welcome!>>>>>");
        out.println("\n[1] Arena ");
        out.println("[2] New Champion ");
        out.print(">> ");
        switch(scanner.nextLine()) {
            case "1": return new ArenaMenu();
            case "2": return new NewChampionMenu();
            default: return new MainMenu();
        }
    }
}
