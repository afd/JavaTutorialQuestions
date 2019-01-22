package tutorialquestions.question7e2a;

public class StackOverflow {

  public static int overflow(int call) {

    try {
      return overflow(call + 1);
    } catch (StackOverflowError exception) {
      return call;
    }

  }

  public static void main(String[] args) {

    int numberOfCalls = overflow(0);
    System.out.println(
        "Number of recurseive calls to 'overflow' before stack overflow: " + numberOfCalls);

  }

}
