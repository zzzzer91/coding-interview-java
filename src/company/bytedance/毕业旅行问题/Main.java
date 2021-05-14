package company.bytedance.毕业旅行问题;

import java.util.Scanner;

/**
 * https://www.acwing.com/activity/content/problem/content/752/1/
 *
 * 状态压缩 dp，最短 Hamilton 路径
 */
public class Main {
    public static int compute(int[][] cost, int n) {
        // 把已访问城市的状态保存到一个 int 中，用二进制位表示 boolean 状态，
        // m 是这个状态的 int 上限
        final int m = 1 << n;
        // 1、定义状态数组 dp
        // dp 含义为，在 i 状态下（这个状态中，j 已经置为 1），位于 j 城市的最小花费
        // 刚开始位于北京时，i = 0，即不计入状态，dp[0] 没用到
        int[][] dp = new int[m][n];
        // 2、初始化状态
        for (int i = 0; i < n; i++) {
            dp[1<<i][i] = cost[0][i];
        }
        // 3、状态转移
        for (int i = 2; i < m; i++) {
            // 过滤一些不可能状态，如：
            // 1、状态中只有 1 位为 1，这部分已经初始化过了
            // 2、状态第一位只有最后才会被置 1
            if ((i & (i - 1)) > 0 && ((i & 1) == 0 || i == m -1)) {
                for (int j = 0; j < n; j++) {
                    // 只需要计算访问过的城市
                    // 还能优化，i = m - 1 时，只需要计算 j = 0 的清空
                    if ((i >> j & 1) > 0) {
                        // 把当前位于的城市二进制状态置为 0，获得上一次的状态
                        int preStatus = i - (1 << j);
                        // 找到上一状态到当前城市的最小值
                        int min = Integer.MAX_VALUE;
                        for (int k = 0; k < n; k++) {
                            // 计算剩下的城市
                            if ((preStatus >> k & 1) > 0) {
                                min = Math.min(min, dp[preStatus][k] + cost[j][k]);
                            }
                        }
                        dp[i][j] = min;
                    }
                }
            }
        }
        // 获取最终状态下位于 0 城市的最小值，m - 1 是最终状态
        return dp[m-1][0];
    }

    public static void main(String[] args) {
        // 读取输入
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 1) {
            System.out.println(0);
            return;
        }
        int[][] cost = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = in.nextInt();
            }
        }
        System.out.println(compute(cost, n));
    }
}
