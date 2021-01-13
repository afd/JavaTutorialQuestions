package tutorialquestions.question014e;

import java.util.Random;

public class RandomIntegers {

  /**
   * Main method for random integers example.
   */
  public static void main(String[] args) {

    assert args.length == 1;

    int maxNumber = Integer.parseInt(args[0]);

    boolean[] found = new boolean[maxNumber];

    for (int i = 0; i < maxNumber; i++) {
      found[i] = false;
    }

    Random generator = new Random();

    int numbersFound = 0;

    int numbersGenerated = 0;

    System.out.println("Generating random numbers:");

    while (numbersFound < maxNumber) {

      int num = generator.nextInt(maxNumber);

      if (numbersGenerated > 0) {
        System.out.print(", ");
      }

      numbersGenerated++;

      System.out.print(num);

      if (!found[num]) {
        found[num] = true;
        numbersFound++;
      }
    }

    System.out.println();
    System.out.println("I had to generate " + numbersGenerated
        + " random numbers between 0 and " + (maxNumber - 1)
        + " to have produced all such numbers at least once.");

  }

}
