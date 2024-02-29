//Снайпер
public class Snaiper  extends Unit {
    private int damage;
    int accuracy;

    public Snaiper(int x, int y, String name,  int team, int walkingRange, String weapon, int damage, int accuracy) {
        super(x, y, name,  team, walkingRange, weapon);
        this.damage = damage;
        this.accuracy = accuracy;
    }
}