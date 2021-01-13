package tutorialquestions.questionb33f;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class FileLogger implements Logger {

  private final BufferedWriter writer;

  public FileLogger(String logfileName) throws IOException {
    this.writer = new BufferedWriter(new FileWriter(logfileName));
  }

  @Override
  public void log(LogLevel logLevel, String message) {
    if (Set.of(LogLevel.INFO, LogLevel.VERBOSE).contains(logLevel)) {
      return;
    }
    try {
      writer.write(logLevel.toString() + ": " + message + "\n");
    } catch (IOException exception) {
      // Ignore the exception.
    }
  }

  public void close() throws IOException {
    writer.close();
  }

}
