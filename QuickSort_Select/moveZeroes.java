package QuickSort_Select;

public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = { 2, 1 };
        int i = -1;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                i = i + 1;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
