package tutorialquestions.question8f65;

public class LuckyFighter extends Fighter {

  private final int initialStamina;

  private int luck;

  private final Strategy strategy;

  private final GameEngine theGameEngine;

  private static final int AGGRESSIVE_RESISTANCE_THRESHOLD = 2;
  private static final int AGGRESSIVE_MULTIPLIER = 2;
  private static final int MISS_PENALTY = 1;

  public LuckyFighter(String name, String type, int skill, int stamina, int luck, Strategy strategy,
      GameEngine theGameEngine) {

    super(name, type, skill, stamina, theGameEngine);

    this.initialStamina = stamina;
    this.luck = luck;
    this.strategy = strategy;
    this.theGameEngine = theGameEngine;

  }

  @Override
  public void takeDamage(int damage) {

    final int averageResistanceThreshold = initialStamina / 2;

    if (luck > 0) {
      if ((strategy == Strategy.Average && stamina <= averageResistanceThreshold)
          || (strategy == Strategy.Aggressive && stamina <= AGGRESSIVE_RESISTANCE_THRESHOLD)
          || (strategy == Strategy.Defensive)) {

        theGameEngine.log(getName() + " tries to resist the damage...");

        if (testLuck()) {
          theGameEngine.log("The damage is partially resisted!");
          damage--;
        } else {
          theGameEngine.log("Oh no, the damage is even worse!");
          damage++;
        }
      }
    }

    super.takeDamage(damage);

  }

  @Override
  public int calculateDamage() {

    if (strategy == Strategy.Aggressive && luck > 0) {

      theGameEngine.log(getName() + " goes for an aggressive hit...");

      if (testLuck()) {
        theGameEngine.log("The hit is aggressive!");
        return super.calculateDamage() * AGGRESSIVE_MULTIPLIER;
      } else {
        theGameEngine.log("The hit flounders.");
        return super.calculateDamage() - MISS_PENALTY;
      }
    }

    return super.calculateDamage();
  }

  private boolean testLuck() {

    theGameEngine.log(getName() + " tests luck...");

    if (luck == 0) {
      theGameEngine.log(getName() + " is out of luck!");
      return false;
    }
    boolean result = theGameEngine.rollDice() + theGameEngine.rollDice() <= luck;
    luck--;

    theGameEngine.log(getName() + " is " + (result ? "lucky" : "unlucky") + "!");

    return result;
  }

  @Override
  public String toString() {
    return name + " - " + strategy + " " + type + " - skill: "
        + skill + "; stamina: " + stamina + "; luck: " + luck;
  }

}
