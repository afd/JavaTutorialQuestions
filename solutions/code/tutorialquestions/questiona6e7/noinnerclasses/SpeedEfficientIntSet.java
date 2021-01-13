package tutorialquestions.questiona6e7.noinnerclasses;

import java.util.HashSet;
import java.util.Set;

public class SpeedEfficientIntSet extends AbstractIntSet {

  private final Set<Integer> elements;

  public SpeedEfficientIntSet() {
    elements = new HashSet<>();
  }

  @Override
  public void add(int item) {
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
    return elements.remove(item);
  }

  @Override
  public IntSetIterator iterator() {
    return new SpeedEfficientIntSetIterator(elements.iterator());
  }

}
