package tutorialquestions.question876b.broken;

import java.util.HashSet;
import java.util.Set;
import tutorialquestions.question876b.B;

public class Demo {

  public static void main(String[] args) {

    // Such warnings are generally important - I am suppressing it because
    // it doesn't matter for this simple demo, and I don't want its presence
    // to make me miss other warnings!
    @SuppressWarnings("unused")
    Set<B> setOfB = new HashSet<>();

    // Uncommenting the following line causes compiler error
    // Set<A> setOfA = setOfB;

  }

}
