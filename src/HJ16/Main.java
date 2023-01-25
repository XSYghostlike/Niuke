package HJ16;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first_line = in.nextLine();
        String[] first_line_arr = first_line.split(" ");
        int total_cash = Integer.parseInt(first_line_arr[0]);
        int total_items = Integer.parseInt(first_line_arr[1]);
        String[] lines = new String[total_items];
        int[] item_c = new int[total_items];
        int[] item_w = new int[total_items];
        int[] og_index = new int[total_items];
        int[][][] att = new int[total_items][2][2];

        int m = 0;
        for (int i=0;i<total_items;i++) {
            lines[i] = in.nextLine();
            String[] line_arr = lines[i].split(" ");
            if ("0".equals(line_arr[2])) {
                item_c[m] = Integer.parseInt(line_arr[0]);
                item_w[m] = Integer.parseInt(line_arr[1]);
                og_index[i] = m;
                m++;
            }
        }
        for (int i=0;i<total_items;i++) {
            String[] line_arr = lines[i].split(" ");
            if (! "0".equals(line_arr[2])) {
                int main_index = og_index[Integer.parseInt(line_arr[2]) - 1];
                if (att[main_index][0][0] == 0) {
                    att[main_index][0][0] = Integer.parseInt(line_arr[0]);
                    att[main_index][0][1] = Integer.parseInt(line_arr[1]);
                } else {
                    att[main_index][1][0] = Integer.parseInt(line_arr[0]);
                    att[main_index][1][1] = Integer.parseInt(line_arr[1]);
                }
            }
        }

        //System.out.println(Arrays.toString(item_c));
        //System.out.println(Arrays.toString(item_w));
        //System.out.println(Arrays.deepToString(att));

        int[][] dp = new int[m][total_cash+1];
        for (int i=0;i<=total_cash;i++) {
            if (i < item_c[0]) {
                dp[0][i] = 0;
            } else {
                dp[0][i] = item_c[0] * item_w[0];
            }
        }

        for (int i=0;i<m;i++) {
            for (int j=0;j<=total_cash;j++) {
                int no_i = i-1;
                int no_j = j;
                int last_iteration = 0;
                if (no_i >= 0) {
                    last_iteration = dp[no_i][no_j];
                }
                int no_op = last_iteration;

                int main_i = i-1;
                int main_j = j - item_c[i];
                int main_op = 0;
                last_iteration = 0;
                if (main_i >= 0 && main_j > 0) {
                    last_iteration = dp[main_i][main_j];
                }
                if (main_j >= 0) {
                    main_op = last_iteration + item_c[i] * item_w[i];
                }

                int main_att1_op = 0;
                if (att[i][0][0] != 0) {
                    int main_att1_i = i-1;
                    int main_att1_j = j - item_c[i] - att[i][0][0];
                    last_iteration = 0;
                    if (main_att1_i >= 0 && main_att1_j >= 0) {
                        last_iteration = dp[main_att1_i][main_att1_j];
                    }
                    if (main_att1_j >= 0) {
                        main_att1_op = last_iteration + item_c[i] * item_w[i] + att[i][0][0] * att[i][0][1];
                    }
                }

                int main_att2_op = 0;
                if (att[i][1][0] != 0) {
                    int main_att2_i = i-1;
                    int main_att2_j = j - item_c[i] - att[i][1][0];
                    last_iteration = 0;
                    if (main_att2_i >= 0 && main_att2_j >= 0) {
                        last_iteration = dp[main_att2_i][main_att2_j];
                    }
                    if (main_att2_j >= 0) {
                        main_att2_op = last_iteration + item_c[i] * item_w[i] + att[i][1][0] * att[i][1][1];
                    }
                }

                int main_att12_op = 0;
                if (att[i][1][0] != 0) {
                    int main_att12_i = i-1;
                    int main_att12_j = j - item_c[i] - att[i][0][0] - att[i][1][0];
                    last_iteration = 0;
                    if (main_att12_i >= 0 && main_att12_j >= 0) {
                        last_iteration = dp[main_att12_i][main_att12_j];
                    }
                    if (main_att12_j >= 0) {
                        main_att12_op = last_iteration + item_c[i] * item_w[i] + att[i][0][0] * att[i][0][1] + att[i][1][0] * att[i][1][1];
                    }
                }
                dp[i][j] = Math.max(no_op, Math.max(main_op, Math.max(main_att1_op, Math.max(main_att2_op, main_att12_op))));
                //System.out.println(dp[i][j]);
            }
        }
        System.out.print(dp[m-1][total_cash]);
    }
}