package tutorialquestions.questionc2b8.beforerefactoring;

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

  public int area(Rectangle rectangle) {
    return rectangle.getWidth() * rectangle.getHeight();
  }

  public boolean contains(Rectangle r1, Rectangle r2) {
    return
        r1.getTopLeft().getCoordX() <= r2.getTopLeft().getCoordX()
            && r1.getTopLeft().getCoordY() <= r2.getTopLeft().getCoordY()
            && getBottomRight(r1).getCoordX() >= getBottomRight(r2).getCoordX()
            && getBottomRight(r1).getCoordY() >= getBottomRight(r2).getCoordY();
  }

  private Point getBottomRight(Rectangle r) {
    return new Point(
        r.getTopLeft().getCoordX() + r.getWidth(),
        r.getTopLeft().getCoordY() + r.getHeight()
    );
  }

  public int maxArea() {
    int result = 0;
    for (Rectangle r : rectangles) {
      if (area(r) > result) {
        result = area(r);
      }
    }
    return result;
  }

  public String toString() {

    final StringBuilder result = new StringBuilder("Drawing engine is looking after these rectangles:");
    for (Rectangle r : rectangles) {
      result.append("\n   ").append(rectangleToString(r));
    }
    return result.toString();

  }

  public String rectangleToString(Rectangle rectangle) {
    return "(top-left = " + rectangle.getTopLeft() + ", width = " + rectangle.getWidth()
        + ", height = " + rectangle.getHeight() + ")";
  }


}
