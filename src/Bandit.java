//Разбойник
public class Bandit extends Unit {
    int dexterity;


    public Bandit(String name, int x, int y) {
        super(name, x, y);
        this.health = 90;
        this.maxHealth = 90;
        this.team = team;
        this.attackRange = 1;
        this.attack = 15;
        this.level = 1;
        this.weapon = weapon;
        this.walkingRange = 3;
        position = new Position(x, y);

        @Override
        public void step () {

        }

    }
}


