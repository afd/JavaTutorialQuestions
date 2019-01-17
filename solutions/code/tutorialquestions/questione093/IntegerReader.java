package tutorialquestions.questione093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerReader {

  public int readInteger(String message) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {

      System.out.print(message + " ");
      System.out.flush();

      String input = br.readLine();

      try {

        return Integer.parseInt(input);

      } catch (NumberFormatException exception) {

        System.out.println("Error: " + input + " is not an integer.");

      }

    }
  }


  public int readPositiveInteger(String message) throws IOException {

    for (;;) {

      int input = readInteger(message);

      if (input > 0) {
        return input;
      }

      System.out.println("Error: " + input + " is not a positive integer.");

    }


  }

}
