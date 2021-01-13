package tutorialquestions.question7ec8;

public class Fighter {

  private final String name;

  private final String type;

  private final int skill;

  private int stamina;

  private final GameEngine theGameEngine;

  private static final int DAMAGE_VALUE = 2;

  /**
   * Construct a figher, given a name, type, attributes and reference to the game engine.
   */
  public Fighter(String name, String type, int skill, int stamina, GameEngine theGameEngine) {

    this.name = name;
    this.type = type;
    this.skill = skill;
    this.stamina = stamina;
    this.theGameEngine = theGameEngine;

  }

  public void takeDamage(int damage) {
    stamina = Math.max(stamina - damage, 0);
  }

  public int calculateDamage() {
    return DAMAGE_VALUE;
  }

  public int calculateAttackScore() {
    return skill + theGameEngine.rollDice() + theGameEngine.rollDice();
  }

  public String getName() {
    return name;
  }

  public String toString() {
    return name + " - " + type + " - skill: " + skill + "; stamina: " + stamina;
  }

  public boolean isDead() {
    return stamina == 0;
  }

}
