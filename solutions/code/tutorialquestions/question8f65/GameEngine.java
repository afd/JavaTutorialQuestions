package tutorialquestions.question8f65;

import java.util.Random;

public class GameEngine {

  private final Random generator;

  public GameEngine() {
    generator = new Random();
  }

  public int rollDice() {
    return generator.nextInt(6) + 1;
  }

  public void log(String message) {

    System.out.println(message);

  }

  public void simulateBattle(Fighter first, Fighter second) {

    log("At start of battle, stats are:");
    log(first.toString());
    log(second.toString());
    log("------------------------------");

    while (true) {

      int firstAttackScore = first.calculateAttackScore();
      int secondAttackScore = second.calculateAttackScore();

      if (firstAttackScore == secondAttackScore) {

        log(first.getName() + " draws with " + second.getName());
        log("------------------------------");

      } else {

        Fighter winner;
        Fighter loser;

        if (firstAttackScore > secondAttackScore) {
          winner = first;
          loser = second;
        } else {
          winner = second;
          loser = first;
        }

        log(winner.getName() + " hits " + loser.getName() + ", stats are:");

        loser.takeDamage(winner.calculateDamage());

        log(first.toString());
        log(second.toString());
        log("------------------------------");

        if (loser.isDead()) {
          log("End of battle, " + winner + " wins!");
          return;
        }

      }

    }


  }

}
