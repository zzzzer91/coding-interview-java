package bytedance.剪绳子;

import java.util.Scanner;

/**
 * https://www.acwing.com/problem/content/682/
 *
 * 使用二分法
 */
public class Main {
    private static boolean check(int[] ropes, int m, double len) {
        int count = 0;
        for (int rope : ropes) {
            count += rope / len;
            if (count >= m) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[] ropes = new int[n];
        for (int i = 0; i < n; i++) {
            ropes[i] = in.nextInt();
        }
        int maxLen = ropes[0];
        for (int i = 1; i < n; i++) {
            if (maxLen < ropes[i]) {
                maxLen = ropes[i];
            }
        }
        double l = 0, r = maxLen;
        while (r - l > 1e-4) {
            double mid = (l + r) / 2;
            if (check(ropes, m, mid)) {
                l = mid;
            } else {
                r = mid;
            }

        }
        System.out.printf("%.2f\n", l);
    }
}