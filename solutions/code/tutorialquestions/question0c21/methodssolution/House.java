package tutorialquestions.question0c21.methodssolution;

public abstract class House extends Property {

  @Override
  public final boolean isHouse() {
    return true;
  }

  @Override
  public final boolean isFlat() {
    return false;
  }

  @Override
  public final boolean isMaisonette() {
    return false;
  }

}
