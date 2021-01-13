package tutorialquestions.question845d;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Bookshelf {

  private final List<Book> contents;

  public Bookshelf() {
    contents = new LinkedList<>();
  }

  public int size() {
    return contents.size();
  }

  public void addBookOnLeftSide(Book book) {
    addBook(0, book);
  }

  public void addBookOnRightSide(Book book) {
    addBook(size(), book);
  }

  public void addBook(int index, Book book) {
    contents.add(index, book);
  }

  public Book remove(int index) {
    return contents.remove(index);
  }

  public void printLeftToRight() {
    for (Book b : contents) {
      System.out.println(b);
    }
  }

  public void printRightToLeft() {
    ListIterator<Book> it = contents.listIterator(contents.size());
    while (it.hasPrevious()) {
      System.out.println(it.previous());
    }
  }


}
