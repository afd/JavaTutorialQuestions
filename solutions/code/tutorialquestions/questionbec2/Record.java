package tutorialquestions.questionbec2;

public class Record {

  private String name;

  private Genre genre;

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
