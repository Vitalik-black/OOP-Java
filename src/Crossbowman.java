import java.util.List;

//Арбалетчик

public class Crossbowman extends Unit implements Step {
    private int accuracy;
    private int arrows;

    public Crossbowman(String name, int x, int y, int team) {
        super(name, 100, 100, team, 7, 10, 1, "оружие", 3, x, y, 3);
        this.accuracy = 7;
        this.arrows = 7;
    }
    public int getArrows() {
        return arrows;
    }
    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    @Override
    public void step(List<Unit> targets) {
        if (isAlive() && arrows > 0) {
            Unit nearestTarget = findNearestTarget(targets);
            if (nearestTarget != null) {
                System.out.println(name + " выстрелил стрелой в " + nearestTarget.getName());
                attack(nearestTarget);
                arrows--;
            }
        } else if (arrows == 0) {
            System.out.println(name + " закончились стрелы!");
        }
    }
}
