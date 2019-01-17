package tutorialquestions.question290b.weakreferences;


public class Demo {

  public static void main(String[] args) throws InterruptedException {

    for (int i = 0; i < 2000000; i++) {
      Point.makePoint(0, 0, i);
    }

    System.out.println("Size of pool is " + Point.poolSize());

  }

}
