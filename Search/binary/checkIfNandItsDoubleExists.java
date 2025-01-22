package Search.binary;

import java.util.Arrays;

public class checkIfNandItsDoubleExists {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 7, 11 };
        int n = arr.length;
        Arrays.sort(arr);
        boolean isTrue = false;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                continue;
            } else {
                int target = arr[i] / 2;
                int left = 0;
                int right = n - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (arr[mid] == target && mid != i) {
                        isTrue = true;
                        break;
                    } else if (arr[mid] > target) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
            }
            if (isTrue == true)
                break;
        }
        System.out.println(isTrue);
    }
}
// -16, -13, 8