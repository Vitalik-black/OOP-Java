import java.util.List;

public abstract class Unit implements Step {

    String name;
    protected int health;
    protected int maxHealth;
    protected int team;
    protected int attackRange;
    protected int attack;
    protected int level;
    protected String weapon;
    Position position;
    protected int walkingRange;

    public Unit(String name, int health, int maxHealth, int team, int attackRange, int attack, int level, String weapon, int walkingRange, int x, int y) {

        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.team = team;
        this.attackRange = attackRange;
        this.attack = attack;
        this.level = level;
        this.weapon = weapon;
        this.walkingRange = walkingRange;
        position = new Position(x, y);
    }

    public Unit findNearestTarget(List<Unit> targets) {
        if (targets == null || targets.isEmpty()) {
            throw new IllegalArgumentException("Противников нет!");
        }

        Unit nearestTarget = null;
        double minDistance = Double.MAX_VALUE;

        for (Unit target : targets) {
            if (!target.isAlive()) {
                continue; // Пропуск цели, если мертва
            }

            double distance = this.position.getDistance(target.position);

            if (distance < minDistance && distance <= this.attackRange) {
                minDistance = distance;
                nearestTarget = target;
            }
        }

        return nearestTarget;
    }

    public boolean isAlive() {
        return health > 0;
    }
    public void setTeam(int team) {
        this.team = team;
    }
}