package tutorialquestions.questiona6e7.anonymousinnerclasses;

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
    String result = "[";

    for (IntSetIterator it = iterator(); it.hasNext(); ) {
      result += it.next();
      if (it.hasNext()) {
        result += ", ";
      }
    }

    return result + "]";
  }

}
