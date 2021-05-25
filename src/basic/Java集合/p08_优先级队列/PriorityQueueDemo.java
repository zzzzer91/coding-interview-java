package basic.Java集合.p08_优先级队列;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // 默认是小根堆，实现大根堆需要重写一下比较器。
        Queue<Integer> pq = new PriorityQueue<>((v1, v2) -> v2 - v1);
        // 下面代码依次向 pq 中加入四个元素
        pq.offer(6);
        pq.offer(-3);
        pq.offer(20);
        pq.offer(18);
        // 输出 pq 队列，并不是按元素的加入顺序排列
        System.out.println(pq);
        // 访问队列第一个元素，即堆顶元素
        System.out.println(pq.poll());
    }
}
