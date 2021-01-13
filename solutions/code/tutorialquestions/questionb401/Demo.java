package tutorialquestions.questionb401;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Demo {

  public static GenericSet<Integer> readIntegers(int numIntegers) throws IOException {

    GenericSet<Integer> result = (numIntegers > 10 ? new MemoryEfficientGenericSet<>()
        : new SpeedEfficientGenericSet<>());

    BufferedReader br = new BufferedReader(
        new InputStreamReader(
            System.in
        )
    );

    for (int i = 0; i < numIntegers; i++) {
      System.out.println("Please enter an int:");
      result.add(Integer.valueOf(br.readLine()));
    }

    return result;
  }

  public static void main(String[] args) throws IOException {

    // Testing the generic set on a couple of types

    GenericSet<String> stringSet = new MemoryEfficientGenericSet<>();

    stringSet.add("Hello");

    stringSet.add("There");

    assert stringSet.contains("Hello");

    stringSet.remove("Hello");

    assert !stringSet.contains("Hello");

    assert !stringSet.contains("Cat");

    GenericSet<PrintStream> printStreamSet = new SpeedEfficientGenericSet<>();

    printStreamSet.add(System.out);

    assert printStreamSet.contains(System.out);

    assert !printStreamSet.contains(System.err);

    printStreamSet.remove(System.out);

    assert printStreamSet.isEmpty();

    // Now doing the "readIntegers" part

    GenericSet<Integer> integers = readIntegers(Integer.parseInt(args[0]));

    System.out.println("Set is: " + integers.getClass());

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      System.out.println("Enter an int, to be tested for membership:");
      String line = br.readLine();
      if (line == null) {
        System.out.println("Goodbye!");
        break;
      }
      System.out.println("Set contains " + Integer.valueOf(line) + ": "
          + integers.contains(Integer.valueOf(line)));

    }


  }

}
