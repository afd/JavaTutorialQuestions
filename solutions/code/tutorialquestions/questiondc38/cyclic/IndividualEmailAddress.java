package tutorialquestions.questiondc38.cyclic;

import java.util.HashSet;
import java.util.Set;

public class IndividualEmailAddress extends EmailAddress {

  public IndividualEmailAddress(String identifier) {
    super(identifier);
  }

  @Override
  protected Set<EmailAddress> getTargets(Set<EmailAddress> alreadySeen) {
    Set<EmailAddress> result = new HashSet<>();
    result.add(this);
    return result;
  }

}
