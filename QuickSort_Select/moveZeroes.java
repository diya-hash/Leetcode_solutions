package QuickSort_Select;

public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = { 4, 2, 4, 0, 0, 3, 0, 5, 1, 0 };

        int left = 0;
        int right = 0;
        while (right < nums.length && left < nums.length) {
            while (left < nums.length && nums[left] != 0) {
                left++;
            }
            right = left + 1;
            while (right < nums.length && nums[right] == 0) {
                right++;
                if (right == nums.length)
                    break;
            }
            if (right == nums.length || left == nums.length)
                break;
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
