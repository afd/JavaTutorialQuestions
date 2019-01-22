package tutorialquestions.question1aeb;

public interface NumberParser<E extends Number> {

  E parseNumber(String string);

  String typeParsed();

}
