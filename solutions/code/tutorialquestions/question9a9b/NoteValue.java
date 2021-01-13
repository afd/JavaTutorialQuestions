package tutorialquestions.question9a9b;

public enum NoteValue {

  WHOLE, HALF, QUARTER, EIGHTH, SIXTEENTH;

  @Override
  public String toString() {
    return switch (this) {
      case WHOLE -> "1";
      case HALF -> "1/2";
      case QUARTER -> "1/4";
      case EIGHTH -> "1/8";
      case SIXTEENTH -> "1/16";
    };
  }

}
