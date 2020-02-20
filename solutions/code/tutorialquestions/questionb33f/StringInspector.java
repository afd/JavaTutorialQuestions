package tutorialquestions.questionb33f;

import java.util.Optional;

@FunctionalInterface
public interface StringInspector {

  /**
   * An implementation of this method should decide whether there is anything interesting to say
   * about 'input'.  If there is not, it should return 'Optional.empty()'.  Otherwise it should
   * return a pair indicating, via a LogLevel, the severity of the information to be reported,
   * together with the information to be reported.
   * @param input A string to be inspected.
   * @return Optionally a (severity level, message) pair.
   */
  Optional<ImmutablePair<LogLevel, String>> inspect(String input);

}
