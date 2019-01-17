package tutorialquestions.question8f65;

public class Main {

  public static void main(String[] args) {

    GameEngine gameEngine = new GameEngine();

    Fighter humanWarrior = new Fighter("Joe", "Human Warrior", 16, 12, gameEngine);

    Fighter elfLord = new LuckyFighter("Alex", "Elf Lord", 18, 6, 11, Strategy.Defensive,
        gameEngine);

    gameEngine.simulateBattle(humanWarrior, elfLord);

  }

}
