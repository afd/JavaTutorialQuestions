package tutorialquestions.questionf79b;

public class PerfectPalindromicCubes {

  private static boolean isPalindrome(String number) {
    if (number.length() == 0 || number.length() == 1) {
      return true;
    }

    return number.charAt(0) == number.charAt(number.length() - 1)
        && isPalindrome(number.substring(1, number.length() - 1));
  }

  /**
   * Perfect palindromic cubes test harness.
   */
  public static void main(String[] args) {

    for (int nextCubeRoot = 0; nextCubeRoot < 2000; nextCubeRoot++) {
      String cubeAsString = String.valueOf(nextCubeRoot * nextCubeRoot * nextCubeRoot);
      if (isPalindrome(cubeAsString)) {
        System.out.println(nextCubeRoot + " cubed is " + cubeAsString);
      }
    }

  }


}