package tutorialquestions.questionbec2;

public enum Genre {
  ROCK, POP, JAZZ;

  @Override
  public String toString() {
    return switch(this) {
      case ROCK -> "Rock";
      case POP -> "Pop";
      case JAZZ -> "Jazz";
    };
  }

}
