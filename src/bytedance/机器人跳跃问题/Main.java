package bytedance.机器人跳跃问题;

import java.util.Scanner;

/**
 * https://www.acwing.com/problem/content/732/
 */
public class Main {
    private static int findMaxheight(int[] heights) {
        int res = 0;
        for (int h : heights) {
            res = Math.max(res, h);
        }
        return res;
    }

    private static boolean check(int[] heights, int maxHeight, int e) {
        for (int h : heights) {
            e = e * 2 - h;
            if (e < 0) {
                return false;
            }
            // e >= maxHeight 时，能量肯定够用了
            if (e >= maxHeight) {
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = in.nextInt();
        }

        int maxHeight = findMaxheight(heights);

        int l = 0, r = maxHeight;
        while (l < r) {
            int mid = l + r >> 1;
            if (check(heights, maxHeight,mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(l);
    }
}
