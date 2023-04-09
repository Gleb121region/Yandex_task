import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String params = in.nextLine();
        int n = Integer.parseInt(params.split(" ")[0]); // кол платформ
        int m = Integer.parseInt(params.split(" ")[1]); // кол добровольцев

        long[] platforms = new long[n];
        String[] s = in.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            platforms[i] = Long.parseLong(s[i]);
        }
        Arrays.sort(platforms);


        long[] peoples = new long[m];
        String[] t = in.nextLine().split(" ");
        for (int i = 0; i < m; i++) {
            peoples[i] = Long.parseLong(t[i]);
        }
        Arrays.sort(peoples);

        int i = 0, j = 0;
        long count = 0;
        while (i < n && j < m) {
            if (peoples[j] <= platforms[i] / 2) { // Если доброволец соответствует условиям безопасности на платформе
                count++;
                j++;
            }
            i++;
        }
        System.out.println(count);
    }
}