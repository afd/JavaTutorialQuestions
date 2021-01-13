package tutorialquestions.question9a9b;

import java.util.Iterator;

public class TransposedTune extends AbstractTune {

  private final Tune originalTune;
  private final int interval;

  TransposedTune(Tune originalTune, int interval) {
    this.originalTune = originalTune;
    this.interval = interval;
  }

  @Override
  public void addTuneElement(TuneElement tuneElement) {
    if (tuneElement instanceof Note) {
      originalTune.addTuneElement(
          noteFromAbsolutePitch(
              noteToAbsolutePitch(
                  (Note) tuneElement) - interval,
              tuneElement.getValue()
          )
      );

    } else {
      originalTune.addTuneElement(tuneElement);
    }

  }

  @Override
  public Iterator<TuneElement> iterator() {

    return new TransposedTuneIterator();

  }


  private static int noteToAbsolutePitch(Note note) {
    return NoteName.values().length * note.getOctave() + note.getName().ordinal();
  }

  private static Note noteFromAbsolutePitch(int pitch, NoteValue value) {
    NoteName newNoteName = NoteName.values()[pitch % NoteName.values().length];
    int newOctave = pitch / NoteName.values().length;

    return new Note(newNoteName, newOctave, value);
  }

  private class TransposedTuneIterator implements Iterator<TuneElement> {

    private final Iterator<TuneElement> originalTuneIterator;

    private TransposedTuneIterator() {
      originalTuneIterator = originalTune.iterator();
    }

    @Override
    public boolean hasNext() {
      return originalTuneIterator.hasNext();
    }

    @Override
    public TuneElement next() {

      TuneElement originalTuneNext = originalTuneIterator.next();

      if (originalTuneNext instanceof Rest) {
        return originalTuneNext;
      }

      return noteFromAbsolutePitch(noteToAbsolutePitch((Note) originalTuneNext) + interval,
          originalTuneNext.getValue());
    }

    @Override
    public void remove() {
      originalTuneIterator.remove();
    }

  }

}
