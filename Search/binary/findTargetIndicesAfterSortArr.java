package Search.binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findTargetIndicesAfterSortArr {
    public static void main(String[] args) {
        int[] nums = { 48, 90, 9, 21, 31, 35, 19, 69, 29, 52, 100, 54, 21, 86, 6, 45, 42, 5, 62, 77, 15, 38 };
        int target = 6;
        List<Integer> resultList = new ArrayList<Integer>();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int firstIndex = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                firstIndex = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (firstIndex == -1)
            System.out.println(resultList);
        else {
            for (int i = firstIndex; i < nums.length; i++) {
                if (nums[i] == target)
                    resultList.add(i);
            }
        }
        System.out.println(resultList);
    }
}