package tutorialquestions.question876b.fixed;

import java.util.HashSet;
import java.util.Set;
import tutorialquestions.question876b.A;
import tutorialquestions.question876b.B;

public class Demo {

  public static void main(String[] args) {

    // Such warnings are generally important - I am suppressing them because
    // they do not matter for this simple demo, and I don't want their presence
    // to make me miss other warnings!

    @SuppressWarnings("UnnecessaryLocalVariable")
    Set<B> setOfB = new HashSet<>();

    @SuppressWarnings("unused")
    Set<? extends A> setOfA = setOfB;

  }

}
