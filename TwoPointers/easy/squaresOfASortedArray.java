package Leetcode_solutions.TwoPointers;

public class squaresOfASortedArray {

    public static void main(String[] args) {
        int[] nums = { -1 };
        int[] result = new int[nums.length];
        int j = 0;
        if (nums[0] >= 0) {
            for (int i = 0; i < nums.length; i++) {
                result[i] = nums[i] * nums[i];
            }
        } else if (nums[nums.length - 1] <= 0) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right] * nums[right];
                nums[right] = temp * temp;
                left++;
                right--;
            }
            if (left == right) {
                nums[right] = nums[right] * nums[right];
            }
            for (int i = 0; i < nums.length; i++) {
                result[j] = nums[i];
                j++;
            }

        } else {
            // System.out.println("entered last else condiion");
            int left = 0;
            int right = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < 0 && nums[i + 1] >= 0) {
                    left = i;
                    right = i + 1;
                    break;
                }
            }
            // System.out.println("left = " + left + " right = " + right);

            while (left >= 0 || right <= nums.length - 1) {
                // System.out.println("entered while loop");
                nums[left] = Math.abs(nums[left]);
                nums[right] = Math.abs(nums[right]);
                if (nums[left] < nums[right]) {
                    result[j] = nums[left] * nums[left];
                    j++;
                    left--;
                    if (left < 0)
                        break;
                } else if (nums[left] > nums[right]) {
                    result[j] = nums[right] * nums[right];
                    j++;
                    right++;
                    if (right == nums.length)
                        break;
                } else {
                    result[j] = nums[left] * nums[left];
                    j++;
                    result[j] = nums[right] * nums[right];
                    j++;
                    right++;
                    left--;
                    if (right == nums.length || left < 0)
                        break;
                }

                // System.out.println("left = " + left + " right = " + right);
                // for (int i = 0; i < result.length; i++) {
                // System.out.print(result[i] + "\t");
                // }
            }
            if (left == -1 && right < nums.length) {
                // System.out.println("reached left=-1 condition");
                for (int i = right; i < nums.length; i++) {
                    result[j] = nums[i] * nums[i];
                    j++;
                }
            } else {
                // System.out.println("reached right>=nums.length condition");
                for (int i = left; i >= 0; i--) {
                    result[j] = nums[i] * nums[i];
                    j++;
                }
            }

            // System.out.println("left = " + left + " right = " + right);
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "\t");
        }

    }
}
// problem
// link:https://leetcode.com/problems/squares-of-a-sorted-array/description/
// Solution post:
// https://leetcode.com/problems/squares-of-a-sorted-array/solutions/6092242/java-solution-beats-100-two-pointer-solution