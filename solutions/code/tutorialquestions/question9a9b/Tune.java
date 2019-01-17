package tutorialquestions.question9a9b;

public interface Tune extends Iterable<TuneElement> {

  void addTuneElement(TuneElement tuneElement);

  Tune transpose(int interval);

}
