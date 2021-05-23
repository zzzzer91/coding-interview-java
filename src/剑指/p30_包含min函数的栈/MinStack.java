package 剑指.p30_包含min函数的栈;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/
 */
class MinStack {
    private final Deque<Integer> stack1;
    private final Deque<Integer> stack2;

    /** initialize your data structure here. */
    public MinStack() {
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }

    public void push(int x) {
        if (stack1.isEmpty() || x <= stack1.peek()) {
            stack1.push(x);
        }
        stack2.push(x);
    }

    public void pop() {
        int val = stack2.pop();
        if (val == stack1.peek()) {
            stack1.pop();
        }
    }

    public int top() {
        return stack2.peek();
    }

    public int min() {
        return stack1.peek();
    }
}
