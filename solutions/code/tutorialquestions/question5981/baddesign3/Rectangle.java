/***************************************************/
/* This class illustrates a POOR DESIGN
 * for the shapes question
 * 
 * DO NOT CONFUSE THIS WITH THE SAMPLE SOLUTION!!!
 ***************************************************/

package tutorialquestions.question5981.baddesign3;

public class Rectangle extends Shape {

  public Rectangle(int width, int height) {
    super(width, height);
  }

  public int getWidth() {
    return widthOrSemimajorAxis;
  }

  public void setWidth(int width) {
    this.widthOrSemimajorAxis = width;
  }

  public int getHeight() {
    return heightOrSemiminorAxis;
  }

  public void setHeight(int height) {
    this.heightOrSemiminorAxis = height;
  }

  @Override
  public boolean isCircle() {
    return false;
  }

  @Override
  public boolean isSquare() {
    return widthOrSemimajorAxis == heightOrSemiminorAxis;
  }
}
