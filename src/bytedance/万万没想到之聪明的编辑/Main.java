package bytedance.万万没想到之聪明的编辑;

import java.util.Scanner;

/**
 * https://www.acwing.com/problem/content/680/
 */
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");
        int n = in.nextInt();
        while (n > 0) {
            char[] s = in.next().toCharArray();
            int k = 0;
            for (int i = 0; i < s.length; i++) {
                char c = s[i];
                if (k >= 2 && c == s[k-1] && s[k-1] == s[k-2]) {
                    continue;
                }
                if (k >= 3 && c == s[k-1] && s[k-2] == s[k-3]) {
                    continue;
                }
                s[k++] = c;
            }
            System.out.println(new String(s, 0, k));
            n--;
        }
    }
}
