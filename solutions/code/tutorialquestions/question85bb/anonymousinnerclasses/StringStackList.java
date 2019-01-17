package tutorialquestions.question85bb.anonymousinnerclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StringStackList extends AbstractStringStack {

  private List<String> elements;

  public StringStackList() {
    elements = new ArrayList<String>();
  }

  @Override
  public void push(String string) {
    elements.add(string);
  }

  @Override
  public String pop() {
    if (elements.size() > 0) {
      return elements.remove(elements.size() - 1);
    }
    return null;
  }

  @Override
  public boolean isEmpty() {
    return elements.isEmpty();
  }

  @Override
  public StringStackIterator iterator() {

    return new StringStackIterator() {

      private ListIterator<String> iterator = elements.listIterator(elements.size());

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
    };

  }

}
