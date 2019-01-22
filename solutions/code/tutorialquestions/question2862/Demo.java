package tutorialquestions.question2862;

public class Demo {

  public static void main(String[] args) {

    A myB = new B();

    try {
      ((B) myB).foo();
    } catch (MyExceptionD exception) {
      System.out.println("Exception of type MyExceptionD was thrown.");
    }

  }

}
