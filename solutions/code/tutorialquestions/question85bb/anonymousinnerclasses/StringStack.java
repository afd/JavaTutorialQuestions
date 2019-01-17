package tutorialquestions.question85bb.anonymousinnerclasses;

public interface StringStack {

  void push(String string);

  String pop();

  boolean isEmpty();

  StringStackIterator iterator();

}
