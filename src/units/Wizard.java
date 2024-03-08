package units;
import java.util.ArrayList;
public class Wizard extends Unit {
    int mana;
    String magic;
    public Wizard(String name, int x, int y) {
        super(name, 150, "magicStick", 20, 2, 10, 50, 40, new Position(x,y));
        mana = 200;
        magic = "wizardDust";
    }
    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
    }
    public String getInfo(){
        return "Волшебник";
    };
}