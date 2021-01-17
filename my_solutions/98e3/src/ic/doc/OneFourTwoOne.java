package ic.doc;

public class OneFourTwoOne {

    static int nextInt(int x) {
        if (x % 2 == 0) {
            return x / 2;
        } else {
            return 3 * x + 1;
        }
    }

    public static void main(String[] args) {
        final int integerVersionOfFirstArgument = Integer.parseInt(args[0]);
        int temp = integerVersionOfFirstArgument;

        StringBuilder sb = new StringBuilder();
        sb.append(temp + " ");

        do {
            temp = nextInt(temp);
            sb.append(temp + " ");
        } while (temp != 1);

        System.out.println(sb);
    }
}
