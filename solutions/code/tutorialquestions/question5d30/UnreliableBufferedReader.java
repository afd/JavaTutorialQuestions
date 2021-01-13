package tutorialquestions.question5d30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class UnreliableBufferedReader extends BufferedReader {

  private final double probabilityOfError;

  private final Random generator;

  /**
   * Makes an unreliable reader from the given input stream reader with given probability of error.
   */
  public UnreliableBufferedReader(InputStreamReader inputStreamReader, double probabilityOfError) {
    super(inputStreamReader);
    this.probabilityOfError = (probabilityOfError < 0 ? 0
        : (probabilityOfError > 1 ? 1 : probabilityOfError));
    generator = new Random();
  }

  @Override
  public String readLine() throws IOException {

    String result = super.readLine();

    if (generator.nextDouble() < probabilityOfError) {
      throw new IOException("Error occurred on input stream");
    }

    return result;

  }

}
