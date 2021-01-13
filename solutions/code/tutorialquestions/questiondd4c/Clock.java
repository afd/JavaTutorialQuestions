package tutorialquestions.questiondd4c;

public class Clock {

  // Clocks are represented canonically using seconds since midnight
  protected int secondsSinceMidnight;

  private final DisplayMode displayMode;

  protected static final int SECONDS_IN_A_MINUTE = 60;
  private static final int MINUTES_IN_AN_HOUR = 60;
  private static final int HOURS_IN_A_DAY = 24;
  private static final int SECONDS_IN_AN_HOUR = MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE;
  protected static final int SECONDS_IN_A_DAY = HOURS_IN_A_DAY * SECONDS_IN_AN_HOUR;

  private Clock(int secondsSinceMidnight, DisplayMode displayMode) {
    this.secondsSinceMidnight = secondsSinceMidnight;
    this.displayMode = displayMode;
  }

  public Clock(int secondsSinceMidnight) {
    this(secondsSinceMidnight, DisplayMode.SecondsSinceMidnight);
  }

  public Clock(int hh, int mm, int ss) {
    this(twentyFourHourToSecondsSinceMidnight(hh, mm, ss), DisplayMode.TwentyFourHour);
  }

  protected static int twentyFourHourToSecondsSinceMidnight(int hh, int mm,
      int ss) {
    return 60 * (60 * hh + mm) + ss;
  }

  public void tick() {
    secondsSinceMidnight = (secondsSinceMidnight + 1) % SECONDS_IN_A_DAY;
  }

  @Override
  public String toString() {

    if (displayMode == DisplayMode.SecondsSinceMidnight) {
      return secondsSinceMidnight + " seconds since midnight";
    }

    int hh = secondsSinceMidnight / SECONDS_IN_AN_HOUR;

    int mm = (secondsSinceMidnight - hh * SECONDS_IN_AN_HOUR) / SECONDS_IN_A_MINUTE;

    int ss = secondsSinceMidnight % SECONDS_IN_A_MINUTE;

    return padding(hh) + hh + ":"
        + padding(mm) + mm + ":"
        + padding(ss) + ss;
  }


  private static String padding(int x) {
    return x < 10 ? "0" : "";
  }


}
