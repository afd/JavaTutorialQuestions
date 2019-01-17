package tutorialquestions.question9a9b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhysicalTune extends AbstractTune {

  private List<TuneElement> tuneElements;

  public PhysicalTune() {
    tuneElements = new ArrayList<TuneElement>();
  }

  @Override
  public void addTuneElement(TuneElement tuneElement) {
    tuneElements.add(tuneElement);
  }

  @Override
  public Iterator<TuneElement> iterator() {
    return tuneElements.iterator();
  }

}
