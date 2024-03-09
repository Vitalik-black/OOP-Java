package units;
import java.util.ArrayList;
import java.util.List;
public abstract class Unit implements Step{
    String name;
    int health;
    String weapon;
    int damage;
    int priority;
    int armor;
    int atackRange;
    int hidding;
    int maxHealth;
    int x;
    int y;
    String className;
    public Position position;
    ArrayList deadList;
    public Unit(String name, int health, String weapon, int damage, int priority, int armor, int atackRange, int hidding, Position position){
        this.className = this.getClass().getSimpleName();
        this.name = name;
        this.maxHealth = this.health = health;
        this.weapon = weapon;
        this.damage = damage;
        this.priority = priority;
        this.armor = armor;
        this.atackRange = atackRange;
        this.hidding = hidding;
        this.position = position;
    }
    // Метод вывода информации о персонаже
    @Override
    public String toString() {
        return  name + ", \u2665 : " + health + ", ⚔ : " + damage + ", \uD83D\uDEE1\uFE0F : " + armor;
    }
    // Метод вывода короткой информации о персонаже
    public void printShort() {
        System.out.println(className + ", Name: " + name +", P: " + position.getX() + "," + position.getY() + ".");
    }
    // Метод нанесения урона
    public void getDamage(float damage) {
        health -= damage;
        if (health < 0) health = 0;
        if (health > maxHealth) health = maxHealth;
    }
    // Метод лечения
    public void Heall(Monk monk, Unit unit1) {
        unit1.health = unit1.health + monk.healing;
    }

    public Unit nearestEnemy(List<Unit> targets) {
        if (targets.isEmpty()) {
            return null; // Handle empty list case
        }
        Unit nearest = null;
        double minDistance = Double.MAX_VALUE;

        for (Unit hero : targets) {
            double distance = position.distance(hero.position);
            if (distance < minDistance && hero.health > 0) {
                minDistance = distance;
                nearest = hero;
            }
        }
        return nearest;
    }

    public int getPriority() {
        return priority;
    }
    public int getHp(){
        return health;
    }

    public String getInfo(){
        return " ";
    }
}