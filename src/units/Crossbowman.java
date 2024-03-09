package units;
import java.util.ArrayList;
// Арбалетчик.
public class Crossbowman extends Unit {
    int countArrow;
    public Crossbowman(String name, int x, int y) {
        super(name, 150, "crossbow", 20, 4, 15, 50, 40, new Position(x,y));
        countArrow = 10;
    }
    @Override
    public String toString() {
        return super.toString() + ", \u27b6 : " + countArrow;
    }
    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if ((health<=0) || (countArrow == 0)) return;
        Unit target = super.nearestEnemy(enemy);
        if (target == null) return;
        target.getDamage(this.damage);

        for (Unit unit : friend) {
            if (unit.getInfo().equals("Фермер") && !((Peasant)unit).flag) {
                ((Peasant)unit).flag = true;
                return;
            }
        }
        countArrow--;
    }
    public int getCountArrow() {
        return countArrow;
    }
    public String getInfo(){
        return "Арбалетчик";
    };
}