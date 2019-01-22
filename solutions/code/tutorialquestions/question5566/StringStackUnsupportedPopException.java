package tutorialquestions.question5566;

@SuppressWarnings("serial")
public class StringStackUnsupportedPopException extends UnsupportedOperationException {

  @Override
  public String toString() {
    return "Attempt to pop element from empty stack failed; stack was not modified";
  }
}
