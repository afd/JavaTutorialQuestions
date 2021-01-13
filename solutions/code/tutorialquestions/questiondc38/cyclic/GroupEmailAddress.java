package tutorialquestions.questiondc38.cyclic;

import java.util.HashSet;
import java.util.Set;

public class GroupEmailAddress extends EmailAddress {

  private final Set<EmailAddress> members;

  public GroupEmailAddress(String identifier) {
    super(identifier);
    members = new HashSet<>();
  }

  public void addEmailAddress(EmailAddress emailAddress) {
    members.add(emailAddress);
  }

  @Override
  protected Set<EmailAddress> getTargets(Set<EmailAddress> alreadySeen) {

    Set<EmailAddress> result = new HashSet<>();

    if (alreadySeen.contains(this)) {
      return result;
    }

    alreadySeen.add(this);

    for (EmailAddress e : members) {
      result.addAll(e.getTargets(alreadySeen));
    }

    return result;
  }

}
