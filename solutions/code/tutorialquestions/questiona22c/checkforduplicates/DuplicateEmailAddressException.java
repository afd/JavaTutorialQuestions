package tutorialquestions.questiona22c.checkforduplicates;

@SuppressWarnings("serial")
public class DuplicateEmailAddressException extends Exception {

  private final String identifier;

  public DuplicateEmailAddressException(String identifier) {
    this.identifier = identifier;
  }

  @Override
  public String toString() {
    return "Attempt to add email address with duplicate identifier: " + identifier;
  }

}
