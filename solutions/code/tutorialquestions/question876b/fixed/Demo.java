package tutorialquestions.question876b.fixed;

import java.util.HashSet;
import java.util.Set;
import tutorialquestions.question876b.A;
import tutorialquestions.question876b.B;

public class Demo {

  public static void main(String[] args) {

    Set<B> setOfB = new HashSet<B>();

    // Such warnings are generally important - I am suppressing it because
    // it doesn't matter for this simple demo, and I don't want its presence
    // to make me miss other warnings!
    @SuppressWarnings("unused")
    Set<? extends A> setOfA = setOfB;

  }

}
