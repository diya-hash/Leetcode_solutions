public class neitherMinNorMax {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1 };
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        long n = -1;

        if (nums.length <= 1) {
            System.out.println(-1);
        } else {
            for (int i : nums) {
                if (i > max) {
                    max = i;
                }
                if (i < min) {
                    min = i;
                }
            }
        }
        for (int i : nums) {
            if (i != min && i != max) {
                n = i;
                break;
            }
        }
        System.out.println(n);
    }
}
