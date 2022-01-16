package tutorialquestions.question4c70;

import java.util.Random;

public class Lottery {

  private static final int numNumbers = 7;

  private static final int lotteryMax = 49;

  private static boolean numberAlreadyChosen(int[] numbers,
      int numChosenSoFar, int candidate) {
    
    assert numChosenSoFar < numbers.length;

    for (int i = 0; i < numChosenSoFar; i++) {

      if (numbers[i] == candidate) {

        return true;

      }

    }

    return false;

  }

  /**
   * Example main method for lottery question.
   */
  public static void main(String[] args) {

    int[] numbers = new int[numNumbers];

    Random generator = new Random();

    int nextNumber = 0;

    while (nextNumber < numNumbers) {

      int candidateNumber = generator.nextInt(lotteryMax) + 1;

      if (numberAlreadyChosen(numbers, nextNumber, candidateNumber)) {
        continue;
      }

      numbers[nextNumber] = candidateNumber;
      nextNumber++;

      if (nextNumber < numNumbers) {
        System.out.print("Number " + nextNumber);
      } else {
        System.out.print("Bonus Number");
      }
      System.out.println(": " + candidateNumber);

    }

  }

}
