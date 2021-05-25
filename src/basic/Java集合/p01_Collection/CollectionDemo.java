package basic.Java集合.p01_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        // 添加元素
        c.add("孙悟空");
        System.out.println(c);

        Collection<String> books = new HashSet<>();
        books.add("hello");
        books.add("你好");
        books.add("不好");

        // 调用 forEach() 方法遍历集合
        books.forEach(obj -> System.out.println("迭代元素集合：" + obj));
    }
}
