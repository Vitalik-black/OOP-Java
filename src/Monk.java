//Монах
public class Monk extends Unit {
    int treatment;

    public Monk(String name, int health, int team, int walkingRange, int treatment) {
        super(name, health, team, walkingRange);
        this.treatment = treatment;
    }

}