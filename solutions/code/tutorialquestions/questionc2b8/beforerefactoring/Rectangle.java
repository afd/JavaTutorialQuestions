package tutorialquestions.questionc2b8.beforerefactoring;

public class Rectangle {

  private final Point topLeft;
  private final int width;
  private final int height;

  public Rectangle(Point topLeft, int width, int height) {
    this.topLeft = topLeft;
    this.width = width;
    this.height = height;
  }

  public Point getTopLeft() {
    return topLeft;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

}
