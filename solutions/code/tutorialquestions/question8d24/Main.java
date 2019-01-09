package tutorialquestions.question8d24;

public class Main {

  public static void main(String[] args) {

    GameEngine gameEngine = new GameEngine();

    LuckyFighter humanWarrior = new LuckyFighter("Joe", "Human Warrior", 16, 12, 12,
        Strategy.AGGRESSIVE, gameEngine);

    LuckyFighter elfLord = new LuckyFighter("Alex", "Elf Lord", 18, 6, 11, Strategy.DEFENSIVE,
        gameEngine);

    gameEngine.simulateBattle(humanWarrior, elfLord);

  }

}
