package tutorialquestions.question710c.hashcode;

import java.util.HashSet;
import java.util.Set;
import tutorialquestions.question5235.Colour;

public class PointHashCodeDemo {

  /**
   * Point hash code illustration.
   */
  public static void main(String[] args) {

    final Point first = new Point(1.2, 2.3, 3.4);
    final Point second = new Point(1.2, 2.3, 3.4);

    final Point firstColoured = new ColouredPoint(1.2, 2.3, 3.4, Colour.RED);
    final Point secondColoured = new ColouredPoint(1.2, 2.3, 3.4, Colour.RED);

    Set<Point> pointSet = new HashSet<>();

    pointSet.add(first);

    System.out.println("pointSet contains first: " + pointSet.contains(first));
    System.out.println("first equals second: " + first.equals(second));
    System.out.println("pointSet contains second: " + pointSet.contains(second));

    System.out.println("pointSet contains firstColoured: " + pointSet.contains(firstColoured));
    pointSet.add(firstColoured);
    System.out.println("pointSet contains firstColoured: " + pointSet.contains(firstColoured));
    System.out.println("pointSet contains secondColoured: " + pointSet.contains(secondColoured));

  }

}
