package HJ55;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        for (Integer i=1;i<num+1;i++) {
            if (i % 7 == 0) {
                count++;
            } else {
                String str = i.toString();
                if (str.contains("7")) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
