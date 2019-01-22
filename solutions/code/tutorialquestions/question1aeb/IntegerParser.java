package tutorialquestions.question1aeb;

public class IntegerParser implements NumberParser<Integer> {

  @Override
  public Integer parseNumber(String string) {
    return Integer.parseInt(string);
  }

  @Override
  public String typeParsed() {
    return "int";
  }

}
