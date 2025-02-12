package QuickSort_Select;

public class quicksortExample {
    public static void quickSort(int[] arr, int start, int end) {
        if (end <= start)
            return;
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }

    public static void main(String[] args) {
        int[] nums = { 8, 2, 5, 3, 9, 4, 7, 6, 1 };

        quickSort(nums, 0, nums.length - 1);
        for (int i : nums) {
            System.out.println(i + " ");
        }
    }
}
