package HJ24;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = in.nextInt();
        Integer[] arr = new Integer[total];
        Integer[] left_max = new Integer[total];
        Integer[] right_max = new Integer[total];
        Integer[] center_pos_max = new Integer[total];
        Integer result = total;

        for (int i=0; i<total; i++) {
            arr[i] = in.nextInt();
        }

        left_max[0] = 1;
        for (int i=1; i<total; i++) {
            Integer temp_left_max = 0;
            for (int j=0; j<i; j++) {
                if ((arr[j] < arr[i]) && (left_max[j] > temp_left_max)) {
                    temp_left_max = left_max[j];
                }
            }
            left_max[i] = temp_left_max + 1;
        }

        right_max[total-1] = 1;
        for (int i=total-2; i>=0; i--) {
            Integer temp_right_max = 0;
            for (int j=total-1; j>i; j--) {
                if ((arr[j] < arr[i]) && (right_max[j] > temp_right_max)) {
                    temp_right_max = right_max[j];
                }
            }
            right_max[i] = temp_right_max + 1;
        }

        for (int i=0; i<total; i++) {
            center_pos_max[i] = left_max[i] + right_max[i] - 1;
            if (total - center_pos_max[i] < result) {
                result = total - center_pos_max[i];
            }
        }
        System.out.print(result);
    }
}