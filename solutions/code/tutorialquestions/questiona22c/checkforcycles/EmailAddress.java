package tutorialquestions.questiona22c.checkforcycles;

import java.util.HashSet;
import java.util.Set;

public abstract class EmailAddress {

  private String identifier;

  private static Set<String> pastIdentifiers = new HashSet<String>();

  public EmailAddress(String identifier) throws DuplicateEmailAddressException {
    if (pastIdentifiers.contains(identifier)) {
      throw new DuplicateEmailAddressException(identifier);
    }
    pastIdentifiers.add(identifier);
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
