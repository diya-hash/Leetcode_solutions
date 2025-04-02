public class sumOfVariableLengthSubarrays {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 1, 2 };
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = Math.max(0, i - nums[i]);
            for (int j = start; j <= i; j++) {
                sum += nums[j];
            }
        }
        System.out.println(sum);
    }
}