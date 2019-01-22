package tutorialquestions.question9a9b;

public class Demo {

  /**
   * Tune example.
   */
  public static void main(String[] args) {

    final Tune frereJaques = new PhysicalTune();
    final Tune frereJaquesTransposedUp = frereJaques.transpose(3);
    final Tune frereJaquesTransposedUpAnotherOctave = frereJaquesTransposedUp.transpose(12);

    frereJaques.addTuneElement(new Note(NoteName.C, 4, NoteValue.QUARTER));
    frereJaques.addTuneElement(new Note(NoteName.D, 4, NoteValue.QUARTER));
    frereJaques.addTuneElement(new Note(NoteName.E, 4, NoteValue.QUARTER));
    frereJaques.addTuneElement(new Note(NoteName.C, 4, NoteValue.QUARTER));
    frereJaques.addTuneElement(new Note(NoteName.C, 4, NoteValue.QUARTER));
    frereJaques.addTuneElement(new Note(NoteName.D, 4, NoteValue.QUARTER));
    frereJaques.addTuneElement(new Note(NoteName.E, 4, NoteValue.QUARTER));
    frereJaques.addTuneElement(new Note(NoteName.C, 4, NoteValue.QUARTER));

    frereJaques.addTuneElement(new Note(NoteName.E, 4, NoteValue.QUARTER));
    frereJaques.addTuneElement(new Note(NoteName.F, 4, NoteValue.QUARTER));
    frereJaques.addTuneElement(new Note(NoteName.G, 4, NoteValue.HALF));

    frereJaques.addTuneElement(new Note(NoteName.E, 4, NoteValue.QUARTER));
    frereJaques.addTuneElement(new Note(NoteName.F, 4, NoteValue.QUARTER));
    frereJaques.addTuneElement(new Note(NoteName.G, 4, NoteValue.HALF));

    frereJaques.addTuneElement(new Note(NoteName.G, 4, NoteValue.EIGHTH));
    frereJaques.addTuneElement(new Note(NoteName.A, 4, NoteValue.EIGHTH));
    frereJaques.addTuneElement(new Note(NoteName.G, 4, NoteValue.EIGHTH));
    frereJaques.addTuneElement(new Note(NoteName.F, 4, NoteValue.EIGHTH));
    frereJaques.addTuneElement(new Note(NoteName.E, 4, NoteValue.QUARTER));
    frereJaques.addTuneElement(new Note(NoteName.C, 4, NoteValue.QUARTER));

    frereJaques.addTuneElement(new Note(NoteName.G, 4, NoteValue.EIGHTH));
    frereJaques.addTuneElement(new Note(NoteName.A, 4, NoteValue.EIGHTH));
    frereJaques.addTuneElement(new Note(NoteName.G, 4, NoteValue.EIGHTH));
    frereJaques.addTuneElement(new Note(NoteName.F, 4, NoteValue.EIGHTH));
    frereJaques.addTuneElement(new Note(NoteName.E, 4, NoteValue.QUARTER));
    frereJaques.addTuneElement(new Note(NoteName.C, 4, NoteValue.QUARTER));

    frereJaques.addTuneElement(new Note(NoteName.C, 4, NoteValue.QUARTER));
    frereJaques.addTuneElement(new Note(NoteName.G, 3, NoteValue.QUARTER));
    frereJaques.addTuneElement(new Note(NoteName.C, 4, NoteValue.QUARTER));
    frereJaques.addTuneElement(new Rest(NoteValue.QUARTER));

    frereJaques.addTuneElement(new Note(NoteName.C, 4, NoteValue.QUARTER));
    frereJaques.addTuneElement(new Note(NoteName.G, 3, NoteValue.QUARTER));
    frereJaques.addTuneElement(new Note(NoteName.C, 4, NoteValue.QUARTER));
    frereJaques.addTuneElement(new Rest(NoteValue.QUARTER));

    System.out.println("Frere Jaques:\n  " + frereJaques);
    System.out.println("Frere Jaques up three semitones:\n  " + frereJaquesTransposedUp);
    System.out
        .println("Frere Jaques up another octave:\n  " + frereJaquesTransposedUpAnotherOctave);
  }

}
