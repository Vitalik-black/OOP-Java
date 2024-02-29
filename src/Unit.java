import java.util.List;

public abstract class Unit {

    String name;
    private int health;
    private int maxHealth;
    private int team;
   private int attackRange;
   private int attack;
    private int level;
    private String weapon;
    Position position;
    private int walkingRange;

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
        double minDistanse = Double.MAX_VALUE;
        for (Unit target : targets) {
            double distance = this.position.getDistance(target.position);
            if (distance < minDistanse) {
                minDistanse = distance;
                nearestTarget = target;
            }
        }
        return nearestTarget;
    }}
