package HJ1;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] arr = line.split(" ");
        System.out.print(arr[arr.length-1].length());
    }
}
