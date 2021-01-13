package tutorialquestions.question6346;

public class FactExpr implements Expr {

  private final Expr operand;

  public FactExpr(Expr operand) {
    this.operand = operand;
  }

  @Override
  public int eval() {
    int value = operand.eval();
    if (value < 0) {
      throw new RuntimeException("Negative factorial undefined");
    }
    int result = 1;
    while (value > 1) {
      result *= value;
      value--;
    }
    return result;
  }

  @Override
  public int literalCount() {
    return operand.literalCount();
  }

  @Override
  public int depth() {
    return 1 + operand.depth();
  }

}
