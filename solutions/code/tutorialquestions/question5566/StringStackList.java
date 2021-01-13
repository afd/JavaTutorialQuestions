package tutorialquestions.question5566;

import java.util.ArrayList;
import java.util.List;

public class StringStackList implements StringStack {

  private final List<String> elements;

  public StringStackList() {
    elements = new ArrayList<>();
  }

  @Override
  public void push(String string) {
    elements.add(string);
  }

  @Override
  public String pop() {
    if (isEmpty()) {
      throw new StringStackUnsupportedPopException();
    }
    return elements.remove(elements.size() - 1);
  }

  @Override
  public boolean isEmpty() {
    return elements.isEmpty();
  }

}
