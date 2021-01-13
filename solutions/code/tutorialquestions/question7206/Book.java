package tutorialquestions.question7206;

public class Book {

  private final int isbn;
  private String title;

  Book(int isbn, String title) {
    this.isbn = isbn;
    setTitle(title);
  }

  void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Book) {
      return isbn == ((Book) obj).isbn;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return isbn;
  }

  @Override
  public String toString() {
    return title + "(ISBN: " + isbn + ")";
  }

}
