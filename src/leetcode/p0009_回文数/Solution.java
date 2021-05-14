package leetcode.p0009_回文数;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int pNum = 0;
        int temp = x;
        while (temp != 0) {
            pNum = pNum * 10 + temp % 10;
            temp /= 10;
        }
        return pNum == x;
    }
}