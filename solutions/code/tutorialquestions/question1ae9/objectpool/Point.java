package tutorialquestions.question1ae9.objectpool;

import java.util.HashMap;
import java.util.Map;

public class Point {

  private final int coordX;
  private final int coordY;
  private final int coordZ;

  private static final Map<Point, Point> pool = new HashMap<>();

  private Point(int coordX, int coordY, int coordZ) {
    this.coordX = coordX;
    this.coordY = coordY;
    this.coordZ = coordZ;
  }

  public static Point makePoint(int coordX, int coordY, int coordZ) {
    Point point = new Point(coordX, coordY, coordZ);
    if (pool.get(point) != null) {
      return pool.get(point);
      // point will now be garbage collected
    }
    pool.put(point, point);
    return point;
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
