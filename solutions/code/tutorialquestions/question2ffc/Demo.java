package tutorialquestions.question2ffc;

public class Demo {

  public static <E> void transferStacks(GenericStack<E> dest, GenericStack<E> src) {
    while (!src.isEmpty()) {
      dest.push(src.pop());
    }
  }

  public static void main(String[] args) {

    final GenericStack<String> first = new GenericStackArray<>();

    final GenericStack<String> second = new GenericStackList<>();

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
