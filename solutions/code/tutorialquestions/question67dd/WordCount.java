package tutorialquestions.question67dd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCount {

  /**
   * Word count example.
   */
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int lines = 0;
    int words = 0;
    int characters = 0;

    String line;

    // This is an ugly but legal, and widely used, way to save one line of code:
    while ((line = br.readLine()) != null) {

      lines++;

      boolean inWord = false;

      for (int i = 0; i < line.length(); i++) {

        if (Character.isLetterOrDigit(line.charAt(i))) {
          characters++;
          if (!inWord) {
            words++;
          }
          inWord = true;
        } else {
          inWord = false;
        }
      }

    }

    System.out.println("Lines: " + lines);
    System.out.println("Words: " + words);
    System.out.println("Characters: " + characters);

  }

}