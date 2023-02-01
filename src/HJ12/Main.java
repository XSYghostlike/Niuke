package HJ12;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] arr = str.toCharArray();
        for (int i=arr.length-1;i>=0;i--) {
            System.out.print(arr[i]);
        }
    }
}
