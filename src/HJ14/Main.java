package HJ14;

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        List<String> arr = new ArrayList<>();
        for (int i=0;i<num;i++) {
            arr.add(in.nextLine());
        }
        for (String str : recursiveSort(arr)) {
            System.out.println(str);
        }
    }

    private static String[] recursiveSort(List<String> input) {
        Map<String, List<String>> table = new TreeMap<>();
        String[] result = new String[input.size()];
        int curr_index = 0;
        for (String str : input) {
            if (str.equals("")) {
                result[curr_index] = "";
                curr_index++;
            } else {
                String prefix = str.substring(0, 1);
                String rest = str.substring(1);
                if (table.containsKey(prefix)) {
                    table.get(prefix).add(rest);
                } else {
                    List<String> newList = new ArrayList<>();
                    newList.add(rest);
                    table.put(prefix, newList);
                }
            }
        }
        for (Map.Entry<String, List<String>> kv : table.entrySet()) {
            if (kv.getValue().size() == 1) {
                result[curr_index] = kv.getKey() + kv.getValue().get(0);
                curr_index++;
            } else {
                for (String sub_str : recursiveSort(kv.getValue())) {
                    result[curr_index] = kv.getKey() + sub_str;
                    curr_index++;
                }
            }
        }
        return result;
    }
}
