package tutorialquestions.question17b1.afterdefault;

public class A implements I {
  @Override
  public int foo() {
    return 0;
  }

  @Override
  public int foo(int x) {
    return 0;
  }

  @Override
  public int bar(int x) {
    return 0;
  }

  public int foobar() {
    return 42;
  }

  // This method had to be renamed to avoid a clash with I.foobar, which had the same name
  // and parameter types but a different return type.
  public void foobarOriginal(int x) {
    System.out.println(x);
  }

}
