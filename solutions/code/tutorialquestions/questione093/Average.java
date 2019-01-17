package tutorialquestions.questione093;

import java.io.IOException;

public class Average {

  /**
   * Computes the average of a sequence of integers.
   */
  public static void main(String[] args) throws IOException {

    int input = new IntegerReader().readPositiveInteger("Please enter a positive integer:");

    int total = 0;

    for (int i = 0; i < input; i++) {

      total += new IntegerReader().readInteger("Please enter integer number " + (i + 1) + ":");

    }

    System.out.println("Average is " + ((double) total / (double) (input)));

  }


}
