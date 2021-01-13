package tutorialquestions.question888a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example {

  static <T> List<T> concatenate(List<List<T>> lists) {
    return lists
            .stream()
            .reduce(Collections.emptyList(),
                (first, second) -> {
                  List<T> result = new ArrayList<>(first);
                  result.addAll(second);
                  return result;
                });
  }

  static <S, T> List<ImmutablePair<Optional<S>, Optional<T>>> zip(List<S> first, List<T> second) {
    return IntStream
            .range(0, Math.max(first.size(), second.size()))
            .mapToObj(item -> new ImmutablePair<Optional<S>, Optional<T>>(
                      item < first.size() ? Optional.of(first.get(item)) : Optional.empty(),
                      item < second.size() ? Optional.of(second.get(item)) : Optional.empty()))
            .collect(Collectors.toList());
  }

  static <S, T> List<ImmutablePair<S, T>> flatten(List<ImmutablePair<Optional<S>,
          Optional<T>>> maybePairs, S defaultS, T defaultT) {
    return maybePairs
            .stream()
            .map(item -> new ImmutablePair<>(item.getFirst()
                    .orElse(defaultS), item.getSecond().orElse(defaultT)))
            .collect(Collectors.toList());

  }

  public static void main(String[] args) {

    final List<String> strings1 = List.of("Then", "again", "he", "said");
    final List<String> strings2 = List.of("it", "makes", "me", "wonder", "about", "you");
    final List<String> strings3 = List.of("The", "binders", "what", "is", "it", "like");
    final List<String> strings4 = List.of("to", "steal", "a", "soul?");

    final List<Float> floats1 = List.of(1.0f, 2.0f, 3.0f, 4.0f, 5.0f);
    final List<Float> floats2 = List.of(20.0f, 19.0f, 18.0f, 17.0f, 16.0f, 15.0f);
    final List<Float> floats3 = Collections.singletonList(10.0f);
    final List<Float> floats4 = List.of(11.0f, 1.0f);

    final List<List<String>> listOfListsOfStrings = List.of(strings1, strings2, strings3,
            strings4);
    final List<List<Float>> listOfListsOfFloats = List.of(floats1, floats2, floats3,
            floats4);
    System.out.println("Concatenated string lists: " + listOfListsOfStrings);
    System.out.println("Concatenated float lists: " + listOfListsOfFloats);

    final List<ImmutablePair<Optional<String>, Optional<String>>> zippedStringLists
            = zip(strings1, strings2);
    final List<ImmutablePair<Optional<String>, Optional<Float>>> zippedStringAndFloatLists
            = zip(strings1, floats4);
    System.out.println("Zipped string lists: " + zippedStringLists);
    System.out.println("Zipped string and float lists: " + zippedStringAndFloatLists);

    final List<ImmutablePair<String, Float>> flattenedZippedStringAndFloatLists
            = flatten(zippedStringAndFloatLists, "NOTHING", -1.0f);
    System.out.println("Zipped string an float lists after flattening: "
            + flattenedZippedStringAndFloatLists);
  }


}
