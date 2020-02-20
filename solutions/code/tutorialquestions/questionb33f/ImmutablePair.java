package tutorialquestions.questionb33f;

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

}
