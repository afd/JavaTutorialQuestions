package tutorialquestions.question9a9b;

public enum NoteName {

  C, C_SHARP, D, D_SHARP, E, F, F_SHARP, G, G_SHARP, A, A_SHARP, B;

  @Override
  public String toString() {
    switch (this) {
      case C:
        return "C";
      case C_SHARP:
        return "C#";
      case D:
        return "D";
      case D_SHARP:
        return "D#";
      case E:
        return "E";
      case F:
        return "F";
      case F_SHARP:
        return "F#";
      case G:
        return "G";
      case G_SHARP:
        return "G#";
      case A:
        return "A";
      case A_SHARP:
        return "A#";
      default:
        assert this == B;
        return "B";
    }
  }

}
