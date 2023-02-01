package HJ10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        char[] arr = line.toCharArray();
        Set<Character> s = new HashSet<>();
        for (char c : arr) {
            s.add(c);
        }
        System.out.print(s.size());
    }
}
