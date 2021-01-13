package tutorialquestions.questiondc38.cyclic;

import java.util.HashSet;
import java.util.Set;

public abstract class EmailAddress {

  private final String identifier;

  public EmailAddress(String identifier) {
    this.identifier = identifier;
  }

  public final Set<EmailAddress> getTargets() {
    return getTargets(new HashSet<>());
  }

  protected abstract Set<EmailAddress> getTargets(Set<EmailAddress> alreadySeen);


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
