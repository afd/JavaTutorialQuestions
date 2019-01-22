package tutorialquestions.question735a;

public interface GenericSet<E> extends GenericCollection<E> {

  void add(E item);

  boolean remove(E item);

  boolean isEmpty();

  boolean contains(E item);

}
