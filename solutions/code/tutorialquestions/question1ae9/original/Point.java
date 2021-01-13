package tutorialquestions.question1ae9.original;

public class Point {

  private final int coordX;
  private final int coordY;
  private final int coordZ;

  public Point(int coordX, int coordY, int coordZ) {
    this.coordX = coordX;
    this.coordY = coordY;
    this.coordZ = coordZ;
  }

  @Override
  public String toString() {
    return "(" + coordX + ", " + coordY + ", " + coordZ + ")";
  }

  @Override
  public boolean equals(Object that) {
    return that instanceof Point
        && coordX == ((Point) that).coordX
        && coordY == ((Point) that).coordY
        && coordZ == ((Point) that).coordZ;
  }

  @Override
  public int hashCode() {
    return Integer.valueOf(coordX).hashCode()
        ^ Integer.valueOf(coordY).hashCode()
        ^ Integer.valueOf(coordZ).hashCode();
  }

}
