package medium;

public class rearrangeArrElementsBySign {
    public static void main(String[] args) {
        int[] nums = { 3, 1, -2, -5, 2, -4 };
        int j = 0;
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                arr[j] = nums[i];
                j += 2;
                if (j == arr.length - 1) {
                    break;
                }
            }
        }
        j = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                arr[j] = nums[i];
                j += 2;
                if (j == arr.length) {
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
