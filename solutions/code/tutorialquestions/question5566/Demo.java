package tutorialquestions.question5566;

public class Demo {

  public static void transferStacks(StringStack dst, StringStack src) {
    while (!src.isEmpty()) {
      dst.push(src.pop());
    }
  }

  public static void main(String[] args) {

    StringStack first = new StringStackArray();

    StringStack second = new StringStackList();

    first.push("The");
    first.pop();

    try {
      first.pop();
    } catch (StringStackUnsupportedPopException exception) {
      System.out.println(exception);
    }

    for (int i = 0; i < 110; i++) {
      try {
        first.push("ArrayStringStackElement" + 1);
        second.push("ListStringStackElement" + 1);
      } catch (StringStackFailedPushError exception) {
        System.out.println(exception);
      }
    }

  }

}
