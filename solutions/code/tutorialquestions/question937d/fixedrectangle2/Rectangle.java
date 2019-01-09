package tutorialquestions.question937d.fixedrectangle2;

public class Rectangle {

  private final int width;
  private final int height;
  private final int area;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
    this.area = width * height;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public int getArea() {
    return area;
  }

}
