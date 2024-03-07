public class Snaiper extends Unit {

    // Снайпер
    private int damage;
    private int accuracy;
    private int arrows;

    public Snaiper(String name, int x, int y, int team, String дальнийСтрелы) {
        super(name, 100, 100, team, 10, 25, 11, 1,"лук", 10, x, y);
        this.damage = 25;
        this.accuracy = 90;
        this.arrows = 6;
        this.priority = 3;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public void step() {
        if (isAlive() && arrows > 0) {
            Unit nearestTarget = findNearestTarget(targets);
            if (nearestTarget != null && !isSameTeam(nearestTarget) && nearestTarget.isAlive()) {
                System.out.printf("%s выстрелил стрелой в %s", name, nearestTarget.getName());
                attack(nearestTarget);
                arrows--;
            }
        } else if (arrows == 0) {
            System.out.println(name + " закончились стрелы!");
        }
    }
}
