package tutorialquestions.questiondc38.acyclic;

import java.util.HashSet;
import java.util.Set;

public class IndividualEmailAddress extends EmailAddress {

  public IndividualEmailAddress(String identifier) {
    super(identifier);
  }

  @Override
  public Set<EmailAddress> getTargets() {
    Set<EmailAddress> result = new HashSet<>();
    result.add(this);
    return result;
  }

}
