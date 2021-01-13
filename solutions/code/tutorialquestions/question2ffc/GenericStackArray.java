package tutorialquestions.question2ffc;

public class GenericStackArray<E> implements GenericStack<E> {

  private static final int STACK_LIMIT = 100;

  private final E[] elements;
  private int stackPointer;

  @SuppressWarnings("unchecked")
  public GenericStackArray() {
    elements = (E[]) (new Object[STACK_LIMIT]);
    stackPointer = 0;
  }

  @Override
  public void push(E item) {
    if (stackPointer < STACK_LIMIT) {
      elements[stackPointer] = item;
      stackPointer++;
    }
  }

  @Override
  public E pop() {
    if (stackPointer > 0) {
      stackPointer--;
      return elements[stackPointer];
    }
    return null;
  }

  @Override
  public boolean isEmpty() {
    return stackPointer == 0;
  }

}
