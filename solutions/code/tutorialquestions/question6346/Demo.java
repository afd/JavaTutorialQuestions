package tutorialquestions.question6346;

public class Demo {

  public static void main(String[] args) {

    Expr firstSub = new AddExpr(
        new LiteralExpr(1),
        new FactExpr(new AddExpr(new LiteralExpr(2), new LiteralExpr(3)))
    );
    Expr secondSub = new MulExpr(
        new LiteralExpr(3),
        new LiteralExpr(4)
    );

    Expr expr = new MulExpr(firstSub, secondSub);

    System.out.println("Evaluates to: " + expr.eval());
    System.out.println("Literal count: " + expr.literalCount());
    System.out.println("Depth: " + expr.depth());

  }

}
