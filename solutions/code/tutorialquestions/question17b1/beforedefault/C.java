package tutorialquestions.question17b1.beforedefault;

import java.io.IOException;

public class C implements K {
  @Override
  public void baz() {

  }

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

  public int foobar() throws IOException {
    throw new IOException();
  }

  protected int foobar(int x) {
    return x;
  }

}
