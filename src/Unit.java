
/*
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

    protected int priority;

    public Unit(String name, int health, int maxHealth, int team,int priority, int attackRange, int attack, int level, String weapon, int walkingRange, int x, int y) {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        this.team = team;
        this.priority = priority;
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
    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return health > 0;
    }
    public boolean isSameTeam(Unit target) {
        return this.team == target.getTeam();
    }
    public void setTeam(int team) {
        this.team = team;
    }
    public void attack(Unit target) {
        if (!isSameTeam(target)) {
            if (target.isAlive()) {
                target.health -= this.attack;
                System.out.printf("%s атакует %s и наносит %d урона\n", this.name, target.name, this.attack);
                if (!target.isAlive()) {
                    System.out.printf("%s убит!\n", target.name);
                }
            } else {
                System.out.printf("%s уже мертв! Нельзя атаковать мертвого юнита.\n", target.name);
            }
        } else {
            System.out.printf("%s является членом твоей команды! Нельзя атаковать своих своей команды.\n", target.name);
        }
    }

    public int getTeam() {
        return team;
    }


    public int getPriority() {

        return priority;
    }
}
*/
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

protected int priority;

public Unit(String name, int health, int maxHealth, int team,int priority, int attackRange, int attack, int level, String weapon, int walkingRange, int x, int y) {
    this.name = name;
    this.health = health;
    this.maxHealth = maxHealth;
    this.team = team;
    this.priority = priority;
    this.attackRange = attackRange;
    this.attack = attack;
    this.level = level;
    this.weapon = weapon;
    this.walkingRange = walkingRange;
    position = new Position(x, y);
}

public void setName(String name) {
    this.name = name;
}

public boolean isAlive() {
    return health > 0;
}

public void setTeam(int team) {
    this.team = team;
}

public void attack(Unit target) {
    if (target.isAlive() && team != target.getTeam()) {
        target.health -= this.attack;
        System.out.printf("%s атакует %s и наносит %d урона\n", this.name, target.name, this.attack);
        if (!target.isAlive()) {
            System.out.printf("%s убит!\n", target.name);
        }
    } else if (!target.isAlive()) {
        System.out.printf("%s уже мертв! Нельзя атаковать мертвого юнита.\n", target.name);
    } else {
        System.out.printf("%s является членом твоей команды! Нельзя атаковать своих.\n", target.name);
    }
}
public void GetDamage (int damage) {
    this.health-=damage;
    if (health <0) health =0;
    if (health >= maxHealth) health = maxHealth;
    System.out.println(name + "Take damage \n");
}

public int getTeam() {
    return team;
}

public int getPriority() {
    return priority;
}

public abstract void step();
}
