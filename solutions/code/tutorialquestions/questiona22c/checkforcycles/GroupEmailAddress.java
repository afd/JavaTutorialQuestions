package tutorialquestions.questiona22c.checkforcycles;

import java.util.HashSet;
import java.util.Set;

public class GroupEmailAddress extends EmailAddress {

  private final Set<EmailAddress> members;

  public GroupEmailAddress(String identifier) throws DuplicateEmailAddressException {
    super(identifier);
    members = new HashSet<>();
  }

  public void addEmailAddress(EmailAddress emailAddress) {
    if (emailAddress instanceof GroupEmailAddress
        && ((GroupEmailAddress) emailAddress).reaches(this)) {
      throw new CyclicEmailGroupException();
    }

    members.add(emailAddress);
  }

  @Override
  public Set<EmailAddress> getTargets() {

    Set<EmailAddress> result = new HashSet<>();

    for (EmailAddress e : members) {
      result.addAll(e.getTargets());
    }

    return result;
  }

  private boolean reaches(GroupEmailAddress target) {
    if (this == target) {
      return true;
    }
    for (EmailAddress address : members) {
      if (address instanceof GroupEmailAddress) {
        if (((GroupEmailAddress) address).reaches(target)) {
          return true;
        }
      }
    }
    return false;
  }

}
