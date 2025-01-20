package Search.binary;

public class binarySearch {
    public static void main(String[] args) {
        int[] nums = { 2 };
        int target = 5;

        int result = -1;
        int left = 0;
        int right = nums.length - 1;

        if (nums.length == 1 && nums[0] == target) {
            System.out.println(0);// return stmt
        } else if (nums.length == 1 && nums[0] != target) {
            System.out.println(-1);// return stmt
        }
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                result = mid;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        System.out.println(result);
    }
}
