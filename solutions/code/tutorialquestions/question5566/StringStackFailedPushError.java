package tutorialquestions.question5566;

@SuppressWarnings("serial")
public class StringStackFailedPushError extends Error {

  private final int maxStackSize;

  public StringStackFailedPushError(int maxStackSize) {
    this.maxStackSize = maxStackSize;
  }

  @Override
  public String toString() {
    return "Push attempt failed: stack limit of " + maxStackSize + " elements has been reached";
  }

}
