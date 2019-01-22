package tutorialquestions.question1aeb;

public interface NumberAdder<T extends Number> {

  T zero();

  T add(T first, T second);

}
