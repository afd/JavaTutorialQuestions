package tutorialquestions.questiondd4c;

public enum RadioStation {

  None, Radio4, PlanetRock, FiveLive, JazzFM;

  public String getNoise() {
    return switch (this) {
      case None -> "";
      case Radio4 -> "Blah, blah, blah";
      case PlanetRock -> "Rock rock 'til you drop";
      case FiveLive -> "...and it's a GOAL!!";
      case JazzFM -> "Ba di bah, ba do bop";
    };
  }
}
