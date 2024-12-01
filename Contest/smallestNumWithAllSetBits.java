package Leetcode_solutions.Contest;

public class smallestNumWithAllSetBits {
    public static void main(String[] args) {
        int n = 3;

        while (true) {
            String s = Integer.toBinaryString(n);
            boolean isSet = true;
            for (char c : s.toCharArray()) {
                if (c != '1') {
                    isSet = false;
                    break;
                }
            }
            if (isSet == true)
                break;
            else
                n++;
        }
        System.out.println(n);

        // while (n > 0) {
        // count += n & 1;
        // System.out.println(n + "\t count " + count + " n&1 = " + (n & 1));
        // System.out.println(Integer.toBinaryString(n));
        // n >>= 1;
        // }
        // System.out.println(count);

    }
}