package basic.Java集合.p03_HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // Set 集合存和取的顺序不一致。
        Set<String> set = new HashSet<>();
        // 添加
        set.add("世界军事");
        set.add("兵器知识");
        set.add("舰船知识");
        set.add("汉和防务");
        // 删除
        set.remove("汉和防务");
        // 大小
        System.out.println(set.size());
        // 打印
        for (String e : set) {
            System.out.println(e);
        }
    }
}
