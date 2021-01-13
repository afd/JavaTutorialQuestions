package tutorialquestions.questionfe94;

import java.util.List;
import java.util.stream.Collectors;

public class Example {

  static List<String> reverseEachString(List<String> input) {
    return input
            .stream()
            .map(StringBuilder::new)
            .map(StringBuilder::reverse)
            .map(StringBuilder::toString)
            .collect(Collectors.toList());
  }

  static List<String> reverseEachStringMonolithic(List<String> input) {
    return input
            .stream()
            .map(item -> new StringBuilder(item).reverse().toString())
            .collect(Collectors.toList());
  }

  static List<Double> sqrtsOfFirstDigits(List<String> input) {
    return input
            .stream()
            .filter(item -> item.length() > 0)
            .filter(item -> Character.isDigit(item.charAt(0)))
            .map(item -> Integer.valueOf(item.substring(0, 1)))
            .map(Math::sqrt)
            .collect(Collectors.toList());
  }

  static List<Double> sqrtsOfFirstDigitsMonolithic(List<String> input) {
    return input
            .stream()
            .filter(item -> item.length() > 0 && Character.isDigit(item.charAt(0)))
            .map(item -> Math.sqrt(Integer.parseInt(item.substring(0, 1))))
            .collect(Collectors.toList());
  }

  public static void main(String[] args) {

    final List<String> strings = List.of(
            "1astring", "2anotherstring", "ant", "eater", "-1nofirstdigit", "9anotherstring",
            "88only8getsrooted");

    final List<String> expectedReversed = List.of(
            "gnirtsa1", "gnirtsrehtona2", "tna", "retae", "tigidtsrifon1-", "gnirtsrehtona9",
            "detoorsteg8ylno88");

    final List<Double> expectedSqrtsOfFirstDigits = List.of(Math.sqrt(1), Math.sqrt(2),
            Math.sqrt(9), Math.sqrt(8));

    final List<String> reversed1 = reverseEachString(strings);
    final List<String> reversed2 = reverseEachStringMonolithic(strings);

    final List<Double> sqrtsOfFirstDigits1 = sqrtsOfFirstDigits(strings);
    final List<Double> sqrtsOfFirstDigits2 = sqrtsOfFirstDigitsMonolithic(strings);

    System.out.println("Two ways of reversing " + strings + " give " + reversed1 + " and "
            + reversed2);

    System.out.println("Two ways of taking the square roots of the first digits of any strings in "
            + strings + " that start with digits give " + sqrtsOfFirstDigits1 + " and "
            + sqrtsOfFirstDigits2);

    assert expectedReversed.equals(reversed1);
    assert expectedReversed.equals(reversed2);

    assert expectedSqrtsOfFirstDigits.equals(sqrtsOfFirstDigits1);
    assert expectedSqrtsOfFirstDigits.equals(sqrtsOfFirstDigits2);

  }

}
