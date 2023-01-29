package HJ2;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char c = in.nextLine().charAt(0);
        int diff = 0;
        if ('a' <= c && c <= 'z') {
            diff = 'A' - 'a';
        }
        if ('A' <= c && c <= 'Z') {
            diff = 'a' - 'A';
        }
        int count = 0;
        for (int i=0;i<str.length();i++) {
            char temp = str.charAt(i);
            if (temp == c || temp == c + diff) {
                count++;
            }
        }
        System.out.print(count);
    }
}
