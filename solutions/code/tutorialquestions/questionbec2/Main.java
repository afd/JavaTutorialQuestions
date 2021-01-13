package tutorialquestions.questionbec2;

public class Main {

  /**
   * Example artists, records and genres.
   */
  public static void main(String[] args) {

    Artist queen = new Artist("Queen", Genre.ROCK);

    queen.addRecord("A Night At the Opera");

    queen.addRecord("Hot Space", Genre.POP);

    queen.addRecord("A Day at the Races", Genre.ROCK);

    queen.addRecord("Innuendo", Genre.ROCK);

    System.out.println("All records by " + queen.getName() + ":");
    queen.showCatalogue();

    System.out.println();

    System.out.println("All " + Genre.ROCK + " records by " + queen.getName() + ":");
    queen.showGenre(Genre.ROCK);

  }

}
