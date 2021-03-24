package tutorialquestions.questionaa68;

import tutorialquestions.question5235.Colour;

public class ColouredPoint extends Point {

  private final Colour colour;

  public ColouredPoint(double coordX, double coordY, double coordZ, Colour colour) {
    super(coordX, coordY, coordZ);
    this.colour = colour;
  }

  @Override
  public String toString() {
    return "(" + super.toString() + ", " + colour + ")";
  }

  @Override
  public boolean canEqual(Object that) {
    return that instanceof ColouredPoint;
  }

  @Override
  public boolean equals(Object that) {

    if (!this.canEqual(that)) {
      return false;
    }

    ColouredPoint thatPoint = (ColouredPoint) that;

    // Note: thatPoint.canEqual(this) will be checked as part of
    // super.equals(thatPoint).
    return super.equals(thatPoint) && colour == thatPoint.colour;

  }

}
