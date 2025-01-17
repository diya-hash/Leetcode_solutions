package Search.binary;

public class binarSearch {

    public static boolean binarySearch(int[] arr, int num, int left, int right) {
        if (left > right)
            return false;
        int mid = (right + left) / 2;
        if (num > arr[mid]) {
            return binarySearch(arr, num, mid + 1, right);
        } else if (num < arr[mid]) {
            return binarySearch(arr, num, left, mid - 1);
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 9, 12, 14, 16, 60 };
        int num = 60;

        boolean isPresent = binarySearch(arr, num, 0, arr.length);
        System.out.println(isPresent);
    }
}
