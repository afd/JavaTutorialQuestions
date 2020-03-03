package tutorialquestions.question17b1.afterdefault;

public interface J {

  int foo(int x);

  int bar(int y);

  default int foobar(int x) {
    return bar(foo(x));
  }

}
