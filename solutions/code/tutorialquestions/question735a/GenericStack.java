package tutorialquestions.question735a;

public interface GenericStack<E> extends GenericCollection<E> {

  void push(E item);

  E pop();

  boolean isEmpty();

}
