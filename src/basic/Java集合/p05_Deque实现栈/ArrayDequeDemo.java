package basic.Java集合.p05_Deque实现栈;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 不要用 Stack 类做栈，已经很古老了，用 ArrayDeque 代替
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        // 依次将三个元素push入"栈"
        stack.push("疯狂Java讲义");
        stack.push("轻量级Java EE企业应用实战");
        stack.push("疯狂Android讲义");
        // 输出：[疯狂Android讲义, 轻量级Java EE企业应用实战, 疯狂Java讲义]
        System.out.println(stack);
        // 访问第一个元素，但并不将其pop出"栈"，输出：疯狂Android讲义
        System.out.println(stack.peek());
        // 依然输出：[疯狂Android讲义, 疯狂Java讲义, 轻量级Java EE企业应用实战]
        System.out.println(stack);
        // pop出第一个元素，输出：疯狂Android讲义
        System.out.println(stack.pop());
        // 输出：[轻量级Java EE企业应用实战, 疯狂Java讲义]
        System.out.println(stack);
        // 判空
        System.out.println(stack.isEmpty());
    }
}
