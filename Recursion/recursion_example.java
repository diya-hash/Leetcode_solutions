package Recursion;

public class recursion_example {

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static boolean checkPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1)
            return true;
        else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            System.out.println(s.substring(1, s.length() - 1));
            return checkPalindrome(s.substring(1, s.length() - 1));
        } else {
            return false;
        }

    }

    public static String reverseString(String s) {
        if (s.equals(""))
            return "";
        else {
            System.out.println(s.substring(0, s.length() - 1));
            return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
        }
    }

    public static String findBinary(int n, String result) {
        if (n == 0)
            return result;
        else {
            result = n % 2 + result;
            return findBinary(n / 2, result);
        }
    }

    public static boolean binarySearch(int[] arr, int left, int right, int x) {
        System.out.println("left = " + left + " right = " + right);
        if (left > right)
            return false;
        int mid = (left + right) / 2;
        // System.out.println("left = " + left + " right = " + right + " mid = " + mid);
        if (arr[mid] > x) {
            return binarySearch(arr, left, mid - 1, x);
        } else if (arr[mid] < x) {
            return binarySearch(arr, mid + 1, right, x);
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int sum_output = sum(n);
        System.out.println(sum_output);
        int fact_output = factorial(5);
        System.out.println(fact_output);
        int fib_output = fib(6);
        System.out.println("fib output: " + fib_output);
        boolean isPalindrome = checkPalindrome("racecar");
        System.out.println(isPalindrome);
        System.out.println(reverseString("hello"));
        System.out.println(findBinary(233, ""));
        int[] arr = { -1, 0, 1, 2, 3, 4, 7, 9, 10, 20 };
        System.out.println(binarySearch(arr, 0, arr.length - 1, 11));
    }
}
