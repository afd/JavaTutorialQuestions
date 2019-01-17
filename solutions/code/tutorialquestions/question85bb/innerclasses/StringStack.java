package tutorialquestions.question85bb.innerclasses;

public interface StringStack {

  void push(String string);

  String pop();

  boolean isEmpty();

  StringStackIterator iterator();

}
