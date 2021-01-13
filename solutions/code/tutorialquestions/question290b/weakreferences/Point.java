package tutorialquestions.question290b.weakreferences;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public class Point {

  private final int coordX;
  private final int coordY;
  private final int coordZ;

  private static final Map<Point, WeakReference<Point>> pool = new WeakHashMap<>();

  private Point(int coordX, int coordY, int coordZ) {
    this.coordX = coordX;
    this.coordY = coordY;
    this.coordZ = coordZ;
  }

  /**
   * Creates a point from the given coordinates, re-using from the pool if possible.
   */
  public static Point makePoint(int coordX, int coordY, int coordZ) {
    Point point = new Point(coordX, coordY, coordZ);
    if (pool.get(point) != null) {
      return pool.get(point).get();
      // point will now be garbage collected
    }
    pool.put(point, new WeakReference<>(point));
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

  /**
   * Yields the size of the pool.
   */
  public static int poolSize() {

    return pool.size();

  }


}
