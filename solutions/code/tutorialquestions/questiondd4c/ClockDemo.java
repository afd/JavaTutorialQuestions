package tutorialquestions.questiondd4c;

public class ClockDemo {


  public static void main(String[] args) throws InterruptedException {

    Clock clock1 = new Clock(0);

    Clock clock2 = new Clock(23, 59, 53);

    for (int i = 0; i < 100000; i++) {

      System.out.println("Clock 1 shows: " + clock1 + ".  Clock 2 shows: " + clock2);

      clock1.tick();
      clock2.tick();

      Thread.sleep(1000);

    }

  }
}
