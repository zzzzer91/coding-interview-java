package 剑指.p09_用两个栈实现队列;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 */
class CQueue {
    final private Deque<Integer> stack1;
    final private Deque<Integer> stack2;

    public CQueue() {
        this.stack1 = new ArrayDeque<>();
        this.stack2 = new ArrayDeque<>();
    }

    public void appendTail(int value) {
        this.stack1.push(value);
    }

    public int deleteHead() {
        if (this.stack2.isEmpty()) {
            if (this.stack1.isEmpty()) return -1;
            while (!this.stack1.isEmpty()) {
                this.stack2.push(stack1.pop());
            }
        }
        return this.stack2.pop();
    }
}