import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        int[] cnt0 = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            cnt0[i] = cnt0[i - 1] + (s.charAt(i - 1) == '0' ? 1 : 0);
        }

        boolean found;
        for (int R = 1; R <= n; R++) {
            found = false;
            for (int L = 1; L < R; L++) {
                int zeros = cnt0[R] - cnt0[L - 1];
                int ones = R - L + 1 - zeros;
                int med;
                if (zeros > ones) {
                    med = '0';
                } else if (ones > zeros) {
                    med = '1';
                } else { //когда zeros == ones
                    med = '2';
                }
                if (med == s.charAt(R - 1)) {
                    System.out.print(L + " ");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print("-1 ");
            }
        }
    }
}

