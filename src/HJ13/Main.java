package HJ13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        List<String> words = Arrays.asList(line.split(" "));
        Collections.reverse(words);
        for (int i=0;i<words.size()-1;i++) {
            System.out.print(words.get(i) + " ");
        }
        System.out.print(words.get(words.size()-1));
    }
}