package tutorialquestions.questiona6e7.anonymousinnerclasses;

import java.util.HashSet;
import java.util.Iterator;
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

    return new IntSetIterator() {

      private final Iterator<Integer> iterator = elements.iterator();

      @Override
      public boolean hasNext() {
        return iterator.hasNext();
      }

      @Override
      public int next() {
        return iterator.next();
      }

    };

  }


}
