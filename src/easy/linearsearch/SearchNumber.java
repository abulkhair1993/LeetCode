package easy.linearsearch;

public class SearchNumber {

    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 0, 77};
        int[] arr1 = {33};
        int target = 77;
        //System.out.println(linearSearch(arr,target));
        //System.out.println(linearSearchIndex(arr,target));
        //System.out.println(linearSearchIndex(arr1,target));
        System.out.println(searchInRange(arr, target, 1, 4));
    }

    // find the number and return it
    private static int linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return num;
        }

        return -1;
    }

    //find the number and return index of arr
    private static int linearSearchIndex(int[] arr, int target) {

        if (arr.length < 1) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;

        }

        return -1;
    }

    // Return index if found in the given range otherwise return -1
    private static int searchInRange(int[] arr, int target, int start, int end) {
        if (start > end) return -1;
        if (arr.length < 1) return -1;

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) return i;
        }

        return -1;
    }
}