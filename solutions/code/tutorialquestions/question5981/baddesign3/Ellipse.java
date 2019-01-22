/***************************************************/
/* This class illustrates a POOR DESIGN
 * for the shapes question
 * 
 * DO NOT CONFUSE THIS WITH THE SAMPLE SOLUTION!!!
 ***************************************************/

package tutorialquestions.question5981.baddesign3;

public class Ellipse extends Shape {

  public Ellipse(int semiMajorAxis, int semiMinorAxis) {
    super(semiMajorAxis, semiMinorAxis);
  }

  public int getSemiMajorAxis() {
    return widthOrSemimajorAxis;
  }

  public void setSemiMajorAxis(int semiMajorAxis) {
    this.widthOrSemimajorAxis = semiMajorAxis;
  }

  public int getSemiMinorAxis() {
    return heightOrSemiminorAxis;
  }

  public void setSemiMinorAxis(int semiMinorAxis) {
    this.heightOrSemiminorAxis = semiMinorAxis;
  }

  @Override
  public boolean isCircle() {
    return widthOrSemimajorAxis == heightOrSemiminorAxis;
  }

  @Override
  public boolean isSquare() {
    return false;
  }


}
