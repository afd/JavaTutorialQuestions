package tutorialquestions.questiondd4c;

public class AlarmClockDemo {

  /**
   * Demo of how to use the alarm clock.
   */
  public static void main(String[] args) throws InterruptedException {

    AlarmClock clock = new AlarmClock(23, 59, 50, 23, 59, 58);

    for (int i = 0; i < 1000; i++) {
      System.out.println("Clock says: " + clock);
      clock.tick();
      Thread.sleep(1000);
    }


  }

}
