package tutorialquestions.question9a9b;

public enum NoteValue {

  WHOLE, HALF, QUARTER, EIGHTH, SIXTEENTH;

  @Override
  public String toString() {
    switch (this) {
      case WHOLE:
        return "1";
      case HALF:
        return "1/2";
      case QUARTER:
        return "1/4";
      case EIGHTH:
        return "1/8";
      default:
        assert this == SIXTEENTH;
        return "1/16";
    }
  }

}
