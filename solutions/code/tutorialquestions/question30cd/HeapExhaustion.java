package tutorialquestions.question30cd;

import java.util.ArrayList;
import java.util.List;

public class HeapExhaustion {

  public static void main(String[] args) {

    final List<Integer> infiniteList = new ArrayList<>();

    try {
      //noinspection InfiniteLoopStatement
      while (true) {
        infiniteList.add(0);
      }
    } catch (OutOfMemoryError exception) {
      System.out.println("Length of list before memory exhausted: " + infiniteList.size());
    }

  }

}
