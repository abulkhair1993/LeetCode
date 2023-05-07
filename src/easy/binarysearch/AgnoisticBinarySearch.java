package easy.binarysearch;

/**
 * If we don't know if array is sorted in desc or asc order then use agnoistic binary search
 */
public class AgnoisticBinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9};
        int target = 6;
        int ans = agnoBinarySearch(arr, target);
        System.out.println(ans);

        int[] arr1 = {10, 9, 8, 7, 6, 5, 4, 3, 0, -1,};
        int target1 = 0;
        System.out.println(agnoBinarySearch(arr1, target1));

    }

    private static int agnoBinarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        // check if array is asc sorted or desc sorted
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) return mid;
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }
        return -1;
    }
}
