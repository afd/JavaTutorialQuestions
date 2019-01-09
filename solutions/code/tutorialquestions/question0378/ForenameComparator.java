package tutorialquestions.question0378;

public class ForenameComparator implements PersonComparator {

  @Override
  public int compareTo(Person first, Person second) {
    return first.getForename().compareTo(second.getForename());
  }

}
