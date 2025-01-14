package SlidingWindow.medium;

class binarySubsWithSum {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 0, 1 };
        int goal = 2;
        int left = 0;
        int right = 0;
        int sum = 0;
        int ans = 0;
        int zeros = 0;
        while (right < nums.length) {
            sum += nums[right];

            while (left < right && (nums[left] == 0 || sum > goal)) {
                if (nums[left] == 0) {
                    zeros++;
                } else {
                    zeros = 0;
                }
                System.out.println("left = " + left + " right = " + right + " zeros = " + zeros + " ans = " + ans);
                sum -= nums[left];
                left++;
            }
            if (sum == goal) {
                ans += 1 + zeros;
            }
            right++;
        }
        System.out.println(ans);
    }
}