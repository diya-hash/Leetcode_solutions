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

        if (m == 0 && n > 0) {
            System.out.println("entered m==0 and n>0 condition");
            for (int i = 0; i < nums1.length; i++)
                nums1[i] = nums2[i];
        } else if (m > 0 && n > 0) {
            System.out.println("entered m>0 and n>0 condition");
            while (insert > 0 && left > -1 && right > -1) {
                System.out.println("entered while loop");
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

        }
        if (left < 0) {
            for (int i = 0; i <= insert; i++)
                nums1[i] = nums2[i];
        }

        System.out.println("final result: ");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + "\t");
        }
    }
}
// solution post on
// Leetcode:https://leetcode.com/problems/merge-sorted-array/solutions/6079524/java-solution-using-two-pointers-beats-100