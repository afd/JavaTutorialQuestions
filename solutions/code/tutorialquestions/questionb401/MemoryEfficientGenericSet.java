package tutorialquestions.questionb401;

import java.util.ArrayList;
import java.util.List;

public class MemoryEfficientGenericSet<E> implements GenericSet<E> {

  private final List<E> elements;

  public MemoryEfficientGenericSet() {
    elements = new ArrayList<>();
  }

  @Override
  public void add(E item) {
    if (elements.contains(item)) {
      return;
    }
    elements.add(item);
  }

  @Override
  public boolean contains(E item) {
    return elements.contains(item);
  }

  @Override
  public boolean isEmpty() {
    return elements.isEmpty();
  }

  @Override
  public boolean remove(E item) {
    return elements.remove(item);
  }

}
