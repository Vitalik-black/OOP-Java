
public class Unit {
    private String name;
    private int health;
    private int maxHealth;
    private int team;
    private String weapon;
    // private Coordinates coordinates;
    private int walkingRange;

    public Unit(String name, int health, int team, int walkingRange, String weapon) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.team = team;
        //  this.coordinates = coordinates;
        this.walkingRange = walkingRange;
        this.weapon = weapon;
    }

/*    public String getTeam() {
        return team;
    }
*/

}

