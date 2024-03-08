package units;
//Ведьмаг
import java.util.ArrayList;

public class Wizard extends Unit {
    int mana;
    boolean flag;
    String magic;

    public Wizard(String name, int x, int y) {
        super(name, 150, "Magic", 30, 2, 10, 50, 40, new Position(x, y));
        mana = 40;
        magic = "wizardDust";
        flag = false;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if ((health <= 0) || (mana == 0)) return;
        Unit target = super.nearestEnemy(enemy);
        if (target == null) return;
        target.getDamage(this.damage);
        mana -= 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", \u058D : " + mana;
    }

    public String getInfo() {
        return "Ведьмаг";
    }

}