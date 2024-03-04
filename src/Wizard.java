//колдун
public class Wizard extends Unit {
    int mana;

    public Wizard(String name, int x, int y) {
        super(name, x, y);
        this.mana = mana;
        this.health = 60;
        this.maxHealth = 60;
        this.team = team;
        this.attackRange = 7;
        this.attack = 10;
        this.level = 1;
        this.weapon = magik;
        this.walkingRange = 3;
        position = new Position(x, y);

        @Override
        public void step () {

        }
    }
}