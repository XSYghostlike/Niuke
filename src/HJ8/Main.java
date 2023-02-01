package HJ8;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> m = new TreeMap<>();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i=0;i<num;i++) {
            Integer index = in.nextInt();
            Integer value = in.nextInt();
            if (m.containsKey(index)) {
                m.put(index,  m.get(index) + value);
            } else {
                m.put(index,  value);
            }
        }
        for (Map.Entry<Integer, Integer> s : m.entrySet()) {
            System.out.print(s.getKey());
            System.out.print(" ");
            System.out.println(s.getValue());
        }
    }
}
