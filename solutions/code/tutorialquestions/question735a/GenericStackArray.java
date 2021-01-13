package tutorialquestions.question735a;


public class GenericStackArray<E> implements GenericStack<E> {

  private static final int STACK_LIMIT = 100;

  private final E[] elements;
  private int stackPointer;

  @SuppressWarnings("unchecked")
  public GenericStackArray() {
    elements = (E[]) (new Object[STACK_LIMIT]);
    stackPointer = 0;
  }

  public void push(E item) {
    if (stackPointer < STACK_LIMIT) {
      elements[stackPointer] = item;
      stackPointer++;
    }
  }

  public E pop() {
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
  public GenericIterator<E> iterator() {
    return new GenericStackArrayIterator();
  }

  private class GenericStackArrayIterator implements GenericIterator<E> {

    private int current;

    private GenericStackArrayIterator() {
      current = stackPointer - 1;
    }

    @Override
    public boolean hasNext() {
      return current >= 0;
    }

    @Override
    public E next() {
      if (hasNext()) {
        E result = elements[current];
        current--;
        return result;
      }
      return null;
    }

  }

}
