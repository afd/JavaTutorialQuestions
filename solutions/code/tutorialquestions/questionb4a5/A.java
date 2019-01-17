package tutorialquestions.questionb4a5;

public class A {

  static int numCollected = 0;

  private int id;

  public A(int id) {
    this.id = id;
  }

  @Override
  public void finalize() {
    System.out.println("Instance " + id + " collected");
    numCollected++;
  }

}
