//Монах
public class Monk extends Unit {
    int treatment;

    public Monk(String name, int health, int team, int walkingRange, String weapon, int treatment) {
        super(name, health = 100, team = 1, walkingRange = 2, weapon = 3);
        this.treatment = treatment;
        @Override
        public void step () {

        }
    }
}