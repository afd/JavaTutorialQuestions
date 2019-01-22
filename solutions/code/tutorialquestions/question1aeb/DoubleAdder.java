package tutorialquestions.question1aeb;

public class DoubleAdder implements NumberAdder<Double> {

  @Override
  public Double add(Double first, Double second) {
    return first + second;
  }

  @Override
  public Double zero() {
    return 0.0;
  }

}
