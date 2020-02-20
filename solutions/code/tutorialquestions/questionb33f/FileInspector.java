package tutorialquestions.questionb33f;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInspector {

  private final Logger logger;

  public FileInspector(Logger logger) {
    this.logger = logger;
  }

  public void inspectFile(String filename, StringInspector stringInspector) throws IOException {
    final BufferedReader br = new BufferedReader(new FileReader(filename));
    String line;
    while ((line = br.readLine()) != null) {
      // In the case that the line turns out to be interesting, ask the logger to log the message
      // reported by the string inspector, at the logging level it advises.
      stringInspector.inspect(line)
              .ifPresent(item -> logger.log(item.getFirst(), item.getSecond()));
    }
  }
}
