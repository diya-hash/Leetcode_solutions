package PrefixSum;

public class prefixSum {
    // implementation-1: Requires extra space
    // public static void main(String[] args) {
    // int[] arr = { 1, 2, 3, 4, 5 };
    // int[] prefixsum = new int[arr.length];
    // prefixsum[0] = arr[0];
    // for (int i = 1; i < arr.length; i++) {
    // prefixsum[i] = prefixsum[i - 1] + arr[i];
    // System.out.println(prefixsum[i] + " ");
    // }
    // }

    // implementation-2: The sum takes in place meaning no extra psce is required
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
            System.out.println(arr[i] + " ");
        }
    }
}