package tutorialquestions.question1aeb;

public class IntegerAdder implements NumberAdder<Integer> {

  @Override
  public Integer add(Integer first, Integer second) {
    return first + second;
  }

  @Override
  public Integer zero() {
    return 0;
  }

}
