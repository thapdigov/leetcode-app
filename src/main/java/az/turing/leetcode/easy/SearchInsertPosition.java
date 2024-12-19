package az.turing.leetcode.easy;

import java.util.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        //Task 35

        int[] a = {1, 6, 7, 9};
        System.out.println(returnIndex(a, 3));
    }

    public static int returnIndex(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (arr[middle] == target) {
                return middle;
            }
            if (arr[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        arr = Arrays.copyOf(arr, arr.length + 1);
        int insertIndex = left;
        for (int i = arr.length - 1; i > insertIndex; i--) {
            arr[i] = arr[i - 1];
        }
        arr[insertIndex] = target;
        Arrays.sort(arr);
        return insertIndex;
    }
}