
//Арбалетчик

public class Crossbowman extends Unit implements Step {
    private int accuracy;
    private int arrows;

    public Crossbowman(String name, int x, int y, int team) {
        super(name, 100, 100, team, 3, 10, 1, 1, "оружие", 3, x, y);
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
    public void step() {
        if (isAlive() && arrows > 0) {
            List<Unit> enemyUnits = getEnemyUnits(); // Получить список юнитов противоположной команды
            Unit nearestTarget = findNearestTarget(enemyUnits); // Найти ближайшую цель из противоположной команды
            if (nearestTarget != null) {
                System.out.printf("%s выстрелил стрелой в %s%n", name, nearestTarget.getName());
                attack(nearestTarget);
                arrows--;
            } else {
                System.out.println("Нет доступных вражеских целей.");
            }
        } else if (arrows == 0) {
            System.out.println(name + " закончились стрелы!");
        }
    }

}
