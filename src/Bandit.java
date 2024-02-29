//Разбойник
public class Bandit extends Unit {
   int dexterity;

   public Bandit(String name, int health, int maxHealth, int team, int attackRange, int attack, int level, String weapon, int walkingRange, int x, int y, int dexterity) {
      super(name, health, maxHealth, team, attackRange, attack, level, weapon, walkingRange, x, y);
      this.dexterity = dexterity;
   }
}

