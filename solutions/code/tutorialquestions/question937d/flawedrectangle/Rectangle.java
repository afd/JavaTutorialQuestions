package tutorialquestions.question937d.flawedrectangle;

public class Rectangle {

  private int width;
  private int height;
  private int area;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
    this.area = width * height;
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

  public int getArea() {
    return area;
  }

  public void setArea(int area) {
    this.area = area;
  }

}
