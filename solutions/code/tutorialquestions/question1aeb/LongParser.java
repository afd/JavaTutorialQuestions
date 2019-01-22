package tutorialquestions.question1aeb;

public class LongParser implements NumberParser<Long> {

  @Override
  public Long parseNumber(String string) {
    return Long.parseLong(string);
  }

  @Override
  public String typeParsed() {
    return "long";
  }

}
