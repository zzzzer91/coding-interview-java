package company.bytedance.找零;

import java.util.Scanner;

/**
 * https://www.acwing.com/problem/content/679/
 */
public class Main {
    public static int compute(int n) {
        int[] coins = {64, 16, 4, 1};
        n = 1024 - n;
        int res = 0;
        for (int coin : coins) {
            res += n / coin;
            n %= coin;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(compute(n));
    }
}