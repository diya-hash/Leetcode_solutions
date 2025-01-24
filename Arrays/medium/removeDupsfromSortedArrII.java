package medium;

public class removeDupsfromSortedArrII {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        int count = 1;
        int dup = 0;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
                if (count <= 2) {
                    k++;
                }
                if (dup > 1 && count <= 2) {
                    nums[dup] = nums[i];
                    dup++;
                    System.out.println(dup);
                }
                if (count == 3 && dup <= 1) {
                    dup = i;
                    System.out.println("dup = " + dup);
                }
            } else if (nums[i] != nums[i - 1] && count > 2) {
                count = 1;
                k++;
                nums[dup] = nums[i];
                dup = dup + 1;
                System.out.println("dup = " + dup);

            } else if (nums[i] != nums[i - 1] && count <= 2) {
                count = 1;
                k++;
                System.out.println(i);
                if (dup > 1) {
                    nums[dup] = nums[i];
                    dup++;
                    System.out.println("dup = " + dup);
                }
            }
        }
        System.out.println("k = " + k);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}