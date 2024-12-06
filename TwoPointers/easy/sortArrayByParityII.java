package easy;

public class sortArrayByParityII {
    public static void main(String[] args) {
        int[] nums = { 4, 2, 5, 7 };
        int left = 0;
        int right = 1;

        while (left != nums.length && right >= 0) {
            while (left != nums.length && right >= 0 && nums[left] % 2 == 0) {
                left += 2;
            }
            if (left >= nums.length)
                break;
            // System.out.println(left + " odd: " + nums[left]);
            while (left != nums.length && right >= 0 && nums[right] % 2 != 0) {
                right += 2;
            }
            if (right < 0)
                break;
            // System.out.println(right + " even: " + nums[right]);
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left += 2;
            right += 2;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
