package easy.array;

import java.util.ArrayList;

public class Arrays1 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        System.out.println(arr.length);
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8}
        };

        //print 1
        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                System.out.print(arr1[row][col]);
            }
            System.out.println();
        }

        //print 2
        for (int[] array : arr1) {
            System.out.println(java.util.Arrays.toString(array));
        }

        //prints only address
        System.out.println(java.util.Arrays.toString(arr1));

        ArrayList<Integer> a = new ArrayList<>();


    }
}