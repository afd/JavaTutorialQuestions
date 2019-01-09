package tutorialquestions.questionbdb4.fixed;

import tutorialquestions.questionbdb4.flawed.Rectangle;

public class House {

  private Rectangle floorSize;
  private int floorArea;

  public House(Rectangle floorSize) {
    setFloorSize(floorSize);
  }

  public Rectangle getFloorSize() {
    // Do not return 'floorSize' - return a *clone* of 'floorSize'
    return new Rectangle(floorSize.getWidth(), floorSize.getHeight());
  }

  public void setFloorSize(Rectangle floorSize) {
    // Do not set 'this.floorSize' to 'floorSize' - instead,
    // set 'this.floorSize' to a fresh *clone* of 'floorSize'
    this.floorSize = new Rectangle(floorSize.getWidth(), floorSize.getHeight());
    floorArea = floorSize.getWidth() * floorSize.getHeight();
  }

  public int getFloorArea() {
    return floorArea;
  }

}
