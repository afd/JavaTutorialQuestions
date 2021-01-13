package tutorialquestions.question336b;


import java.util.List;

public class Demo {

  private static final int MEDIUM_NUMBER = 10000;
  private static final int LARGE_NUMBER = 1000000;

  public static void main(String[] args) {

    final GenericSet<Integer> set1 = new MemoryEfficientGenericSet<>();

    final GenericSet<Integer> set2 = new SpeedEfficientGenericSet<>();

    for (int i = 0; i < MEDIUM_NUMBER; i++) {
      set1.add(i);
      set2.add(i);
    }

    final Integer[] lotsOfDuplicates = new Integer[LARGE_NUMBER];
    for (int i = 0; i < LARGE_NUMBER; i++) {
      // Add LARGE_NUMBER or (LARGE_NUMBER + 1) at position i of the array, depending on the parity
      // of i.
      lotsOfDuplicates[i] = LARGE_NUMBER + (i % 2);
    }

    set1.addAll(lotsOfDuplicates);
    set2.addAll(lotsOfDuplicates);

    for (GenericSet<Integer> set : List.of(set1, set2)) {
      if (!set.contains(LARGE_NUMBER) || !set.contains(LARGE_NUMBER + 1)) {
        throw new AssertionError("Expected the set to contain " + LARGE_NUMBER);
      }

      if (!set.asUnmodifiableSet().contains(LARGE_NUMBER)
              || !set.asUnmodifiableSet().contains(LARGE_NUMBER + 1)) {
        throw new AssertionError("An unmodifiable version of the set should still contain these"
                + " elements");
      }

      try {
        set.asUnmodifiableSet().add(2);
        throw new AssertionError("Attempting to add to an unmodifiable set should have failed.");
      } catch (UnsupportedOperationException exception1) {
        // Good - an exception should have been thrown.
        try {
          set.asUnmodifiableSet().addAll(lotsOfDuplicates);
          throw new AssertionError("Attempting to add to an unmodifiable set should have failed.");
        } catch (UnsupportedOperationException exception2) {
          // Good - an exception should also have been thrown, due to the default implementation of
          // 'addAll' invoking 'add'.
        }
      }
    }
  }

}
