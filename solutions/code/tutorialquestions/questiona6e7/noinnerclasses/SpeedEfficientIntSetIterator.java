package tutorialquestions.questiona6e7.noinnerclasses;

import java.util.Iterator;

// Note package level visibility
class SpeedEfficientIntSetIterator implements IntSetIterator {

  final Iterator<Integer> iterator;

  SpeedEfficientIntSetIterator(Iterator<Integer> iterator) {
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
