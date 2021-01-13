package tutorialquestions.question85bb.noinnerclasses;

// Note that this class is only package visible
class StringStackArrayIterator implements StringStackIterator {

  private int current;

  private final String[] elements;

  StringStackArrayIterator(String[] elements, int stackPointer) {
    this.elements = elements;
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
