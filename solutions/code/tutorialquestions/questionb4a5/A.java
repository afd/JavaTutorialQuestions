package tutorialquestions.questionb4a5;

public class A {

  static int numCollected = 0;

  private final int id;

  public A(int id) {
    this.id = id;
  }

  // This example is used to explore garbage collector behaviour via 'finalize', so we suppress
  // Checkstyle's generally sound advice to avoid using 'finalize' here.
  @SuppressWarnings({"checkstyle:nofinalizer", "deprecation"})
  @Override
  public void finalize() {
    System.out.println("Instance " + id + " collected");
    numCollected++;
  }

}
