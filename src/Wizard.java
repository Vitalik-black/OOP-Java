//колдун
public class Wizard extends Unit {
int mana;

    public Wizard(String name, int health, int team, int walkingRange, String weapon, int mana) {
        super(name, health, team, walkingRange, weapon);
        this.mana = mana;
    }
}