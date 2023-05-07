package easy.linearsearch;

import java.util.Arrays;

/**
 * Perform linear search to find number from 2 d array
 */
public class LinearSearch2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 13, 45},
                {88, 99, 55},
                {45, 545, 4656}
        };
        int target = 2222;

        System.out.println(linearSearch(arr, target));
        System.out.println(Arrays.toString(linearSearchIndex(arr, target)));


    }

    private static String linearSearch(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) return "Found";
            }

        }
        return "Not Found";
    }

    private static int[] linearSearchIndex(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) return new int[]{i, j};

            }
        }
        return new int[]{-1, -1};
    }
}