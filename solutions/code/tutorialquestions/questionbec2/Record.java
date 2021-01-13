package tutorialquestions.questionbec2;

public class Record {

  private final String name;

  private final Genre genre;

  public Record(String name, Genre genre) {
    this.name = name;
    this.genre = genre;
  }

  @Override
  public String toString() {
    return name + " (" + genre + ")";
  }

  public Genre getGenre() {
    return genre;
  }

}
