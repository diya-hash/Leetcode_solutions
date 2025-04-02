public class sumOfVariableLengthSubarrays {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1 };
        int[] prefixsum = new int[nums.length];
        prefixsum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixsum[i] = prefixsum[i - 1] + nums[i];
            System.out.println(prefixsum[i]);
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = Math.max(0, i - nums[i]);
            if (start == 0) {
                sum += prefixsum[i];
            } else {
                sum += prefixsum[i] - prefixsum[start - 1];
            }
        }
        System.out.println(sum);
    }
}