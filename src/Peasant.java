//Крестьянин
public class Peasant extends Unit {
int endurance;

    public Peasant(String name, int health, int team, int walkingRange, String weapon, int endurance) {
        super(name, health, team, walkingRange, weapon);
        this.endurance = endurance;
    }
}
