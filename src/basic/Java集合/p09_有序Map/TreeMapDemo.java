package basic.Java集合.p09_有序Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("orange", 1);
        map.put("apple", 2);
        map.put("pear", 3);
        for (String key : map.keySet()) {
            System.out.println(key);
        }


        // 使用TreeMap时，放入的Key必须实现Comparable接口。
        // String、Integer这些类已经实现了Comparable接口，因此可以直接作为Key使用。
        // 作为 Value 的对象则没有任何要求。
        // 如果作为Key的class没有实现Comparable接口，那么，必须在创建TreeMap时同时指定一个自定义排序算法
        Map<Person, Integer> map2 = new TreeMap<>(new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        });
        map2.put(new Person("Tom"), 1);
        map2.put(new Person("Bob"), 2);
        map2.put(new Person("Lily"), 3);
        for (Person key : map2.keySet()) {
            System.out.println(key);
        }
        // {Person: Bob}, {Person: Lily}, {Person: Tom}
        System.out.println(map2.get(new Person("Bob"))); // 2

        // 注意到Comparator接口要求实现一个比较方法，它负责比较传入的两个元素a和b，
        // 如果a<b，则返回负数，通常是-1，如果a==b，则返回0，
        // 如果a>b，则返回正数，通常是1。
        // TreeMap内部根据比较结果对Key进行排序。
        Map<Student, Integer> map3 = new TreeMap<>(new Comparator<Student>() {
            public int compare(Student p1, Student p2) {
                // TreeMap在比较两个Key是否相等时，
                // 依赖Key的compareTo()方法或者Comparator.compare()方法。
                // 在两个Key相等时，必须返回0
                if (p1.score == p2.score) {
                    return 0;
                }
                return p1.score > p2.score ? -1 : 1;
            }
        });
        map3.put(new Student("Tom", 77), 1);
        map3.put(new Student("Bob", 66), 2);
        map3.put(new Student("Lily", 99), 3);
        for (Student key : map3.keySet()) {
            System.out.println(key);
        }
        System.out.println(map3.get(new Student("Bob", 66))); // null?
    }

    static private class Person {
        public String name;
        Person(String name) {
            this.name = name;
        }
        public String toString() {
            return "{Person: " + name + "}";
        }
    }

    static private class Student {
        public String name;
        public int score;
        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
        public String toString() {
            return String.format("{%s: score=%d}", name, score);
        }
    }

}
