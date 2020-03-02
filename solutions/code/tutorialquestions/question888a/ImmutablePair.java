package tutorialquestions.question888a;

public class ImmutablePair<S, T> {

  private final S first;
  private final T second;

  public ImmutablePair(S first, T second) {
    this.first = first;
    this.second = second;
  }

  public S getFirst() {
    return first;
  }

  public T getSecond() {
    return second;
  }

  @Override
  public String toString() {
    return "(" + first.toString() + ", " + second.toString() + ")";
  }
}
