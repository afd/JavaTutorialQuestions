package tutorialquestions.question4c70;

import java.util.Random;

class LotteryLabelledContinue {

  private static final int numNumbers = 7;

  private static final int lotteryMax = 49;

  /**
   * This solution illustrates the use of a labelled `continue'.  This is
   * not commonly used in Java, and is considered bad practice by some,
   * but here it is!
   */
  public static void main(String[] args) {

    int[] numbers = new int[numNumbers];

    Random generator = new Random();

    int nextNumber = 0;

    chooseNumbers:
    while (nextNumber < numNumbers) {

      int candidateNumber = generator.nextInt(lotteryMax) + 1;

      for (int i = 0; i < nextNumber; i++) {

        if (numbers[i] == candidateNumber) {
          // The number we chose is no good: skip on to next outer loop iteration.
          continue chooseNumbers;
        }
      }

      numbers[nextNumber] = candidateNumber;
      nextNumber++;

      if (nextNumber < numNumbers) {
        System.out.print("Number " + nextNumber);
      } else {
        System.out.print("Bonus ball");
      }
      System.out.println(": " + candidateNumber);

    }

  }

}