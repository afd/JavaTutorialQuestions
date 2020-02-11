package tutorialquestions.question5981.baddesign2;

/**
 * This class illustrates a POOR DESIGN for the shapes question.
 * DO NOT CONFUSE THIS WITH THE SAMPLE SOLUTION!!!
 */
public class Ellipse extends Shape {

  private int semiMajorAxis;
  private int semiMinorAxis;

  public Ellipse(int semiMajorAxis, int semiMinorAxis) {
    this.semiMajorAxis = semiMajorAxis;
    this.semiMinorAxis = semiMinorAxis;
  }

  public int getSemiMajorAxis() {
    return semiMajorAxis;
  }

  public void setSemiMajorAxis(int semiMajorAxis) {
    this.semiMajorAxis = semiMajorAxis;
  }

  public int getSemiMinorAxis() {
    return semiMinorAxis;
  }

  public void setSemiMinorAxis(int semiMinorAxis) {
    this.semiMinorAxis = semiMinorAxis;
  }

}
