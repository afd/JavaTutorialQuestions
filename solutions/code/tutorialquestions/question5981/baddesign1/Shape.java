package tutorialquestions.question5981.baddesign1;

/**
 * This class illustrates a POOR DESIGN for the shapes question.
 * DO NOT CONFUSE THIS WITH THE SAMPLE SOLUTION!!!
 */
public class Shape {

  // Represents semi-major axis if shape is an Ellipse,
  // or width if shape is a Rectangle, or radius if shape
  // is a Circle, or side length if shape is a Square
  private int first;

  // Represents semi-minor axis if shape is an Ellipse,
  // or height if shape is a Rectangle.
  // Ignored if shape is a Circle or Square
  private int second;

  private final ShapeType type;

  public Shape(int first, int second, ShapeType type) {
    this.first = first;
    this.second = second;
    this.type = type;
  }

  public int getFirst() {
    return first;
  }

  public void setFirst(int first) {
    this.first = first;
  }

  public int getSecond() {
    return second;
  }

  public void setSecond(int second) {
    this.second = second;
  }

  public ShapeType getType() {
    return type;
  }

}
