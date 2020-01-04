package bytedance.变身程序员;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

/**
 * https://www.acwing.com/problem/content/730/
 *
 * 广度搜索
 */
class Main {
    private static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static final int N = 10;
    private static int[][] grid = new int[N][N];
    private static int[][] time = new int[N][N];
    private static int rowNum = 0, colNum = 0;
    private static Point[] directions = new Point[4];
    static {
        directions[0] = new Point(0, -1);
        directions[1] = new Point(0, 1);
        directions[2] = new Point(-1, 0);
        directions[3] = new Point(1, 0);
    }

    public static int bfs() {
        Queue<Point> queue = new LinkedList<>();

        for (int[] t : time) {
            Arrays.fill(t, -1);
        }

        // 把所有程序员起始时间设为 0
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (grid[i][j] == 2) {
                    time[i][j] = 0;
                    queue.add(new Point(j, i));
                }
            }
        }

        // 广度，扩散
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int minutes = time[p.y][p.x];
            for (Point d : directions) {
                int x = p.x + d.x;
                int y = p.y + d.y;
                if (x >= 0 && x < colNum && y >= 0 && y < rowNum
                    && time[y][x] == -1 && grid[y][x] != 0) {
                    time[y][x] = minutes + 1;
                    queue.add(new Point(x, y));
                }
            }
        }

        int res = 0;
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (grid[i][j] == 1) {
                    if (time[i][j] == -1) {
                        return -1;
                    }
                    res = Math.max(res, time[i][j]);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");
        // 读取
        while (in.hasNext()) {
            String line = in.next();
            String[] temp = line.split(" ");
            colNum = temp.length;
            for (int i = 0; i < colNum; i++) {
                grid[rowNum][i] = Integer.parseInt(temp[i]);
            }
            rowNum++;
        }

        System.out.println(bfs());
    }
}