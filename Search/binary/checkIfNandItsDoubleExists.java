package Search.binary;

import java.util.Arrays;

public class checkIfNandItsDoubleExists {
    static boolean binarySearch(int[] arr, int target, int position) {
        int left = 0;
        int right = arr.length - 1;
        boolean isTrue = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target && mid != position) {
                isTrue = true;
                break;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return isTrue;
    }

    public static void main(String[] args) {

        int[] arr = { -16, -13, 8 };
        Arrays.sort(arr);
        boolean isTrue = false;
        for (int i = 0; i < arr.length; i++) {
            if (binarySearch(arr, arr[i] * 2, i)) {
                isTrue = true;
            }
        }
        System.out.println(isTrue);
    }
}
// -16, -13, 8