package tutorialquestions.questiondd4c;

public enum RadioStation {

  None, Radio4, PlanetRock, FiveLive, JazzFM;

  public String getNoise() {
    switch (this) {
      case Radio4:
        return "Blah, blah, blah";
      case PlanetRock:
        return "Rock rock 'til you drop";
      case FiveLive:
        return "...and it's a GOAL!!";
      case JazzFM:
        return "Ba di bah, ba do bop";
      default:
        return "";
    }
  }
}
