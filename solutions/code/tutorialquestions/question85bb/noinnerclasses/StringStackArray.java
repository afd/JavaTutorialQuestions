package tutorialquestions.question85bb.noinnerclasses;

public class StringStackArray extends AbstractStringStack {

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
    }
  }

  @Override
  public String pop() {
    if (stackPointer > 0) {
      stackPointer--;
      return elements[stackPointer];
    }
    return null;
  }

  public boolean isEmpty() {
    return stackPointer == 0;
  }

  @Override
  public StringStackIterator iterator() {
    return new StringStackArrayIterator(elements, stackPointer);
  }

}
