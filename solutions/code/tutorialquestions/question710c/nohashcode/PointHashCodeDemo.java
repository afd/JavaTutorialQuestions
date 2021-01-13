package tutorialquestions.question710c.nohashcode;

import java.util.HashSet;
import java.util.Set;
import tutorialquestions.question5235.colouredpointequality.Point;

public class PointHashCodeDemo {

  public static void main(String[] args) {

    Point first = new Point(1.2, 2.3, 3.4);
    Point second = new Point(1.2, 2.3, 3.4);

    Set<Point> pointSet = new HashSet<>();

    pointSet.add(first);

    System.out.println("pointSet contains first: " + pointSet.contains(first));
    System.out.println("first equals second: " + first.equals(second));
    System.out.println("pointSet contains second: " + pointSet.contains(second));

  }

}
