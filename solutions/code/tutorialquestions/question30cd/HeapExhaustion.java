package tutorialquestions.question30cd;

import java.util.ArrayList;
import java.util.List;

public class HeapExhaustion {

  public static void main(String[] args) {

    List<Integer> infiniteList = new ArrayList<Integer>();

    try {
      while (true) {
        infiniteList.add(new Integer(0));
      }
    } catch (OutOfMemoryError exception) {
      System.out.println("Length of list before memory exhausted: " + infiniteList.size());
    }

  }

}
