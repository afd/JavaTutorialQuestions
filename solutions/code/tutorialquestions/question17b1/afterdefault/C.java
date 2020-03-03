package tutorialquestions.question17b1.afterdefault;

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

  // This method had to be renamed because the default zero-argument foobar from I does not
  // specify that it might throw an exception, and thus clients that invoke that method would not
  // expect a checked exception to be thrown.  It is illegal to increase the extent to which
  // exceptions are thrown when overriding or implementing a method from a superclass or
  // interface.
  public int foobarOriginal() throws IOException {
    throw new IOException();
  }

  // This method had to be renamed because I and J provide implicitly *public* default
  // implementations of foobar with this signature.  It is illegal to decrease the visibility of
  // a method from a superclass or interface when overriding or implementing it; this method has
  // protected visibility.
  protected int foobarOriginal(int x) {
    return x;
  }

}
