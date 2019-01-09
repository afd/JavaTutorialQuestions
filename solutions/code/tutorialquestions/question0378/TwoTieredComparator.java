package tutorialquestions.question0378;

public class TwoTieredComparator implements PersonComparator {

  private final PersonComparator first;
  private final PersonComparator second;

  public TwoTieredComparator(PersonComparator first, PersonComparator second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public int compareTo(Person first, Person second) {
    int result = this.first.compareTo(first, second);
    if (result == 0) {
      result = this.second.compareTo(first, second);
    }
    return result;
  }

}
