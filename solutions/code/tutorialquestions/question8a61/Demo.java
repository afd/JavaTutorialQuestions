package tutorialquestions.question8a61;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

  public static IntSet readIntegers(int numIntegers) throws IOException {

    IntSet result = (numIntegers > 10 ? new MemoryEfficientIntSet() : new SpeedEfficientIntSet());

    BufferedReader br = new BufferedReader(
        new InputStreamReader(
            System.in
        )
    );

    for (int i = 0; i < numIntegers; i++) {
      System.out.println("Please enter an int:");
      result.add(Integer.parseInt(br.readLine()));
    }

    return result;
  }

  public static void main(String[] args) throws IOException {

    IntSet integers = readIntegers(Integer.parseInt(args[0]));

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
          + integers.contains(Integer.parseInt(line)));

    }


  }

}
