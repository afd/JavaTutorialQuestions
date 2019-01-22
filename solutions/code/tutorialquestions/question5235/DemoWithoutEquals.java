package tutorialquestions.question5235;

import tutorialquestions.question0f05.Point;

public class DemoWithoutEquals {

  public static void main(String[] args) {

    Point p1 = new Point(1, 2, 3);

    Point p2 = new Point(1, 2, 3);

    // This assertion will fail, because
    // equals has not been overridden
    assert p1.equals(p2);

  }
}
