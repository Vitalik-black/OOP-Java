package units;
import java.util.ArrayList;
import java.util.Comparator;

public class Monk extends Unit {
    int healing;
    int mana;
    boolean flag;

    public Monk(String name, int x, int y) {
        super(name, 150, "null", 0, 4, 10, 50, 40, new Position(x, y));
        healing = 0;
        mana = 20;
        flag = false;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if (getHp() <= 0) return;
        ArrayList<Unit> sortlist = new ArrayList<>(friend);
        ArrayList<Unit> deadlist = new ArrayList<>();
        sortlist.sort(Comparator.comparingInt(Unit::getHp));
        int countdaed = 0;
        for (Unit unit : sortlist) {
            if (unit.getHp() == 0) {
                deadlist.add(unit);
                countdaed++;
            }
        }
        if (deadlist.size() > 3) {
            flag = true;
            // System.out.println("Флаг установлен");
        }
        if (flag && mana == 10) {
            deadlist.sort((o1, o2) -> o2.health - o1.health);
            deadlist.getFirst().health = maxHealth;
            mana = 0;
            System.out.println(name + " Воскресил: "   + deadlist.getFirst().toString());
            flag = false;
            return;
        }
        if (flag) {
            mana++;
            return;
        }
        if (mana < 2) {
            mana++;
            return;
        }
        sortlist.getFirst().health += 10;
        mana -= 2;
    }

    public String getInfo() {
        return "Монах";
    }
    @Override
    public String toString() {
        return super.toString() + ", ➰ : " + mana;
    }
}