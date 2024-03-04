
public class Bandit extends Unit {
//Разбойник

    int dexterity;

    public Bandit(String name, int x, int y, int team) {
        super(name, 90, 90, team, 2, 1,15, 1,"weapon", 3, x, y);
        this.dexterity = 0;
    }

    @Override
    public void step() {

    }
}


