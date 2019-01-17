package tutorialquestions.question1486;

public class Demo {

  public static void transferStacks(StringStack dst, StringStack src) {
    while (!src.isEmpty()) {
      dst.push(src.pop());
    }
  }

  public static void main(String[] args) {

    final StringStack first = new StringStackArray();

    final StringStack second = new StringStackList();

    first.push("The");
    first.push("quick");
    first.push("brown");
    first.push("fox");
    first.push("jumped");
    first.push("over");
    first.push("the");
    first.push("lazy");
    first.push("dog");

    transferStacks(second, first);

    assert first.isEmpty();

    while (!second.isEmpty()) {
      System.out.println(second.pop());
    }

  }

}
