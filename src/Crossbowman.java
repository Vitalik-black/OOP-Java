//Арбалетчик
public class Crossbowman extends Unit {
    int accuracy;

    public Crossbowman(String name, int health, int maxHealth, int team, int attackRange, int attack, int level, String weapon, int walkingRange, int x, int y, int accuracy) {
        super(name, 100, 100, team, 7, 10, 1, weapon, 3, x, y);
        this.accuracy = accuracy;
    }
}