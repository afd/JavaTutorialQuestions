package tutorialquestions.question85bb.anonymousinnerclasses;

public class Demo {

  public static void transferStacks(StringStack dest, StringStack src) {
    while (!src.isEmpty()) {
      dest.push(src.pop());
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

    System.out.println("First stack is: " + first);
    System.out.println("Second stack is: " + second);

    transferStacks(second, first);

    assert first.isEmpty();

    System.out.println("First stack is: " + first);
    System.out.println("Second stack is: " + second);

  }

}
