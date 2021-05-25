package basic.Java集合.p06_双端数组队列;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();
        // offer 将元素从尾部加入队列，等同于 add
        queue.offer("疯狂Java讲义");
        queue.offer("轻量级Java EE企业应用实战");
        // offerFirst 将元素从头部加入队列，等同于 addFirst
        queue.offerFirst("疯狂Android讲义");
        // 输出：[疯狂Android讲义，疯狂Java讲义, 轻量级Java EE企业应用实战]
        System.out.println(queue);
        // 访问队列头部的元素，但并不将其弹出队列，输出：疯狂Android讲义
        System.out.println(queue.peek());
        // 访问队列尾部的元素，但并不将其弹出队列，输出：轻量级Java EE企业应用实战
        System.out.println(queue.peekLast());
        // 弹出第一个元素，输出：疯狂Android讲义
        System.out.println(queue.poll());
        // 弹出最后一个元素，输出：轻量级Java EE企业应用实战
        System.out.println(queue.pollLast());
        // 输出：[疯狂Java讲义]
        System.out.println(queue);
    }
}
