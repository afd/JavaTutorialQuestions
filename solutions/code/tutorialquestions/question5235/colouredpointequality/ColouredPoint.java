package tutorialquestions.question5235.colouredpointequality;

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
  public boolean equals(Object that) {

    if (!(that instanceof ColouredPoint)) {
      return false;
    }

    ColouredPoint thatPoint = (ColouredPoint) that;

    return super.equals(thatPoint) && colour == thatPoint.colour;

  }

}
