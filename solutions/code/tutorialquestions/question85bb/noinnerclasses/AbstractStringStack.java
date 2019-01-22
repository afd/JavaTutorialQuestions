package tutorialquestions.question85bb.noinnerclasses;

public abstract class AbstractStringStack implements StringStack {

  @Override
  public String toString() {
    String result = "[";
    for (StringStackIterator it = iterator(); it.hasNext(); ) {
      result += it.next();
      if (it.hasNext()) {
        result += ", ";
      }
    }
    result += "]";
    return result;
  }

}
