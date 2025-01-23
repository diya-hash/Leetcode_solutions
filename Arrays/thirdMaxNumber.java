import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class thirdMaxNumber {
    public static void main(String[] args) {
        int[] nums = { 1, 2147483647, -2147483648 };
        long max = Long.MIN_VALUE;
        long sMax = Long.MIN_VALUE;
        long tMax = Long.MIN_VALUE;

        for (int i : nums) {
            if (i > max) {
                sMax = max;
                tMax = sMax;
                max = i;
            } else if (i > sMax) {
                tMax = sMax;
                sMax = i;
            } else {
                tMax = i;
            }
        }
        if (tMax == Long.MIN_VALUE) {
            System.out.println(max);
        } else {
            System.out.println(tMax);
        }
    }
}
