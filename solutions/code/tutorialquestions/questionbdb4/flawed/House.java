package tutorialquestions.questionbdb4.flawed;

public class House {

  private Rectangle floorSize;
  private int floorArea;

  public House(Rectangle floorSize) {
    setFloorSize(floorSize);
  }

  public Rectangle getFloorSize() {
    return floorSize;
  }

  public void setFloorSize(Rectangle floorSize) {
    this.floorSize = floorSize;
    floorArea = floorSize.getWidth() * floorSize.getHeight();
  }

  public int getFloorArea() {
    return floorArea;
  }

}
