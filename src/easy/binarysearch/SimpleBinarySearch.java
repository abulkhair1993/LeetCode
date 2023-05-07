package easy.binarysearch;

public class SimpleBinarySearch {

    // Assuming that array is sorted in asc
    // fix start and end point
    // calculate middle
    // if target == middle return middle
    // if target < middle element search left side
    // if target > middle element search right side
    // continue untill target == middle or end <= start
    // return -1 if not found
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9};
        int target = 4;
        int ans = binarySearchAsc(arr, target);
        //System.out.println(ans);

        int[] arr1 = {10, 9, 8, 7, 6, 5, 4, 3, 0, -1,};
        int target1 = 0;
        System.out.println(binarySearchDesc(arr1, target1));

    }

    private static int binarySearchAsc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //calculate middle
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    private static int binarySearchDesc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }


}