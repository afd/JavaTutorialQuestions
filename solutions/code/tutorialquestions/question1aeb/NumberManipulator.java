package tutorialquestions.question1aeb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NumberManipulator {

  public static <T extends Number> Set<T> readNumbers(int count, NumberParser<T> parser)
      throws IOException {

    Set<T> result = new HashSet<>();

    BufferedReader br = new BufferedReader(
        new InputStreamReader(
            System.in
        )
    );

    for (int i = 0; i < count; i++) {
      System.out.println("Please enter number of type " + parser.typeParsed() + ":");
      result.add(parser.parseNumber(br.readLine()));
    }

    return result;

  }

  public static <T extends Number> T addNumbers(Set<T> numbers, NumberAdder<T> adder) {

    T result = adder.zero();

    for (T number : numbers) {
      result = adder.add(result, number);
    }

    return result;

  }

  public static void displayAsDoubles(Set<? extends Number> numbers) {
    System.out.print("[ ");

    for (Iterator<? extends Number> it = numbers.iterator(); it.hasNext(); ) {
      System.out.print(it.next().floatValue());
      if (it.hasNext()) {
        System.out.print(", ");
      }
    }
    System.out.println(" ]");
  }

  public static void displayAsInts(Set<? extends Number> numbers) {
    System.out.print("[ ");

    for (Iterator<? extends Number> it = numbers.iterator(); it.hasNext(); ) {
      System.out.print(it.next().intValue());
      if (it.hasNext()) {
        System.out.print(", ");
      }
    }
    System.out.println(" ]");
  }

  public static void main(String[] args) throws IOException {

    System.out.println("Please enter five doubles, one line at a time");
    Set<Double> doubles = readNumbers(5, new DoubleParser());

    System.out.println("Please enter five ints, one line at a time");
    Set<Integer> ints = readNumbers(5, new IntegerParser());

    double sumOfDoubles = addNumbers(doubles, new DoubleAdder());
    int sumOfInts = addNumbers(ints, new IntegerAdder());

    System.out.println("Sum of all doubles is " + sumOfDoubles);

    System.out.println("Sum of all ints is " + sumOfInts);

    System.out.println("Ints as doubles:");

    displayAsDoubles(ints);

    System.out.println("Doubles as ints");

    displayAsInts(doubles);

  }

}
