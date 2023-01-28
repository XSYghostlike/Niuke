package HJ9;

import java.util.Scanner;
import java.util.HashSet;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> s = new HashSet<>();
        int num = in.nextInt();
        while (num > 0) {
            Integer digit = num % 10;
            num = num / 10;
            if (! s.contains(digit)) {
                System.out.print(digit);
                s.add(digit);
            }
        }
    }
}
