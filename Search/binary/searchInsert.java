package Search.binary;

public class searchInsert {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 7;

        int left = 0;
        int right = nums.length - 1;
        int index = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            index = mid;
            if (nums[mid] == target) {
                System.out.println(mid);
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            System.out.println(index);
        }
        if (nums[index] < target)
            System.out.println(index + 1);
        else if (nums[index] > target)
            System.out.println(index);
        else
            System.out.println(index);
    }
}
