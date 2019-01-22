package tutorialquestions.question8a61;

import java.util.ArrayList;
import java.util.List;

public class MemoryEfficientIntSet implements IntSet {

  private List<Integer> elements;

  public MemoryEfficientIntSet() {
    elements = new ArrayList<Integer>();
  }

  @Override
  public void add(int item) {
    if (elements.contains(item)) {
      return;
    }
    elements.add(item);
  }

  @Override
  public boolean contains(int item) {
    return elements.contains(item);
  }

  @Override
  public boolean isEmpty() {
    return elements.isEmpty();
  }

  @Override
  public boolean remove(int item) {
    // Note that
    //    elements.remove(item);
    // would mean something different!
    return elements.remove(new Integer(item));
  }

}
