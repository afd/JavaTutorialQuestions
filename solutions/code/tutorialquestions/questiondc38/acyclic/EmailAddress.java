package tutorialquestions.questiondc38.acyclic;

import java.util.Set;

public abstract class EmailAddress {

  private final String identifier;

  public EmailAddress(String identifier) {
    this.identifier = identifier;
  }

  public abstract Set<EmailAddress> getTargets();

  @Override
  public String toString() {
    return identifier;
  }

  @Override
  public boolean equals(Object that) {
    return that instanceof EmailAddress
        && ((EmailAddress) that).identifier.equals(identifier);
  }

  @Override
  public int hashCode() {
    return identifier.hashCode();
  }

}
