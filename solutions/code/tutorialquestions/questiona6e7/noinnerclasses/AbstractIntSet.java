package tutorialquestions.questiona6e7.noinnerclasses;

public abstract class AbstractIntSet implements IntSet {

  @Override
  public void addAll(IntSet other) {

    for (IntSetIterator it = other.iterator(); it.hasNext(); ) {
      add(it.next());
    }

  }

  @Override
  public void removeAll(IntSet other) {

    for (IntSetIterator it = other.iterator(); it.hasNext(); ) {
      remove(it.next());
    }

  }

  @Override
  public boolean contains(IntSet other) {

    for (IntSetIterator it = other.iterator(); it.hasNext(); ) {
      if (!contains(it.next())) {
        return false;
      }
    }

    return true;

  }

  @Override
  public String toString() {
    final StringBuilder result = new StringBuilder("[");

    for (IntSetIterator it = iterator(); it.hasNext(); ) {
      result.append(it.next());
      if (it.hasNext()) {
        result.append(", ");
      }
    }

    return result + "]";
  }

}
