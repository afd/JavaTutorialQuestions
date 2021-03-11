package tutorialquestions.questiond363.afterfixingandrefactoring;

public class Date {

  private final int day;
  private final int month;
  private final int year;

  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public boolean isValid() {

    if (year < 0 || day < 1) {
      return false;
    }
    
    return switch (month) {
      case 2                     -> day <= (isLeapYear() ? 29 : 28);
      case 4, 6, 9, 11           -> day <= 30;
      case 1, 3, 5, 7, 8, 10, 12 -> day <= 31;
      default                    -> false;
    };
  }

  private boolean isLeapYear() {
    // Deliberately simplified version of
    // leap year calculation
    return (year % 4 == 0);
  }

  @Override
  public String toString() {
    return day + "/" + month + "/" + year;
  }

}
