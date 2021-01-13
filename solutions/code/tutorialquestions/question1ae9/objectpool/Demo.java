package tutorialquestions.question1ae9.objectpool;

import java.util.ArrayList;
import java.util.List;

public class Demo {

  public static void main(String[] args) {

    List<Point> pointList = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      pointList.add(Point.makePoint(0, 0, 0));
    }

    if (allSame(pointList)) {
      System.out.println("The points are all the same object reference.");
    } else {
      System.out.println("Some of the points are different references.");
    }

  }

  private static boolean allSame(List<Point> pointList) {
    for (int i = 1; i < pointList.size(); i++) {
      if (pointList.get(0) != pointList.get(i)) {
        return false;
      }
    }
    return true;
  }

}
