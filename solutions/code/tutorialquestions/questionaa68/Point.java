package tutorialquestions.questionaa68;

public class Point {

  // By making these fields final, we ensure that a Point is immutable.
  private final double coordX;
  private final double coordY;
  private final double coordZ;

  public Point(double coordX, double coordY, double coordZ) {
    this.coordX = coordX;
    this.coordY = coordY;
    this.coordZ = coordZ;
  }

  public double distanceFrom(Point other) {
    return Math.sqrt(Math.pow(other.coordX - coordX, 2) + Math.pow(other.coordY - coordY, 2)
        + Math.pow(other.coordZ - coordZ, 2));
  }

  public static Point getOrigin() {
    return new Point(0, 0, 0);
  }

  public double magnitude() {
    return distanceFrom(getOrigin());
  }

  @Override
  public String toString() {
    return "(" + coordX + ", " + coordY + ", " + coordZ + ")";
  }

  // Getters for the fields of a Point are not provided, as they are not needed for this question

  public boolean canEqual(Object that) {
    return that instanceof Point;
  }

  @Override
  public boolean equals(Object that) {

    if (!this.canEqual(that)) {
      return false;
    }

    Point thatPoint = (Point) that;

    if (!(thatPoint.canEqual(this))) {
      return false;
    }

    return coordX == thatPoint.coordX && coordY == thatPoint.coordY && coordZ == thatPoint.coordZ;

  }

}
