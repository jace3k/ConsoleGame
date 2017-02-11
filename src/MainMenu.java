import java.io.IOException;

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
        out.println("[3] Save Champions ");
        out.println("[4] Exit ");
        out.print(">> ");
        switch(scanner.nextLine()) {
            case "1": return new ArenaMenu();
            case "2": return new NewChampionMenu();
            case "3":
                try {
                    SerializationUtil.serialize(Game.getInstance().characters,"characters.xd") ;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return new MainMenu();
            case "4": System.exit(0);
            default: return new MainMenu();
        }
    }
}
