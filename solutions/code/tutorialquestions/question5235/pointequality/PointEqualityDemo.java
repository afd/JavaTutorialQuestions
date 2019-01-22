package tutorialquestions.question5235.pointequality;

import tutorialquestions.question5235.Colour;

public class PointEqualityDemo {

  public static void main(String[] args) {

    Point first = new Point(1.2, 2.3, 3.4);

    Point second = new Point(1.2, 2.3, 3.4);

    Point third = new Point(0.2, 2.3, 3.4);

    ColouredPoint firstColoured = new ColouredPoint(1.2, 2.3, 3.4, Colour.RED);

    ColouredPoint secondColoured = new ColouredPoint(1.2, 2.3, 3.4, Colour.BLUE);

    System.out.println("Points first = " + first + " and second = " + second + " are "
            + (first.equals(second) ? "" : "not ") + "equal");
    System.out.println("Points second = " + second + " and first = " + first + " are "
        + (second.equals(first) ? "" : "not ") + "equal");
    System.out.println("Points first = " + first + " and third = " + third + " are "
        + (first.equals(third) ? "" : "not ") + "equal");

    System.out.println("Points firstColoured = " + firstColoured + " and secondColoured = "
        + secondColoured + " are " + (firstColoured.equals(secondColoured) ? "" : "not ")
            + "equal");
    System.out.println("Points secondColoured = " + secondColoured + " and firstColoured = "
        + firstColoured + " are " + (secondColoured.equals(firstColoured) ? "" : "not ")
            + "equal");

  }

}
