package SlidingWindow.medium;

import java.util.ArrayList;
import java.util.HashMap;

public class countNumOfNiceSubArrs {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 1, 2, 4, 1, 8 };
        int k = 3;

        int n = nums.length;
        int niceSubs = 0;
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        int oddCount = 0;
        int left = 0;
        int right = 0;
        ArrayList<Integer> odds = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                arr[i] = 1;
                odds.add(i);
            }
            if (oddCount < k && arr[i] == 1) {
                oddCount += arr[i];
                if (oddCount == 1 && left == 0)
                    left = i;
                right = i;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("oddCount = " + oddCount + " left = " + left + " right = " + right);
        System.out.println(odds);
        if (oddCount == 0) {
            System.out.println(0); // return oddCount;
        } else {
            niceSubs = left - 0 + 1;
            map.put(right, niceSubs);
            int i = 0;
            int m = right;
            right++;
            while (right < nums.length) {
                if (arr[right] == 0) {
                    niceSubs += map.get(m);
                    System.out.println("EVEN: left = " + left + " right = " + right + "map = " + map.get(m)
                            + " nicesubs = " + niceSubs);
                } else {
                    i++;
                    left = odds.get(i);
                    niceSubs += left - odds.get(i - 1);
                    map.put(right, left - odds.get(i - 1));
                    m = right;
                    System.out.println(
                            "ODD: left = " + left + " right = " + right + " nicesubstring = " + niceSubs);
                }

                right++;
            }
        }
        System.out.println(niceSubs);
    }
}
// 2,2,2,1,2,2,1,2,2,2; k=2;
// 1, 1, 2, 1, 1; k = 3
// 1,1,2,1,2,4,1,8 ; k = 3