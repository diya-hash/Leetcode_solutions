package Leetcode_solutions.SlidingWindow;

public class example {

    public static int getSum(int[] arr, int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int currSum = getSum(arr, 0, 4);
        int largestSum = currSum;

        for (int i = 1; i <= arr.length - 5; i++) {
            currSum -= arr[i - 1]; // subtract element to the left of curr window
            currSum += arr[i + 4]; // add last element in curr window
            largestSum = Math.max(largestSum, currSum);
        }
        System.out.println(largestSum);
    }
}
