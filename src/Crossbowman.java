//Арбалетчик
public class Crossbowman extends Unit {
    int accuracy;

    public Crossbowman(String name, int health, int team, int walkingRange, String weapon, int accuracy) {
        super(name, health, team, walkingRange, weapon);
        this.accuracy = accuracy;
    }
}