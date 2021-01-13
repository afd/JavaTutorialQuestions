package tutorialquestions.questiona6e7.noinnerclasses;

import java.util.Iterator;

// Note package level visibility
class MemoryEfficientIntSetIterator implements IntSetIterator {

  private final Iterator<Integer> iterator;

  MemoryEfficientIntSetIterator(Iterator<Integer> iterator) {
    this.iterator = iterator;
  }

  @Override
  public boolean hasNext() {
    return iterator.hasNext();
  }

  @Override
  public int next() {
    return iterator.next();
  }

}
