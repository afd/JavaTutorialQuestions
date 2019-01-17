package tutorialquestions.questiona22c.checkforduplicates;

import java.util.HashSet;
import java.util.Set;

public class IndividualEmailAddress extends EmailAddress {

  public IndividualEmailAddress(String identifier) throws DuplicateEmailAddressException {
    super(identifier);
  }

  @Override
  public Set<EmailAddress> getTargets() {
    Set<EmailAddress> result = new HashSet<EmailAddress>();
    result.add(this);
    return result;
  }

}
