package tutorialquestions.question9a9b;

public abstract class AbstractTune implements Tune {

  @Override
  public final Tune transpose(int interval) {
    return new TransposedTune(this, interval);
  }

  @Override
  public String toString() {
    String result = "";
    boolean first = true;
    for (TuneElement t : this) {
      if (first) {
        first = false;
      } else {
        result += " ";
      }
      result += t;
    }
    return result;
  }

}
