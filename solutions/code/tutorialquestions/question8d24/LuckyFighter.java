package tutorialquestions.question8d24;

public class LuckyFighter {

  private final String name;

  private final String type;

  private final int skill;

  private int stamina;

  private final int initialStamina;

  private int luck;

  private final Strategy strategy;

  private final GameEngine theGameEngine;

  /**
   * Create a LuckyFighter, given a name, type, attributes, and references to a strategy and game
   * engine.
   */
  public LuckyFighter(String name, String type, int skill, int stamina, int luck, Strategy strategy,
      GameEngine theGameEngine) {

    this.name = name;
    this.type = type;
    this.skill = skill;
    this.stamina = stamina;
    this.initialStamina = stamina;
    this.luck = luck;
    this.strategy = strategy;
    this.theGameEngine = theGameEngine;

  }

  /**
   * Deal with taking of damage by a character.
   */
  public void takeDamage(int damage) {

    final int aggressiveReistanceThreshold = 2;
    final int averageResistanceThreshold = initialStamina / 2;

    if (luck > 0) {
      if    ((strategy == Strategy.AVERAGE && stamina <= averageResistanceThreshold)
          || (strategy == Strategy.AGGRESSIVE && stamina <= aggressiveReistanceThreshold)
          || (strategy == Strategy.DEFENSIVE)) {

        theGameEngine.log(name + " tries to resist the damage...");

        if (testLuck()) {
          theGameEngine.log("The damage is partially resisted!");
          damage--;
        } else {
          theGameEngine.log("Oh no, the damage is even worse!");
          damage++;
        }
      }
    }

    stamina = Math.max(stamina - damage, 0);
  }

  /**
   * Work out the damage to be inflicted.
   */
  public int calculateDamage() {

    final int damageValue = 2;
    final int aggressiveMultiplier = 2;
    final int missPenalty = 1;

    if (strategy == Strategy.AGGRESSIVE && luck > 0) {

      theGameEngine.log(name + " goes for an aggressive hit...");

      if (testLuck()) {
        theGameEngine.log("The hit is aggressive!");
        return damageValue * aggressiveMultiplier;
      } else {
        theGameEngine.log("The hit flounders.");
        return damageValue - missPenalty;
      }
    }

    return damageValue;
  }

  private boolean testLuck() {

    theGameEngine.log(name + " tests luck...");

    if (luck == 0) {
      theGameEngine.log(name + " is out of luck!");
      return false;
    }
    boolean result = theGameEngine.rollDice() + theGameEngine.rollDice() <= luck;
    luck--;

    theGameEngine.log(name + " is " + (result ? "lucky" : "unlucky") + "!");

    return result;
  }

  public int calculateAttackScore() {
    return skill + theGameEngine.rollDice() + theGameEngine.rollDice();
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return name + " - " + strategy + " " + type + " - skill: "
        + skill + "; stamina: " + stamina + "; luck: " + luck;
  }

  public boolean isDead() {
    return stamina == 0;
  }

}
