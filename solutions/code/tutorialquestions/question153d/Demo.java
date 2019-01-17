package tutorialquestions.question153d;

public class Demo {

  public static void main(String[] args) {

    try {

      try {

        try {

          try {

            switch (Integer.parseInt(args[0])) {

              case 0:
                throw new A();
              case 1:
                throw new B();
              case 2:
                throw new C();
              default:
                // Nothing.
            }

          } catch (C exception) {
            System.out.println(exception);
            throw exception;
          }

        } catch (B exception) {
          System.out.println(exception);
          throw exception;
        }
      } catch (A exception) {
        System.out.println(exception);
        throw exception;
      }

      System.out.println("No exception was thrown.");

    } catch (NumberFormatException exception) {
      System.out.println("The command-line argument you entered was not an integer!");
    } catch (Exception exception) {
      System.out.println("An exception was thrown: " + exception);
    } finally {
      System.out.println("All control-flow paths get to me!");
    }

  }

}
