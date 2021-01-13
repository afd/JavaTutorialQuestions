package tutorialquestions.questiona22c.checkforduplicates;

public class Mailbox {

  private final String mailboxIdentifier;

  public Mailbox(String mailboxIdentifier) {
    this.mailboxIdentifier = mailboxIdentifier;
  }

  @Override
  public String toString() {
    return mailboxIdentifier;
  }


}
