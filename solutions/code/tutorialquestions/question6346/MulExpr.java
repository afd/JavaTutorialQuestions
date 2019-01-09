package tutorialquestions.question6346;

public class MulExpr implements Expr {

  private Expr lhs;
  private Expr rhs;

  public MulExpr(Expr lhs, Expr rhs) {
    this.lhs = lhs;
    this.rhs = rhs;
  }

  @Override
  public int eval() {
    return lhs.eval() * rhs.eval();
  }

  @Override
  public int literalCount() {
    return lhs.literalCount() + rhs.literalCount();
  }

  @Override
  public int depth() {
    return 1 + Math.max(lhs.depth(), rhs.depth());
  }

}
