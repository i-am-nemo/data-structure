package datastructure.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountString {
    public static void main(String[] args) {
        String[] strArray = {"apple", "orange", "pineapple", "apple", "coconut", "orange"};
        Map<String, Integer> hm = new HashMap<>();
        System.out.println(Arrays.stream(strArray).count());
    }
}
