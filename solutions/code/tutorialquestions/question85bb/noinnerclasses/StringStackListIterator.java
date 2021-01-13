package tutorialquestions.question85bb.noinnerclasses;

import java.util.ListIterator;

class StringStackListIterator implements StringStackIterator {

  private final ListIterator<String> iterator;

  StringStackListIterator(ListIterator<String> iterator) {
    this.iterator = iterator;
  }

  @Override
  public boolean hasNext() {
    return iterator.hasPrevious();
  }

  @Override
  public String next() {
    if (hasNext()) {
      return iterator.previous();
    }
    return null;
  }

}
