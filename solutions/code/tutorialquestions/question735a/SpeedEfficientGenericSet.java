package tutorialquestions.question735a;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SpeedEfficientGenericSet<E> implements GenericSet<E> {

  private Set<E> elements;

  public SpeedEfficientGenericSet() {
    elements = new HashSet<E>();
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

  @Override
  public GenericIterator<E> iterator() {
    return new MemoryEfficientGenericSetIterator();
  }

  private class MemoryEfficientGenericSetIterator implements GenericIterator<E> {

    private Iterator<E> iterator;

    private MemoryEfficientGenericSetIterator() {
      iterator = elements.iterator();
    }

    @Override
    public boolean hasNext() {
      return iterator.hasNext();
    }

    @Override
    public E next() {
      return iterator.next();
    }


  }

}
