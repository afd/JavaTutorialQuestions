package tutorialquestions.question9a9b;

public abstract class TuneElement {

  private final NoteValue value;

  public TuneElement(NoteValue value) {
    this.value = value;
  }

  public NoteValue getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "(" + value + ")";
  }

}
