package tutorialquestions.questionc2b8.afterrefactoring;

import java.util.HashSet;
import java.util.Set;

public class DrawingEngine {

  private final Set<Rectangle> rectangles;

  public DrawingEngine() {
    rectangles = new HashSet<>();
  }

  public void addRectangle(Rectangle rectangle) {
    rectangles.add(rectangle);
  }

  public int maxArea() {
    int result = 0;
    for (Rectangle r : rectangles) {
      if (r.area() > result) {
        result = r.area();
      }
    }
    return result;
  }

  @Override
  public String toString() {

    final StringBuilder result = new StringBuilder("Drawing engine is looking after these rectangles:");
    for (Rectangle r : rectangles) {
      result.append("\n   ").append(r);
    }
    return result.toString();

  }


}
