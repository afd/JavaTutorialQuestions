package tutorialquestions.question17b1.afterdefault;

public class B implements I, J {
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

  // This method had to be provided to avoid ambiguity between which of I.foobar and J.foobar
  // would be called if foobar were invoked on an instance of B.  This implementation chooses
  // the version of foobar from I.
  @Override
  public int foobar(int x) {
    return I.super.foobar(x);
  }
}
