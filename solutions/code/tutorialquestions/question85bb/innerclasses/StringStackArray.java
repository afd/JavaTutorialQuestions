package tutorialquestions.question85bb.innerclasses;

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
    return new StringStackArrayIterator();
  }

  private class StringStackArrayIterator implements StringStackIterator {

    private int current;

    private StringStackArrayIterator() {
      current = stackPointer - 1;
    }

    @Override
    public boolean hasNext() {
      return current >= 0;
    }

    @Override
    public String next() {
      if (hasNext()) {
        String result = elements[current];
        current--;
        return result;
      }
      return null;
    }

  }

}
