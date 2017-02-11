/**
 * Created by Jacek on 11.02.2017.
 */
public class SetChampion implements MenuInterface {
    private int champNo;

    public SetChampion(int i) {
        champNo = i;
    }

    @Override
    public MenuInterface showMenu() {
        System.out.print("Enter numer of champ above: ");
        String sc = scanner.nextLine();
        Character ch = new NoCharacter();
        int charactersSize = Game.getInstance().characters.size();
        if(Integer.parseInt(sc) <= charactersSize) ch = Game.getInstance().characters.get(Integer.parseInt(sc)-1);

        if(champNo==1) Game.getInstance().getArena().setPosition1(ch);
        if(champNo==2) Game.getInstance().getArena().setPosition2(ch);

        return new ArenaMenu();
    }
}
