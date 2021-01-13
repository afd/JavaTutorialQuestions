package tutorialquestions.question85bb.noinnerclasses;

public abstract class AbstractStringStack implements StringStack {

  @Override
  public String toString() {
    final StringBuilder result = new StringBuilder("[");
    for (StringStackIterator it = iterator(); it.hasNext(); ) {
      result.append(it.next());
      if (it.hasNext()) {
        result.append(", ");
      }
    }
    result.append("]");
    return result.toString();
  }

}
