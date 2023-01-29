package HJ4;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            while (str.length() >= 8) {
                System.out.print(str.substring(0,8));
                str = str.substring(8);
                if (str.length() != 0) {
                    System.out.print("\n");
                }
            }
            if (! str.equals("")) {
                System.out.print(str);
                for (int i=0;i<8-str.length();i++) {
                    System.out.print("0");
                }
            }
        }
    }
}
