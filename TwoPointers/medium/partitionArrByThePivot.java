package medium;

import java.util.ArrayList;

public class partitionArrByThePivot {
    public static void main(String[] args) {
        int[] nums = { 9, 12, 5, 10, 14, 3, 10 };
        int pivot = 10;
        int[] arr = new int[nums.length];
        int l = nums.length;
        int index = 0;
        for (int i = 0; i < l; i++) {
            if (nums[i] < pivot) {
                arr[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < l; i++) {
            if (nums[i] == pivot) {
                arr[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < l; i++) {
            if (nums[i] > pivot) {
                arr[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
