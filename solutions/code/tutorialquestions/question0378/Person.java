package tutorialquestions.question0378;

public class Person {

  private final String surname;
  private final String forename;
  private final String telephoneNumber;

  public Person(String surname, String forename, String telephoneNumber) {
    this.surname = surname;
    this.forename = forename;
    this.telephoneNumber = telephoneNumber;
  }

  public String getSurname() {
    return surname;
  }

  public String getForename() {
    return forename;
  }

  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  @Override
  public String toString() {
    return surname + ", " + forename + "(" + telephoneNumber + ")";
  }

}
