package tutorialquestions.question8a61;

import java.util.HashSet;
import java.util.Set;

public class SpeedEfficientIntSet implements IntSet {

  private Set<Integer> elements;

  public SpeedEfficientIntSet() {
    elements = new HashSet<Integer>();
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

}
