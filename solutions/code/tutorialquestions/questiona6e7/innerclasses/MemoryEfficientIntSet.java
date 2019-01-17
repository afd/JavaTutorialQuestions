package tutorialquestions.questiona6e7.innerclasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemoryEfficientIntSet extends AbstractIntSet {

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
    //    elements.remove(x);
    // would mean something different!
    return elements.remove(new Integer(item));
  }

  @Override
  public IntSetIterator iterator() {
    return new MemoryEfficientIntSetIterator();
  }

  private class MemoryEfficientIntSetIterator implements IntSetIterator {

    private Iterator<Integer> iterator;

    private MemoryEfficientIntSetIterator() {
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
