package easy.array;

/**
 * Find maximum
 * Find minimum
 */
public class FindMaxMin {
    public static void main(String[] args) {
        int[] arr = {128, 12, 5, 133, 8, 0, 77};
        int[] arr1 = {33};
        int target = 77;
        System.out.println(searchMax(arr));
    }

    private static int searchMax(int[] arr) {
        int max = 0;
        // return -1 if arr is empty
        if (arr.length < 1) return -1;
        for (int num : arr) {
            if (num > max) max = num;
        }

        return max;
    }


}
