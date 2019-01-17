package tutorialquestions.questiona6e7.innerclasses;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SpeedEfficientIntSet extends AbstractIntSet {

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

  @Override
  public IntSetIterator iterator() {
    return new SpeedEfficientIntSetIterator();
  }

  private class SpeedEfficientIntSetIterator implements IntSetIterator {

    private Iterator<Integer> iterator;

    private SpeedEfficientIntSetIterator() {
      iterator = elements.iterator();
    }

    @Override
    public boolean hasNext() {
      return iterator.hasNext();
    }

    @Override
    public int next() {
      return iterator.next();
    }

  }


}
