package tutorialquestions.question1aeb;

public class DoubleParser implements NumberParser<Double> {

  @Override
  public Double parseNumber(String string) {
    return Double.parseDouble(string);
  }

  @Override
  public String typeParsed() {
    return "double";
  }

}
