package tutorialquestions.question1ae9.original;

import java.util.ArrayList;
import java.util.List;

public class Demo {

  public static void main(String[] args) {

    List<Point> pointList = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      pointList.add(new Point(0, 0, 0));
    }

    if (allDifferent(pointList)) {
      System.out.println("The points are all different object references.");
    } else {
      System.out.println("Some of the points are identical references.");
    }

  }

  private static boolean allDifferent(List<Point> pointList) {

    for (int i = 0; i < pointList.size() - 1; i++) {
      for (int j = i + 1; j < pointList.size(); j++) {
        if (pointList.get(i) == pointList.get(j)) {
          return false;
        }
      }
    }

    return true;

  }

}
