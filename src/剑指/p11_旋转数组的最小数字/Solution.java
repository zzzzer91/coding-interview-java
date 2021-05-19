package 剑指.p11_旋转数组的最小数字;

/**
 * https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 */
class Solution {
    public int minArray(int[] numbers) {
        int l = 0, r = numbers.length-1;
        while (l < r) {
            int m = l + ((r - l) >> 1);
            if (numbers[m] > numbers[r]) {
                l = m + 1;
            } else if (numbers[m] < numbers[r]) {
                r = m;
            } else {
                r--;
            }
        }
        return numbers[l];
    }
}