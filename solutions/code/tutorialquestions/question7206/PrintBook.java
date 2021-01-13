package tutorialquestions.question7206;

import java.util.HashSet;
import java.util.Set;

public class PrintBook {

  public static void main(String[] args) {

    Set<Book> set = new HashSet<>();

    Book book = new Book(1, "C++");

    set.add(book);

    set.add(new Book(2, "Haskell"));
    set.add(new Book(1, "Java"));
    book.setTitle("New C++ book");

    for (Book b : set) {
      System.out.println(b);
    }

  }

}
