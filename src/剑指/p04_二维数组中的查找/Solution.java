package 剑指.p04_二维数组中的查找;

class Solution {
    public boolean searchArray(int[][] array, int target) {
        int m = array.length;
        if (m == 0) {
            return false;
        }
        int n = array[0].length;
        for (int i = 0, j = n-1; i < n && j >= 0;) {
            int val = array[i][j];
            if (val < target) {
                i++;
            } else if (val > target) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }
}