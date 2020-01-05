package bytedance.特征提取;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.acwing.com/problem/content/731/
 *
 * 双 HashMap，一个存连续次数，一个存上一次出现帧
 */
public class Main {
    private static class Feature {
        int x, y;
        Feature(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public int hashCode() {
            return (this.x + "," + this.y).hashCode();
        }
        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Feature)) {
                return false;
            }
            Feature f = (Feature)obj;
            return f.x == this.x && f.y == this.y;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Feature, Integer> counts = new HashMap<>();
        Map<Feature, Integer> Shows = new HashMap<>();
        int res = 0;
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                Feature f = new Feature(in.nextInt(), in.nextInt());
                if (Shows.containsKey(f) && Shows.get(f) == i-1) {
                    int v = counts.get(f) + 1;
                    counts.put(f, v);
                    res = Math.max(res, v);
                } else {
                    counts.put(f, 1);
                }
                Shows.put(f, i);
            }
        }
        System.out.println(res);
    }
}
