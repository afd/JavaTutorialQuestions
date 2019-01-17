package tutorialquestions.question5d30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnreliableBufferedReaderTest {

  private static final int MAX_LINES = 5;

  /**
   * Unreliable buffered reader example.
   */
  public static void main(String[] args) {

    BufferedReader unreliableReader = new UnreliableBufferedReader(new InputStreamReader(System.in),
        0.2);

    int linesSuccessfullyRead = 0;

    int linesAttemptedToBeRead = 0;

    while (linesSuccessfullyRead < MAX_LINES) {

      if (linesSuccessfullyRead < MAX_LINES) {
        System.out.println("Attempting to read input from unreliable reader...");
        linesAttemptedToBeRead++;
        try {
          System.out.println("Successfully read input: " + unreliableReader.readLine());
          linesSuccessfullyRead++;
        } catch (IOException exception) {
          System.out.println("Failed!");
        }
      }

    }

    System.out.println("Took " + linesAttemptedToBeRead + " attempts to read " + MAX_LINES
        + " lines from unreliable reader");

    try {
      unreliableReader.close();
    } catch (IOException exception) {
      System.out.println("Error closing unreliable reader.");
    }

  }

}
