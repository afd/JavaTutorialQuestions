package package98e3;

public class OneFourTwoOne {

    public static void main(String[] args) {
        int currentNum = Integer.parseInt(args[0]);

        StringBuilder sb = new StringBuilder();
        sb.append(currentNum).append(" ");

        do {
            currentNum = nextInt(currentNum);
            sb.append(currentNum).append(" ");
        } while (currentNum != 1);

        System.out.println(sb);
    }

    private static int nextInt(int x) {
        if (x % 2 == 0) {
            return x / 2;
        } else {
            return 3 * x + 1;
        }
    }
}
