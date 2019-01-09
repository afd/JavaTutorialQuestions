package tutorialquestions.question0378;

public class SurnameComparator implements PersonComparator {

  @Override
  public int compareTo(Person first, Person second) {
    return first.getSurname().compareTo(second.getSurname());
  }

}
