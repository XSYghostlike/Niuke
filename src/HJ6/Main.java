package HJ6;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int curr_div = 2;
        int upper_limit = (int)Math.sqrt(num) + 1;
        while (num > 1 && curr_div < upper_limit) {
            if (num % curr_div == 0) {
                System.out.print(curr_div);
                num = num / curr_div;
                if (num != 1) {
                    System.out.print(" ");
                }
            } else {
                curr_div++;
            }
        }
        if (num != 1) {
            System.out.print(num);
        }
    }
}
