package tutorialquestions.question17b1.afterdefault;

public interface I {

  int foo();

  int foo(int x);

  int bar(int x);

  default int foobar() {
    return bar(foo());
  }

  default int foobar(int x) {
    return bar(foo(x));
  }

}
