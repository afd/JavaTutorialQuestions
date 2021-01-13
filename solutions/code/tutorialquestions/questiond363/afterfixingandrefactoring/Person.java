package tutorialquestions.questiond363.afterfixingandrefactoring;


public class Person {

  private final Name name;

  private final Date dateOfBirth;

  private final Address address;

  private final NiNumber nationalInsuranceNumber;

  public Person(Name name, Date dateOfBirth, Address address, NiNumber nationalInsuranceNumber) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.address = address;
    this.nationalInsuranceNumber = nationalInsuranceNumber;
  }

  public boolean sameAddress(Person other) {
    return address.equals(other.address);
  }

  public String toString() {
    return "Name: " + name + "\n"
        + "DOB: " + dateOfBirth + "\n"
        + "Address: " + address + "\n"
        + "NI: " + nationalInsuranceNumber;

  }

}
