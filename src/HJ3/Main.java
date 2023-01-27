package HJ3;

import java.util.Scanner;
import java.util.TreeSet;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        TreeSet<Integer> arr = new TreeSet<>();
        for (int i=0;i<num;i++) {
            Integer temp = in.nextInt();
            arr.add(temp);
        }
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}