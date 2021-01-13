package tutorialquestions.question735a;

import java.util.ArrayList;
import java.util.Iterator;
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

  @Override
  public GenericIterator<E> iterator() {
    return new MemoryEfficientGenericSetIterator();
  }

  private class MemoryEfficientGenericSetIterator implements GenericIterator<E> {

    private final Iterator<E> iterator;

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
