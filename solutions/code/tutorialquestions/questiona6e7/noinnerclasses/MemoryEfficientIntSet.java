package tutorialquestions.questiona6e7.noinnerclasses;

import java.util.ArrayList;
import java.util.List;

public class MemoryEfficientIntSet extends AbstractIntSet {

  private final List<Integer> elements;

  public MemoryEfficientIntSet() {
    elements = new ArrayList<>();
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
    return elements.remove(Integer.valueOf(item));
  }

  @Override
  public IntSetIterator iterator() {
    return new MemoryEfficientIntSetIterator(elements.iterator());
  }

}
