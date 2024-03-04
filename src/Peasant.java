//Крестьянин
public class Peasant extends Unit {
    int endurance;

    public Peasant(String name, int x, int y) {

        super(name, x, y);
        this.mana = mana;
        this.health = 50;
        this.maxHealth = 50;
        this.team = team;
        this.attackRange = 1;
        this.attack = 4;
        this.level = 1;
        this.weapon = weapon;
        this.walkingRange = 3;
        position = new Position(x, y);

  /*      @Override
        public void step () {

        }*/

    }

    @Override
    public void step() {

    }
}

