package tutorialquestions.questiona6e7.anonymousinnerclasses;

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

    final int firstSize = Integer.parseInt(args[0]);
    final int secondSize = Integer.parseInt(args[1]);

    System.out.println("Reading first set, of size " + firstSize + ":");

    IntSet set1 = readIntegers(firstSize);

    System.out.println("Reading second set, of size " + secondSize + ":");

    IntSet set2 = readIntegers(secondSize);

    System.out.println("First set is " + set1);

    System.out.println("Second set is " + set2);

    System.out.println("First set contains second set: " + set1.contains(set2));

    System.out.println("Second set contains first set: " + set2.contains(set1));

    set1.addAll(set2);

    System.out.println("Their union: " + set1);

    set1.removeAll(set2);

    System.out.println("First set minus second set: " + set1);

  }

}
