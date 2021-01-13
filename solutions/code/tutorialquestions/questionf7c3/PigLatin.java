package tutorialquestions.questionf7c3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PigLatin {

  /**
   * Pig Latin example.
   */
  public static void main(String[] args) throws IOException {

    final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final StringBuilder stringBuilder = new StringBuilder();

    String line = br.readLine();

    while (line != null) {
      stringBuilder.append(translateLineToPigLatin(line));
      line = br.readLine();
    }

    System.out.print(stringBuilder);

  }

  private static String translateLineToPigLatin(String line) {

    final StringBuilder builder = new StringBuilder();

    StringBuilder word = new StringBuilder();

    for (int i = 0; i < line.length(); i++) {

      if (Character.isLetterOrDigit(line.charAt(i))) {
        word.append(line.charAt(i));
      } else {
        if (word.length() > 0) {
          builder.append(translateToPigLatin(word.toString()));
          word = new StringBuilder();
        }
        builder.append(line.charAt(i));
      }
    }

    builder.append("\n");

    return builder.toString();
  }

  private static String translateToPigLatin(String word) {
    assert word.length() > 0;

    if (Character.isDigit(word.charAt(0))) {
      return word;
    }

    if (isVowel(word.charAt(0))) {
      return word + "way";
    }

    if (word.length() == 1) {
      return word + "ay";
    }

    return (Character.isUpperCase(word.charAt(0)) ? Character
        .toUpperCase(word.charAt(1)) : word.charAt(1))
        + word.substring(2)
        + Character.toLowerCase(word.charAt(0)) + "ay";
  }

  private static boolean isVowel(char c) {
    return switch (Character.toLowerCase(c)) {
      case 'a', 'e', 'i', 'o', 'u' -> true;
      default -> false;
    };
  }

}