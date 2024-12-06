package medium;

public class rearrangeArrElementsBySign {
    public static void main(String[] args) {
        int[] nums = { 3, 1, -2, -5, 2, -4 };
        int j = 0;
        int k = 1;
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                arr[j] = nums[i];
                j += 2;
            } else if (nums[i] < 0) {
                arr[k] = nums[i];
                k += 2;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
