package units;

import java.util.ArrayList;

public class Bandit extends Unit {
    int theft;
    public Bandit(String name, int x, int y) {
        super(name, 150, "blade", 30, 6, 15, 50, 80, new Position(x, y));
        theft = 15;
    }
    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if (health <= 0) return;

        Unit target = super.nearestEnemy(enemy);
        if (position.distance(target.position) < 2) {
            target.getDamage(this.damage);
            return;
        }
        Position diff = position.getDifference(target.position);
        Position newposition = new Position(position.x, position.y);
        if (Math.abs(diff.x) > Math.abs(diff.y))
            newposition.x += diff.x < 0 ? 1 : -1;
        else
            newposition.y += diff.y < 0 ? 1 : -1;
        for (Unit unit : friend) {
            if (unit.position.equals(newposition) && unit.health > 0) return;
        }
        this.position = newposition;
    }
    public String getInfo() {
        return "Разбойник";
    }
}