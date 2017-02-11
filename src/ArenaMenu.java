import static java.lang.System.out;

/**
 * Created by Jacek on 11.02.2017.
 */
public class ArenaMenu implements MenuInterface {
    @Override
    public MenuInterface showMenu() {
        String pos1 = Game.getInstance().getArena().getPosition1().getName();
        String pos2 = Game.getInstance().getArena().getPosition2().getName();
        out.println("<<<<<ARENA>>>>>");
        out.println("[ " + pos1 + " ] vs [ " + pos2 + " ]" );
        out.println("[1] Set Champion 1");
        out.println("[2] Set Champion 2");
        out.println("[3] Fight!");
        out.println("[4] Back");
        out.print(">> ");
        String readInfo = scanner.nextLine();
        switch(readInfo) {
            case "1": return new SetChampion(1);
            case "2": return new SetChampion(2);
            case "3": return new FightMenu(Game.getInstance().getArena().getPosition1(),Game.getInstance().getArena().getPosition2());
            case "4": return new MainMenu();
            default: return new ArenaMenu();
        }
    }
}
