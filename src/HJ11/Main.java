package HJ11;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num == 0) {
            System.out.print(0);
        }
        while (num > 0) {
            System.out.print(num % 10);
            num = num / 10;
        }
    }
}
