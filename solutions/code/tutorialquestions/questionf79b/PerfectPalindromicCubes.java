package tutorialquestions.questionf79b;

public class PerfectPalindromicCubes {

  private static boolean isPalindrome(String s) {
    if (s.length() == 0 || s.length() == 1) {
      return true;
    }

    return s.charAt(0) == s.charAt(s.length() - 1)
        && isPalindrome(s.substring(1, s.length() - 1));
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