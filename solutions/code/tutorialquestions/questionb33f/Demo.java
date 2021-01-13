package tutorialquestions.questionb33f;

import java.io.IOException;
import java.util.Optional;
import java.util.Set;

public class Demo {

  private static final int MAX_LINE_SIZE = 100;

  public static void main(String[] args) throws IOException {

    if (args.length != 3) {
      System.err.println("Requires three file names: input file, output file 1, output file 2.");
    }

    final Logger stderrLogger = (logLevel, message) -> {
      switch (logLevel) {
        case FATAL, ERROR, WARNING -> System.err.print("*** IMPORTANT ***\n");
        default -> System.err.print("* NOTE *\n");
      }
      System.err.println(message);
    };

    final StringInspector lineTooLongInspector =
            (item -> item.length() > MAX_LINE_SIZE
                    ? Optional.of(new ImmutablePair<>(
                            LogLevel.ERROR, "Line too long: " + item))
                    : Optional.empty());

    final FileInspector inspector1 = new FileInspector(
            stderrLogger);

    FileLogger fileLogger1 = new FileLogger(args[1]);
    final FileInspector inspector2 = new FileInspector(fileLogger1);

    FileLogger fileLogger2 = new FileLogger(args[2]);
    final FileInspector inspector3 = new FileInspector(fileLogger2);

    final KnownWordsStringInspector knownWordsInspector = new KnownWordsStringInspector(
            Set.of("goto", "finalize", "static"),
            Set.of("continue", "break")
    );

    System.err.println("Starting inspection 1:");
    inspector1.inspectFile(args[0], lineTooLongInspector);
    System.err.println("\nStarting inspection 2:");
    inspector1.inspectFile(args[0], knownWordsInspector);
    System.err.println("\nStarting inspection 3 (see " + args[1] + " for details).");
    inspector2.inspectFile(args[0], lineTooLongInspector);
    System.err.println("\nStarting inspection 4 (see " + args[2] + " for details).");
    inspector3.inspectFile(args[0], knownWordsInspector);

    fileLogger1.close();
    fileLogger2.close();

  }

}
