import static java.lang.System.out;

/**
 * Created by Jacek on 11.02.2017.
 */
public class NewChampionMenu implements MenuInterface {
    @Override
    public MenuInterface showMenu() {
        out.println("<<<<<Create new champ!>>>>>");
        out.println("\n[1] Mag ");
        out.println("[2] Warrior ");
        out.println("[3] Tank ");
        out.print(">> ");
        switch(scanner.nextLine()) {
            case "1": Game.getInstance().characters.add(new Mag()); break;
            case "2": Game.getInstance().characters.add(new Warrior()); break;
            case "3": Game.getInstance().characters.add(new Tank()); break;
        }
        return new MainMenu();
    }
}
