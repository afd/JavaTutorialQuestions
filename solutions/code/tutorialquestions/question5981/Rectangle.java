package tutorialquestions.question5981;

public class Rectangle extends Shape {

  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  @Override
  public boolean isCircle() {
    return false;
  }

  @Override
  public boolean isSquare() {
    return width == height;
  }
}
