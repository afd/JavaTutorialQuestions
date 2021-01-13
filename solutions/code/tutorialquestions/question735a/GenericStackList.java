package tutorialquestions.question735a;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class GenericStackList<E> implements GenericStack<E> {

  private final List<E> elements;

  public GenericStackList() {
    elements = new ArrayList<>();
  }

  public void push(E item) {
    elements.add(item);
  }

  public E pop() {
    if (elements.size() > 0) {
      return elements.remove(elements.size() - 1);
    }
    return null;
  }

  public boolean isEmpty() {
    return elements.isEmpty();
  }

  @Override
  public GenericIterator<E> iterator() {
    return new GenericStackListIterator();
  }

  private class GenericStackListIterator implements GenericIterator<E> {

    private final ListIterator<E> iterator;

    private GenericStackListIterator() {
      iterator = elements.listIterator(elements.size());
    }

    @Override
    public boolean hasNext() {
      return iterator.hasPrevious();
    }

    @Override
    public E next() {
      if (hasNext()) {
        return iterator.previous();
      }
      return null;
    }

  }

}
