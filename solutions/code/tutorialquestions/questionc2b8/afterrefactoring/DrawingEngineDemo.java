package tutorialquestions.questionc2b8.afterrefactoring;

public class DrawingEngineDemo {

  public static void main(String[] args) {

    DrawingEngine engine = new DrawingEngine();

    engine.addRectangle(new Rectangle(new Point(0, 0), 10, 20));
    engine.addRectangle(new Rectangle(new Point(2, 2), 100, 1));
    engine.addRectangle(new Rectangle(new Point(50, 10), 22, 22));

    System.out.println(engine);

    System.out.println("Max area of these rectangles is " + engine.maxArea());

    Rectangle r1 = new Rectangle(new Point(5, 5), 10, 20);
    Rectangle r2 = new Rectangle(new Point(2, 2), 15, 25);

    System.out.println("Rectangle " + r2 + " contains " + r1 + ": " + r2.contains(r1));

  }


}
