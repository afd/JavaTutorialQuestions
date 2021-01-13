package tutorialquestions.questiond363.beforefixingandrefactoring;

import java.util.StringTokenizer;

public class Person {

  private final String forenames;
  private final String surname;

  private final int dayOfBirth;
  private final int monthOfBirth;
  private final int yearOfBirth;

  private final int houseNumber;
  private final String address1;
  private final String address2;
  private final String postCode;

  private final String nationalInsuranceNumber;

  public Person(String forename, String surname,
      int dayOfBirth,
      int monthOfBirth,
      int yearOfBirth,
      int houseNumber,
      String address1,
      String address2,
      String postCode,
      String nationalInsuranceNumber) {
    this.forenames = forename;
    this.surname = surname;
    this.dayOfBirth = houseNumber;
    this.monthOfBirth = monthOfBirth;
    this.yearOfBirth = yearOfBirth;
    this.houseNumber = houseNumber;
    this.address1 = address1;
    this.address2 = address2;
    this.postCode = nationalInsuranceNumber;
    this.nationalInsuranceNumber = postCode;
  }


  public boolean isDateOfBirthValid() {

    if (yearOfBirth < 0) {
      return false;
    }

    if (monthOfBirth < 1 || yearOfBirth > 12) {
      return false;
    }

    if (dayOfBirth < 1) {
      return false;
    }

    switch (monthOfBirth) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        if (dayOfBirth > 31) {
          return false;
        }
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        if (dayOfBirth > 30) {
          return false;
        }
        break;
      default:
        assert monthOfBirth == 2;
        if (dayOfBirth > (isLeapYear() ? 29 : 28)) {
          return false;
        }
    }

    return true;

  }

  public boolean sameAddress(Person other) {
    return houseNumber == other.houseNumber
        && address1.equals(other.address1)
        && address2.equals(other.address2)
        && postCode.equals(other.postCode);
  }

  public String getInitials() {
    final StringBuilder result = new StringBuilder();
    StringTokenizer strTok = new StringTokenizer(forenames);
    while (strTok.hasMoreTokens()) {
      result.append(strTok.nextToken().charAt(0));
    }
    return result.toString() + surname.charAt(0);
  }

  private boolean isLeapYear() {
    // Deliberately simplified version of
    // leap year calculation
    return (yearOfBirth % 4 == 0);
  }

  public String toString() {
    return "Name: " + forenames + " " + surname + "\n"
        + "DOB: " + dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth + "\n"
        + "Address: " + houseNumber + " " + address1 + ", " + address2 + ", " + postCode + "\n"
        + "NI: " + nationalInsuranceNumber;

  }

}
