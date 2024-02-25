//Разбойник
public class Bandit extends Unit {
   int dexterity;

   public Bandit(String name, int health, int team, int walkingRange, String weapon, int dexterity) {
      super(name, health, team, walkingRange, weapon);
      this.dexterity = dexterity;
   }
}