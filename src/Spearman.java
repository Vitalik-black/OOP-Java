//Копьеносец

public class Spearman extends Unit {
    int protection;

    public Spearman(String name, int health, int team, int walkingRange, String weapon, int protection) {
        super(name, health, team, walkingRange, weapon);
        this.protection = protection;
/*
        @Override
        public void step () {

        }*/
    }

    @Override
    public void step() {

    }
}
