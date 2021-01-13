package tutorialquestions.questiondd4c;

public class RadioAlarmClock extends AlarmClock {

  private final RadioStation station;

  public RadioAlarmClock(int time, int alarm, RadioStation station) {
    super(time, alarm);
    this.station = station;
  }

  public RadioAlarmClock(int hh, int mm, int ss, int hhAlarm, int mmAlarm, int ssAlarm,
      RadioStation station) {
    super(hh, mm, ss, hhAlarm, mmAlarm, ssAlarm);
    this.station = station;
  }

  @Override
  protected String beep() {
    if (station == RadioStation.None) {
      return super.beep();
    } else {
      return station.getNoise();
    }
  }

}
