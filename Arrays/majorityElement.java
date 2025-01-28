import java.util.Arrays;

public class majorityElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3, 2 };
        int count = 0;
        int candidate = 0;

        for (int i : nums) {
            if (count == 0) {
                candidate = i;
            }
            if (candidate == i) {
                count++;
            } else {
                count--;
            }
            System.out.println(i + ": candidate = " + candidate + " count = " + count);
        }
        System.out.println(candidate);
    }
}
