package tutorialquestions.question6346;

public class LiteralExpr implements Expr {

  private final int value;

  public LiteralExpr(int value) {
    this.value = value;
  }

  @Override
  public int eval() {
    return value;
  }

  @Override
  public int literalCount() {
    return 1;
  }

  @Override
  public int depth() {
    return 0;
  }

}
