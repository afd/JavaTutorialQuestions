package tutorialquestions.question0f05;

public class PointDemo {

  public static void main(String[] args) {

    Point point1 = new Point(5.0, 10.0, -2.6);

    Point point2 = new Point(-2.6, 5.0, 10.0);

    System.out.println("Two points: point1 = " + point1 + " and point2 = " + point2);

    System.out.println("Magnitude of point1 is " + point1.magnitude());

    System.out.println("Magnitude of point2 is " + point2.magnitude());

    assert point1.magnitude() == point2.magnitude();

    System.out.println("Distance between point1 and point2 is " + point1.distanceFrom(point2));

    System.out.println(
        "The origin is " + Point.getOrigin() + " and it has magnitude " + Point.getOrigin()
            .magnitude());

  }
}
