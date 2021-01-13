package tutorialquestions.question5566;

public class StringStackArray implements StringStack {

  private static final int STACK_LIMIT = 100;

  private final String[] elements;
  private int stackPointer;

  public StringStackArray() {
    elements = new String[STACK_LIMIT];
    stackPointer = 0;
  }

  @Override
  public void push(String string) {
    if (stackPointer < STACK_LIMIT) {
      elements[stackPointer] = string;
      stackPointer++;
    } else {
      throw new StringStackFailedPushError(STACK_LIMIT);
    }
  }

  @Override
  public String pop() {
    if (isEmpty()) {
      throw new StringStackUnsupportedPopException();
    }
    stackPointer--;
    return elements[stackPointer];
  }

  @Override
  public boolean isEmpty() {
    return stackPointer == 0;
  }

}
