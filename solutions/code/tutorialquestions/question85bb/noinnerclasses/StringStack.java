package tutorialquestions.question85bb.noinnerclasses;

public interface StringStack {

  void push(String string);

  String pop();

  boolean isEmpty();

  StringStackIterator iterator();

}
