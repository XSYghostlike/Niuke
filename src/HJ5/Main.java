package HJ5;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        Integer result = 0;
        Integer digitPos = 1;
        for (int i=num.length()-1;i>=2;i--) {
            char c = num.charAt(i);
            result = result + hex_process(c) * digitPos;
            digitPos = digitPos * 16;
        }
        System.out.print(result);
    }

    private static int hex_process(char c) {
        if ('0' <= c && c <= '9') {
            return c - '0';
        }
        if ('A' <= c && c <= 'F') {
            return c - 'A' + 10;
        }
        return 0;
    }
}
