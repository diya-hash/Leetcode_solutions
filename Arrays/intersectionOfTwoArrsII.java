import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class intersectionOfTwoArrsII {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 1 };

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int k = 0;
        int l1 = nums1.length;
        int l2 = nums2.length;
        while (i < l1 && j < l2) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                nums1[k] = nums2[j];
                i++;
                j++;
                k++;
            }
        }
        int[] result = Arrays.copyOfRange(nums1, 0, k);
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
