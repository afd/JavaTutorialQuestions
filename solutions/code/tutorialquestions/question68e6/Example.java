package tutorialquestions.question68e6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

  static List<Integer> concatenate(List<List<Integer>> lists) {
    return lists
            .stream()
            .reduce(Collections.emptyList(),
                (first, second) -> {
                  List<Integer> result = new ArrayList<>(first);
                  result.addAll(second);
                  return result;
                });
  }

  static int findMin(List<Integer> numbers) {
    return numbers
            .stream()
            .reduce(Integer.MAX_VALUE, Math::min);
  }

  static int findMinOrZero(List<Integer> numbers) {
    return numbers
            .stream()
            .reduce(Math::min)
            .orElse(0);
  }

  static int findMax(List<Integer> numbers) {
    return numbers
            .stream()
            .reduce(Integer.MIN_VALUE, (first, second) -> Math.max(first, second));
  }

  static int findMaxOrZero(List<Integer> numbers) {
    return numbers
            .stream()
            .reduce((first, second) -> Math.max(first, second))
            .orElse(0);
  }

  static int findMinOfMaxes(List<List<Integer>> listOfLists) {
    return findMin(listOfLists
            .stream()
            .map(Example::findMax)
            .collect(Collectors.toList()));
  }

  public static void main(String[] args) {
    final List<Integer> list1 = List.of(1, 2, 3, 4, 5, 9);
    final List<Integer> list2 = List.of(1, 10, 100, 1000, 10000);
    final List<Integer> list3 = List.of(6, 7, 8);
    final List<List<Integer>> listOfLists = List.of(list1, list2, list3);

    final List<Integer> allIntegers = concatenate(listOfLists);
    final int maxList1 = findMax(list1);
    final int minList2 = findMin(list2);
    final int maxEmpty = findMax(Collections.emptyList());
    final int minEmpty = findMin(Collections.emptyList());
    final int maxOrZeroEmpty = findMinOrZero(Collections.emptyList());
    final int minOrZeroEmpty = findMaxOrZero(Collections.emptyList());
    final int minOfMaxes = findMinOfMaxes(listOfLists);
    final int minOfMaxesEmpty = findMinOfMaxes(Collections.emptyList());
    final int minOfMaxesListOfEmptyLists = findMinOfMaxes(
            List.of(Collections.emptyList(), Collections.emptyList()));

    System.out.println("Concatenation of all the integer lists: " + allIntegers);
    System.out.println("Max of list 1: " + maxList1);
    System.out.println("Min of list 2: " + minList2);
    System.out.println("Max of empty list: " + maxEmpty);
    System.out.println("Min of empty list: " + minEmpty);
    System.out.println("Max-or-zero of empty list: " + maxOrZeroEmpty);
    System.out.println("Min-or-zero of empty list: " + minOrZeroEmpty);
    System.out.println("Min of maxes: " + minOfMaxes);
    System.out.println("Min of maxes of empty list: " + minOfMaxesEmpty);
    System.out.println("Min of maxes of list of empty lists: " + minOfMaxesListOfEmptyLists);

  }

}
