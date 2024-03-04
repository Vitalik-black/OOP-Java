//Снайпер
public class Snaiper extends Unit {
    private int damage;
    int accuracy;
    private int arrows;

    public Snaiper(String name, int x, int y) {
        super(x, y, name, team, walkingRange, weapon);
        this.damage = damage;
        this.accuracy = accuracy;
        this.arrows = 6;

        public int getArrows () {
            return arrows;
        }
        public void setArrows ( int arrows){
            this.arrows = arrows;
        }

        @Override
        public void step (List < Unit > targets) {
            if (isAlive() && arrows > 0) {
                Unit nearestTarget = findNearestTarget(targets);
                if (nearestTarget != null) {
                    System.out.println(name + " выстрелил стрелой в " + nearestTarget.getName());
                    attack(nearestTarget);
                    arrows--;
                }
            } else if (arrows == 0) {
                System.out.println(name + " закончились стрелы!");
            }
        }
    }