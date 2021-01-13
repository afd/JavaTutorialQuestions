package tutorialquestions.questionc2b8.afterrefactoring;

public class Point {

  private final int coordX;
  private final int coordY;

  public Point(int coordX, int coordY) {
    this.coordX = coordX;
    this.coordY = coordY;
  }

  public int getCoordX() {
    return coordX;
  }

  public int getCoordY() {
    return coordY;
  }

  public String toString() {
    return "(" + getCoordX() + ", " + getCoordY() + ")";
  }

}
