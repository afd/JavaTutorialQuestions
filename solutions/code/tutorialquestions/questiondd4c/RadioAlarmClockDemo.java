package tutorialquestions.questiondd4c;

public class RadioAlarmClockDemo {

  public static void main(String[] args) throws InterruptedException {

    RadioAlarmClock clock1 = new RadioAlarmClock(23, 59, 50, 23, 59, 58, RadioStation.None);
    RadioAlarmClock clock2 = new RadioAlarmClock(23, 59, 50, 23, 59, 58, RadioStation.Radio4);
    RadioAlarmClock clock3 = new RadioAlarmClock(23, 59, 50, 23, 59, 58, RadioStation.FiveLive);

    for (int i = 0; i < 1000; i++) {
      System.out.println("Clocks say: " + clock1 + " - " + clock2 + " - " + clock3);
      clock1.tick();
      clock2.tick();
      clock3.tick();
      Thread.sleep(100);
    }


  }

}
