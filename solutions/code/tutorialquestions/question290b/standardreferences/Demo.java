package tutorialquestions.question290b.standardreferences;

import tutorialquestions.question1ae9.objectpool.Point;

public class Demo {

  public static void main(String[] args) {

    for (int i = 0; i < 10000000; i++) {
      Point.makePoint(0, 0, i);
    }

  }

}
