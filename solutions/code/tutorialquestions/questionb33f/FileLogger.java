package tutorialquestions.questionb33f;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {

  private final BufferedWriter writer;

  public FileLogger(String logfileName) throws IOException {
    this.writer = new BufferedWriter(new FileWriter(logfileName));
  }

  @Override
  public void log(LogLevel logLevel, String message) {
    try {
      switch (logLevel) {
        case WARNING:
        case ERROR:
        case FATAL:
          writer.write(logLevel.toString());
          break;
        default:
          return;
      }
      writer.write(": " + message + "\n");
    } catch (IOException exception) {
      // Ignore the exception.
    }
  }

  public void close() throws IOException {
    writer.close();
  }

}
