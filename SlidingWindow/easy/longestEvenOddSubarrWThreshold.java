package SlidingWindow.easy;

public class longestEvenOddSubarrWThreshold {
    public static void main(String[] args) {
        int[] nums = { 2, 2 };
        int threshold = 4;
        int left = 0;
        int right = 0;
        int count = 0;
        int len = nums.length;
        int max = 0;

        while (left < len) {
            count = 0;
            while (left < len && nums[left] % 2 == 0 && nums[left] <= threshold) {
                count = 1;
                right = left + 1;
                while (right < len && nums[right] <= threshold && nums[right - 1] % 2 != nums[right] % 2) {
                    right++;
                    count++;
                }
                max = Math.max(count, max);
                left++;
            }
            left++;
        }
        System.out.println(max);
    }
}
