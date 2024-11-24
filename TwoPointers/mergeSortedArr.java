package Leetcode_solutions.TwoPointers;

public class mergeSortedArr {
    public static void main(String[] args) {
        int[] nums1 = { 2, 0 };
        int[] nums2 = { 1 };
        int m = 1;
        int n = 1;
        int left = m - 1;
        int right = n - 1;
        int insert = nums1.length - 1;
        System.out.println(insert);

        if (insert == 0 && m == 0) {
            nums1[0] = nums2[0];
        }

        while (insert > 0 && n != 0) {
            System.out.println("entered while loop");
            if (left < 0 && right >= 0) {
                System.out.println("entered special if");
                for (int i = 0; i <= right; i++) {
                    nums1[i] = nums2[i];
                }
                break;
            }
            if (nums1[left] >= nums2[right]) {
                nums1[insert] = nums1[left];
                left--;
                insert--;
            } else if (nums1[left] < nums2[right]) {
                nums1[insert] = nums2[right];
                right--;
                insert--;
                if (right == -1)
                    break;
            }

            System.out.println("right = " + right + " left = " + left + " insert = " +
                    insert);
            for (int j = 0; j < nums1.length; j++) {
                System.out.print(nums1[j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("final result: ");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + "\t");
        }
    }
}
