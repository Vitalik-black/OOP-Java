//Копьеносец

public class Spearman extends Unit {
    int protection;

    public Spearman(String name, int health, int team, int walkingRange, String weapon, int protection) {
        super(name, health, team, walkingRange, weapon);
        this.protection = protection;


    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if (health<=0) return;
        Unit target = super.nearestEnemy(enemy);
        if (position.distance(target.position) < 2){
            target.getHit(this.powerHit);
            return;
        }
        Position diff = position.getDifference(target.position);
        if (Math.abs(diff.x) > Math.abs(diff.y)){
            this.position.x += diff.x < 0? 1: -1;
        } else {
            this.position.y += diff.y < 0? 1: -1;
        }


    }

    public String getInfo(){
        return "Копьеносец";
    };
}
}
