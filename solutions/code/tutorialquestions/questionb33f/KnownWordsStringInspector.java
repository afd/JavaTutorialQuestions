package tutorialquestions.questionb33f;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class KnownWordsStringInspector implements StringInspector {

  private final Set<String> errorWords;

  private final Set<String> verboseWords;

  public KnownWordsStringInspector(Set<String> errorWords, Set<String> verboseWords) {
    this.errorWords = errorWords;
    this.verboseWords = verboseWords;
  }

  @Override
  public Optional<ImmutablePair<LogLevel, String>> inspect(String input) {
    final List<String> observedErrorWords = new ArrayList<>();
    final List<String> observedVerboseWords = new ArrayList<>();
    for (String component : input.split(" ")) {
      if (errorWords.contains(component)) {
        observedErrorWords.add(component);
      } else if (verboseWords.contains(component)) {
        observedVerboseWords.add(component);
      }
    }
    if (observedErrorWords.isEmpty() && observedVerboseWords.isEmpty()) {
      return Optional.empty();
    }

    final StringBuilder message = new StringBuilder();
    if (!observedErrorWords.isEmpty()) {
      message.append("Observed the following error words: ");
      message.append(observedErrorWords);
      message.append("\n");
    }
    if (!observedVerboseWords.isEmpty()) {
      message.append("Observed the following words of note: ");
      message.append(observedVerboseWords);
      message.append("\n");
    }
    return Optional.of(new ImmutablePair<>(
            !observedErrorWords.isEmpty() ? LogLevel.ERROR : LogLevel.VERBOSE,
            message.toString()
    ));
  }

}
