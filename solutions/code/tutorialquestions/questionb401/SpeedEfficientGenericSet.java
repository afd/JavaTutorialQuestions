package tutorialquestions.questionb401;

import java.util.HashSet;
import java.util.Set;

public class SpeedEfficientGenericSet<E> implements GenericSet<E> {

  private final Set<E> elements;

  public SpeedEfficientGenericSet() {
    elements = new HashSet<>();
  }

  @Override
  public void add(E item) {
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
