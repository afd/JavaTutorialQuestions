package tutorialquestions.questionc2b8.afterrefactoring;

import java.util.HashSet;
import java.util.Set;

public class DrawingEngine {

  private Set<Rectangle> rectangles;

  public DrawingEngine() {
    rectangles = new HashSet<Rectangle>();
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

    String result = "Drawing engine is looking after these rectangles:";
    for (Rectangle r : rectangles) {
      result += "\n   " + r;
    }
    return result;

  }


}
