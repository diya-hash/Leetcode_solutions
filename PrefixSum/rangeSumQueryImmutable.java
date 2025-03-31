package PrefixSum;

public class rangeSumQueryImmutable {
    int[] prefixsum;

    public rangeSumQueryImmutable(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        this.prefixsum = nums;
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefixsum[right];
        }
        return prefixsum[right] - prefixsum[left - 1];
    }

    public static void main(String[] args) {
        int[] arr = { -2, 0, 3, -5, 2, -1 };
        rangeSumQueryImmutable obj = new rangeSumQueryImmutable(arr);
        System.out.println(obj.sumRange(0, 5));

    }
}
