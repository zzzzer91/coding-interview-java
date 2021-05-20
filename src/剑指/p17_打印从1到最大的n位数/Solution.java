package 剑指.p17_打印从1到最大的n位数;

/**
 * https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 */
class Solution {
    public int[] printNumbers(int n) {
        int count = (int)Math.pow(10, n) - 1;
        int[] res = new int[count];
        for (int i = 0; i < count; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
