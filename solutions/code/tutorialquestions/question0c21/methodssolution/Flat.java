package tutorialquestions.question0c21.methodssolution;

public class Flat extends Property {

  @Override
  public boolean isBungalow() {
    return false;
  }

  @Override
  public boolean isFlat() {
    return true;
  }

  @Override
  public boolean isHouse() {
    return false;
  }

  @Override
  public boolean isMaisonette() {
    return false;
  }

  @Override
  public boolean isTerraced() {
    return false;
  }

}
