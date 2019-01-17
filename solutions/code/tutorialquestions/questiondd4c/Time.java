package tutorialquestions.questiondd4c;

public class Time {

  private final int hour;
  private final int minute;
  private final int second;

  public Time(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;

    assert hour >= 0 && hour < 24
        && minute >= 0 && minute < 60
        && second >= 0 && second < 60;

  }

  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public int getSecond() {
    return second;
  }

  public int getSecondsSinceMidnight() {
    return (60 * hour + minute) * 60 + second;
  }

  public Time nextSecond() {
    int newSecond = second;
    int newMinute = minute;
    int newHour = hour;

    newSecond++;
    if (newSecond == 60) {
      newSecond = 0;
      newMinute++;
      if (newMinute == 60) {
        newMinute = 0;
        newHour++;
        if (newHour == 24) {
          newHour = 0;
        }
      }
    }
    return new Time(newHour, newMinute, newSecond);
  }

}
