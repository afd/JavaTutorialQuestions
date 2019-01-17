package tutorialquestions.questionb4a5;

public class GarbageCollectionDemo {

  public static void main(String[] args) {

    for (int i = 0; i < 1000000; i++) {
      new A(i);
    }

    System.out.println("Number of instances of A garbage-collected: " + A.numCollected);

  }

}
