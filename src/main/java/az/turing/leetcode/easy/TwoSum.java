package az.turing.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) throws Exception {
        //Task 1

        int[] array = {5, 4, 6, 9};
        System.out.println(Arrays.toString(twoSumWithFor(array, 10)));
        int[] array2 = {1, 10, 7, 4};
        System.out.println(Arrays.toString(twoSumWithMap(array2, 11)));
    }

    public static int[] twoSumWithFor(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("Element not found into array");
    }

    public static int[] twoSumWithMap(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(array[i], i);
        }
        throw new IllegalArgumentException("Element not found into array");
    }
}
