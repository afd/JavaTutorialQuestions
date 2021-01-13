package tutorialquestions.question11e2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Example {

  public static <E, C extends Collection<E>> Optional<C>
      getSmallestCollection(List<C> collections) {
    return collections
            .stream()
            .reduce((collection1, collection2) ->
                    collection1.size() < collection2.size() ? collection1 : collection2);
  }

  public static void main(String[] args) {
    final Set<Integer> s1 = Set.of(1, 2, 3, 4);
    final Set<Integer> s2 = Set.of(1, 2);
    final Set<Integer> s3 = Set.of(1, 2, 3, 4);
    final Set<Integer> s4 = Set.of(3, 4);

    final List<String> l1 = new ArrayList<>(List.of("alpha", "beta", "gamma"));
    final List<String> l2 = new ArrayList<>(List.of("ay", "bee", "cee"));
    final List<String> l3 = new ArrayList<>(List.of("mouse", "fox", "owl", "snake",
            "gruffalo"));
    final List<String> l4 = new ArrayList<>(List.of("dog", "cat", "frog", "bird", "witch",
            "broomstick"));
    final List<String> l5 = new ArrayList<>(List.of("dragon", "pox"));
    final List<String> l6 = new ArrayList<>(List.of("dragon", "pox"));

    final List<Set<Integer>> listOfSetsOfIntegers = List.of(s1, s2, s3, s4);
    final List<List<String>> listOfListsOfStrings = List.of(l1, l2, l3, l4, l5, l6);

    // Think about why the following would not compile:
    // final List<Collection<Object>> listOfCollections = List.of(
    //     s1, s2, s3, s4, l1, l2, l3, l4, l5);
    final List<Collection<?>> listOfCollections = List.of(s1, s2, s3, s4, l1, l2, l3, l4, l5);

    final Optional<Set<Integer>> smallestSet = getSmallestCollection(listOfSetsOfIntegers);
    assert smallestSet.isPresent();
    assert smallestSet.get().size() == 2;

    final Optional<List<String>> smallestList = getSmallestCollection(listOfListsOfStrings);
    assert smallestList.isPresent();
    // Think about why '==' would *not* be OK here.
    assert smallestList.get().equals(l5);

    // Think about why the following would not compile:
    // final Optional<Collection<?>> smallestCollection = getSmallestCollection(listOfCollections);

  }

}
