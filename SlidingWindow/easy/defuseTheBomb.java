package SlidingWindow.easy;

import java.util.Arrays;

public class defuseTheBomb {
    public static void main(String[] args) {
        int[] code = { 5, 7, 1, 4 };
        int k = 3;
        int sum = 0;
        int[] result = new int[code.length];
        if (k > 0) {
            for (int i = 1; i <= k; i++) {
                sum += code[i];
            }
            result[0] = sum;
            int left = 1;
            int right = k + 1;
            if (right >= code.length) {
                right = right % code.length;
            }
            int j = 1;
            while (left < code.length) {
                sum = sum - code[left] + code[right];
                left++;
                right++;
                if (right >= code.length) {
                    right = right % code.length;
                }
                result[j] = sum;
                j++;
            }
        } else if (k == 0) {
            Arrays.fill(code, 0);
        } else {
            int count = 1;
            k = Math.abs(k);
            int i = code.length - 1;
            while (count <= k) {
                sum += code[i];
                i--;
                count++;
            }
            int left = (code.length - 1) - (k - 1);
            if (left >= code.length)
                left = left % code.length;
            int right = 0;
            int j = 1;
            result[0] = sum;
            while (j < code.length) {
                sum = sum - code[left] + code[right];
                left++;
                right++;
                if (left >= code.length)
                    left = left % code.length;
                result[j] = sum;
                j++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
