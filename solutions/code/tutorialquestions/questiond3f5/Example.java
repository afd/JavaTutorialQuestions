package tutorialquestions.questiond3f5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

  static Stream<Integer> restrictToPositiveIntegers(Stream<Number> numbers) {
    return numbers.filter(item -> item instanceof Integer)
            .map(item -> (Integer) item)
            .filter(item -> item > 0);
  }

  static Stream<Integer> restrictToPositiveIntegersBoundedWildcard(
          Stream<? extends Number> numbers) {
    return numbers.filter(item -> item instanceof Integer)
            .map(item -> (Integer) item)
            .filter(item -> item > 0);
  }

  public static void main(String[] args) {

    final List<Number> numbers = List.of(
            5,
            2,
            3.0f,
            -20.0,
            (short) -1,
            -12,
            -200,
            200,
            0);

    final List<Double> floats = List.of(
            10.0,
            -20.0,
            31.0,
            412.34);

    final List<Integer> integers = List.of(
            1,
            -1,
            2,
            -2,
            3,
            -3,
            4,
            -4,
            0);

    System.out.println("Positive integers from " + numbers + " are: "
            + restrictToPositiveIntegers(numbers.stream()).collect(Collectors.toList()));

    // Think about why the following would not compile:
    // System.out.println("Positive integers from " + floats + " are: "
    //         + restrictToPositiveIntegers(floats.stream()).collect(Collectors.toList()));

    // ... and the following:
    // System.out.println("Positive integers from " + integers + " are: "
    //         + restrictToPositiveIntegers(integers.stream()).collect(Collectors.toList()));

    System.out.println("Positive integers from " + floats + " are: "
            + restrictToPositiveIntegersBoundedWildcard(floats
            .stream())
            .collect(Collectors.toList()));
    System.out.println("Positive integers from " + integers + " are: "
            + restrictToPositiveIntegersBoundedWildcard(integers
            .stream())
            .collect(Collectors.toList()));

  }

}
