package QuickSort_Select;

public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = { 0 };
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
