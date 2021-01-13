package tutorialquestions.questiond363.afterfixingandrefactoring;

import java.util.StringTokenizer;

public class Name {

  private final String forenames;
  private final String surname;

  public Name(String forenames, String surname) {
    this.forenames = forenames;
    this.surname = surname;
  }

  public String getForenames() {
    return forenames;
  }

  public String getSurname() {
    return surname;
  }

  public String getInitials() {
    final StringBuilder result = new StringBuilder();
    StringTokenizer strTok = new StringTokenizer(forenames);
    while (strTok.hasMoreTokens()) {
      result.append(strTok.nextToken().charAt(0));
    }
    return result.toString() + surname.charAt(0);
  }

  @Override
  public String toString() {
    return forenames + " " + surname;
  }

}
