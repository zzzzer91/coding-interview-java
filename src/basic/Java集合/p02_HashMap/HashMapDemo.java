package basic.Java集合.p02_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 0);
        System.out.println(map.get("a"));
        map.put("{", null);
        System.out.println(map.get("{"));
        System.out.println(map.get("(")); // 不存在的 key 返回 null
        map.remove("(");
        System.out.println(map.size());
    }
}
