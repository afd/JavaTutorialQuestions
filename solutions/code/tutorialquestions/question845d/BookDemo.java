package tutorialquestions.question845d;

public class BookDemo {

  public static void main(String[] args) {

    Bookshelf shelf = new Bookshelf();

    shelf.addBookOnRightSide(new Book("12345678", "Lord of the Flies", 248));
    shelf.addBookOnRightSide(
        new Dictionary("14352435", "English to German Comic Dictionary", 50, "English", "German",
            100));
    shelf.addBookOnLeftSide(new Book("12112112", "Great Expectations", 608));
    shelf.addBookOnLeftSide(new Book("98253423", "Treasure Island", 252));
    shelf.addBookOnRightSide(
        new Dictionary("52646344", "Collins French to English Dictionary", 500, "French", "English",
            829));
    shelf.addBookOnRightSide(new Book("25442343", "Lord of the Rings", 1016));

    System.out.println("Books left to right:");
    shelf.printLeftToRight();

    System.out.println();
    System.out.println("Books right to left:");
    shelf.printRightToLeft();

    moveDictionariesToRight(shelf);

    System.out.println();
    System.out.println("Left to right after moving dictionaries to the right:");
    shelf.printLeftToRight();

    moveDictionariesToRight(shelf);

    System.out.println();
    System.out.println("Left to right after moving dictionaries to the right again:");
    shelf.printLeftToRight();

  }

  private static void moveDictionariesToRight(Bookshelf shelf) {

    int initialSize = shelf.size();

    int currentIndex = 0;
    for (int i = 0; i < shelf.size(); i++) {

      assert shelf.size() == initialSize;

      Book book = shelf.remove(currentIndex);
      if (book instanceof Dictionary) {
        shelf.addBookOnRightSide(book);
      } else {
        shelf.addBook(currentIndex, book);
        currentIndex++;
      }
    }

  }

}
