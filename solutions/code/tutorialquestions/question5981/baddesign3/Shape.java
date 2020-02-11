package tutorialquestions.question5981.baddesign3;

/**
 * This class illustrates a POOR DESIGN for the shapes question.
 * DO NOT CONFUSE THIS WITH THE SAMPLE SOLUTION!!!
 */
public abstract class Shape {

  protected int widthOrSemimajorAxis;
  protected int heightOrSemiminorAxis;

  public Shape(int first, int second) {
    this.widthOrSemimajorAxis = first;
    this.heightOrSemiminorAxis = second;
  }

  public abstract boolean isCircle();

  public abstract boolean isSquare();

}
